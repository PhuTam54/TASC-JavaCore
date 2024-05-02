package Thread;

public class Main {
    public static void main(String[] args) {
        // Synchronous
        System.out.println("Task 1 Synchronous");
        System.out.println("Task 2 Synchronous");
        System.out.println("Task 3 Synchronous");

        System.out.println("--------------------");
        // Asynchronous
        System.out.println("Task 1 Asynchronous");
        new Thread(() -> {
            System.out.println("Task 2 Asynchronous");
        }).start();
        System.out.println("Task 3 Asynchronous");

        // Extend Thread
        MyExtendThread extendThread = new MyExtendThread();
        extendThread.start();

        // Implement Runnable
        Thread runableThread = new Thread(new MyRunnableThread());
        runableThread.start();

        // Lambda Runnable
        Runnable runnable = () -> {
            System.out.println("Lambda Runnable is running");
        };

        Thread lambdaThread = new Thread(runnable);
        lambdaThread.start();

        // Multi-threading
        Thread thread1 = new Thread(() -> {
            synchronizedMethod();
            for (int i = 0; i < 5; i++) {
                System.out.println("Thread 1 is running: " + i);
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    System.out.println("Thread has been interrupted");
                }
            }
        });

        Thread thread2 = new Thread(() -> {
            synchronizedMethod();
            for (int i = 0; i < 5; i++) {
                System.out.println("Thread 2 is running: " + i);
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    System.out.println("Thread has been interrupted");
                }
            }
        });

        thread1.start();
        thread2.start();

        // Check if threads are alive
        System.out.println("Is Thread 1 alive? " + thread1.isAlive());
        System.out.println("Is Thread 2 alive? " + thread2.isAlive());

        // Wait for threads to finish
        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted");
        }

        // Check again if threads are alive
        System.out.println("Is Thread 1 alive? " + thread1.isAlive());
        System.out.println("Is Thread 2 alive? " + thread2.isAlive());

        System.out.println("Main thread finished");
    }

    public static synchronized void synchronizedMethod() {
        System.out.println("Synchronized method");
        // Code here will be accessed by one thread at a time
    }

    public void synchronizedBlockCodeMethod() {
        synchronized(this) {
            // Code here will be accessed by one thread at a time
        }
    }

    static class MyExtendThread extends Thread {
        public void run() {
            System.out.println("MyExtendThread is running");
        }
    }

    static class MyRunnableThread implements Runnable {
        public void run() {
            System.out.println("MyRunnableThread is running");
        }
    }
}
