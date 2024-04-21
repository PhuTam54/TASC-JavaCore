package OOP;

public class Main {
    public static void main(String[] args) {
        class Car {
            protected String color;
            private String brand;
            private String model;

            public void drive(String brand) {
                System.out.println("The car " + brand + " is driving.");
            }

            public void brake() {
                System.out.println("The car is braking.");
            }
        }

        Car myCar = new Car();
        myCar.brand = "Mercedes Benz";
        myCar.drive(myCar.brand);

        class Animal {
            public void sound() {
                System.out.println("The animal makes a sound");
            }
        }

        class Cat extends Animal {
            @Override
            public void sound() {
                System.out.println("The cat meows");
            }
        }

        class Dog {
            public void bark() {
                System.out.println("The dog barks");
            }

            public void bark(int times) {
                for (int i = 0; i < times; i++) {
                    System.out.println("The dog barks " + (i + 1));
                }
            }
        }

        Cat myCat = new Cat();
        myCat.sound();
        Dog myDog = new Dog();
        myDog.bark(3);

        class ParentClass {
            public final void finalMethod() {
                System.out.println("This is a final method from ParentClass.");
            }
        }

        class ChildClass extends ParentClass {
            // @Override
            // public void finalMethod() {
            //     System.out.println("Trying to override a final method.");
            // }
        }

        class MyClassHaveContructor {
            private int x;

            public MyClassHaveContructor(int x) {
                this.x = x;
            }

            public void printX() {
                System.out.println(this.x);
            }
        }

        class ParentClassHaveSuper {
            protected int x;

            public ParentClassHaveSuper(int x) {
                this.x = x;
            }
        }

        class ChildClassUsingSuper extends ParentClassHaveSuper {
            private int y;

            public ChildClassUsingSuper(int x, int y) {
                super(x);
                this.y = y;
            }

            public void printX() {
                System.out.println(super.x);
            }
        }
    }
}