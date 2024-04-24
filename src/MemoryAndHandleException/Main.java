package MemoryAndHandleException;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    static int x = 10; // Biến toàn cục, cấp phát tĩnh
    public static void main(String[] args) throws IOException {
        int y = 20; // Biến cục bộ, cấp phát tĩnh

        int[] arr = new int[10]; // Mảng arr được cấp phát động
        arr = null; // Giải phóng bộ nhớ đã cấp phát cho arr

        throwsMethod(-2);
//        MyCustomException exception = new MyCustomException("Error");
    }

    public void throwMethod(int x) {
        if (x < 0) {
            throw new IllegalArgumentException("x must be positive");
        }
    }

    public static void throwsMethod(int x) throws IllegalArgumentException, IOException {
        if (x < 0) {
            throw new IllegalArgumentException("x must be positive");
        }

        try {
            throw new NullPointerException();
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
        }

        try (BufferedReader reader = new BufferedReader(new FileReader("file.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }

    public class MyCustomException extends Exception {
        public MyCustomException(String message) {
            super(message);
        }
    }
}
