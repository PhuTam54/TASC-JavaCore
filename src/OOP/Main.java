package OOP;

public class Main {
    public static void main(String[] args) {
        ////////////////// - Nêu ra các tính chất quan trọng của hướng đối tượng  ///////////////////////////////////////
        //Hướng đối tượng (Object-Oriented Programming - OOP) là một phương pháp lập trình mà trong đó, chương trình được tổ chức dựa trên các đối tượng và dữ liệu thay vì hàm và logic. OOP có bốn tính chất quan trọng:
        //
        //1. **Tính đóng gói (Encapsulation)**: Tính đóng gói là cách để che dấu dữ liệu và phương thức làm việc với dữ liệu đó từ bên ngoài. Trong Java, bạn có thể sử dụng các từ khóa `private`, `protected`, và `public` để kiểm soát quyền truy cập.
        //
        //2. **Tính kế thừa (Inheritance)**: Tính kế thừa cho phép một lớp kế thừa các thuộc tính và phương thức của một lớp khác. Lớp kế thừa được gọi là lớp con, và lớp được kế thừa được gọi là lớp cha.
        //
        //3. **Tính đa hình (Polymorphism)**: Tính đa hình cho phép một đối tượng hoạt động như một đối tượng của một lớp khác. Điều này có thể được thực hiện thông qua việc ghi đè phương thức (method overriding) hoặc ép kiểu đối tượng (type casting).
        //
        //4. **Tính trừu tượng (Abstraction)**: Tính trừu tượng là quá trình tạo ra một lớp trừu tượng bằng cách định nghĩa các thuộc tính và phương thức cơ bản mà một lớp cần phải có, nhưng để cho lớp con xác định cách thực hiện các phương thức đó. Trong Java, tính trừu tượng được thực hiện thông qua các lớp trừu tượng (abstract class) và giao diện (interface).

        ////////////////// - Access modifier trong java có những loại nào ? Nêu đặc điểm của từng loại ///////////////////////////////////////
        //Trong Java, có bốn loại access modifier:
        //
        //1. `private`: Chỉ có thể truy cập từ bên trong lớp chứa nó. Điều này có nghĩa là chỉ các phương thức trong cùng một lớp có thể truy cập các thành phần `private`.
        //
        //2. `default` (không sử dụng modifier): Có thể truy cập từ bên trong lớp chứa nó và từ các lớp khác trong cùng một package. Điều này có nghĩa là các lớp trong cùng một package có thể truy cập các thành phần `default`.
        //
        //3. `protected`: Có thể truy cập từ bên trong lớp chứa nó, từ các lớp khác trong cùng một package, và từ các lớp con của lớp chứa nó, kể cả khi chúng nằm trong các package khác nhau.
        //
        //4. `public`: Có thể truy cập từ bất kỳ đâu, bao gồm các lớp trong cùng một package, các lớp trong các package khác, và các lớp con không phụ thuộc vào package.

        ////////////////- Phân biệt class và instance ///////////////////////////////////////
        // Class: khuôn mẫu để sinh ra đối tượng
        // Instance: đối tượng được tạo ra từ class (định danh, thuộc tính, phương thức)
        //Trong lập trình hướng đối tượng, `class` và `instance` là hai khái niệm cơ bản:
        //
        //1. `Class`: Được xem như là một khuôn mẫu (template) để tạo ra các đối tượng. Nó định nghĩa một nhóm các đối tượng có chung các thuộc tính (đặc điểm) và phương thức (hành vi). Ví dụ, bạn có thể tạo một `class` tên là `Car` với các thuộc tính như `color`, `brand`, `model` và các phương thức như `drive()`, `brake()`.
        //
        //```java
        class Car {
            // Thuộc tính
            protected String color;
            private String brand;
            private String model;

            // Phương thức
            public void drive(String brand) {
                System.out.println("The car " + brand +" is driving.");
            }

            public void brake() {
                System.out.println("The car is braking.");
            }
        }
        //```
        //
        //2. `Instance`: Là một thực thể cụ thể của một `class`. Khi bạn tạo một `instance` của một `class`, bạn đang tạo một đối tượng cụ thể dựa trên khuôn mẫu của `class` đó. Mỗi `instance` có thể có các giá trị khác nhau cho các thuộc tính được định nghĩa trong `class`.
        //
        //```java
        Car myCar = new Car(); // myCar là một instance của class Car
        myCar.brand = "Mercedes Benz";
        myCar.drive(myCar.brand);
        //```
        //
        //Trong ví dụ trên, `myCar` là một `instance` của `class` `Car`. Bạn có thể thiết lập các thuộc tính và gọi các phương thức của `myCar` dựa trên những gì đã được định nghĩa trong `class` `Car`.

        //////////////////- Phân biệt Abstract và Interface , Nêu trường hợp sử dụng cụ thể ///////////////////////////////////////
        //Trong Java, `Abstract` và `Interface` đều là cách để tạo ra các lớp và phương thức trừu tượng. Tuy nhiên, chúng có một số khác biệt quan trọng:
        //
        //1. `Abstract`:
        //   - Một lớp `abstract` có thể chứa cả phương thức trừu tượng (không có phần thân) và phương thức không trừu tượng (có phần thân).
        //   - Một lớp chỉ có thể kế thừa từ một lớp `abstract` duy nhất.
        //   - Lớp `abstract` có thể chứa các biến thành viên (instance variables).
        //   - Lớp `abstract` có thể chứa các constructor.
        //   - Lớp `abstract` có thể chứa các phương thức `static`, `final`, `public`, `private`, `protected`.
        //
        //2. `Interface`:
        //   - Một `interface` chỉ có thể chứa phương thức trừu tượng. Từ Java 8 trở đi, `interface` cũng có thể chứa phương thức `default` và `static` có phần thân.
        //   - Một lớp có thể triển khai (implement) nhiều `interface`.
        //   - `Interface` không thể chứa biến thành viên. Tuy nhiên, nó có thể chứa các hằng số (biến `static final`).
        //   - `Interface` không thể chứa constructor.
        //   - Tất cả các phương thức trong `interface` đều mặc định là `public`.
        //
        //Trường hợp sử dụng cụ thể:
        //
        //- Sử dụng `Abstract` khi bạn muốn tạo một lớp cơ sở mà các lớp khác có thể kế thừa từ đó, và lớp cơ sở đó có một số phương thức mà bạn muốn cung cấp cài đặt mặc định.
        //
        //- Sử dụng `Interface` khi bạn muốn tạo một "hợp đồng" mà các lớp khác phải tuân theo, hoặc khi bạn muốn cho phép một lớp tuân theo nhiều "hợp đồng".

        //////////////////- Thế nào là Overriding và Overloading ///////////////////////////////////////
        //Trong Java, `Overriding` và `Overloading` là hai khái niệm quan trọng liên quan đến phương thức:
        //
        //1. `Overriding`:
        //   - Overriding xảy ra khi một lớp con cung cấp một cài đặt cụ thể cho một phương thức đã được định nghĩa trong lớp cha của nó.
        //   - Phương thức trong lớp con phải có cùng tên, cùng kiểu trả về và cùng danh sách tham số với phương thức trong lớp cha.
        //   - Overriding được sử dụng để cung cấp hành vi cụ thể cho phương thức đã được định nghĩa trong lớp cha.
        //
        //2. `Overloading`:
        //   - Overloading xảy ra khi hai hoặc nhiều phương thức trong cùng một lớp có cùng tên nhưng có số lượng hoặc kiểu tham số khác nhau.
        //   - Overloading có thể được sử dụng để định nghĩa nhiều cách để thực hiện một hành động tương tự nhưng với các tham số khác nhau.
        //
        //Ví dụ về Overriding và Overloading:
        //
        class Animal {
            public void sound() {
                System.out.println("The animal makes a sound");
            }
        }

        class Cat extends Animal {
            // Overriding the sound method in Animal class
            @Override
            public void sound() {
                System.out.println("The cat meows");
            }
        }

        class Dog {
            // Overloading the bark method
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

        //////////////////- Một function có access modifier là private or static có thể overriding được không? ///////////////////////////////////////
        //Không, một phương thức có access modifier là `private` hoặc `static` không thể được ghi đè (overriding) trong Java.
        //
        //1. `private`: Phương thức `private` chỉ có thể truy cập trong cùng một lớp. Do đó, lớp con không thể truy cập hoặc ghi đè phương thức `private` từ lớp cha.
        //
        //2. `static`: Phương thức `static` không phải là một phần của đối tượng, mà là một phần của lớp. Do đó, phương thức `static` không thể được ghi đè. Tuy nhiên, phương thức `static` có thể được "ẩn" trong lớp con nếu lớp con định nghĩa một phương thức `static` khác với cùng tên và cùng tham số.

        //////////////////- Một phương thức final có thể kế thừa được  không ? ///////////////////////////////////////
        //Có, một phương thức `final` có thể được kế thừa trong Java. Tuy nhiên, bạn không thể ghi đè (overriding) một phương thức `final` trong lớp con.
        //
        //Khi bạn đánh dấu một phương thức là `final`, bạn đang nói với Java rằng phương thức đó không thể được thay đổi nữa, nghĩa là không có lớp con nào có thể ghi đè phương thức đó.
        //
        //Dưới đây là một ví dụ minh họa:
        //
        class ParentClass {
            public final void finalMethod() {
                System.out.println("This is a final method from ParentClass.");
            }
        }

        class ChildClass extends ParentClass {
            // This would cause a compile error
            // @Override
            // public void finalMethod() {
            //     System.out.println("Trying to override a final method.");
            // }
        }
        //
        //Trong ví dụ trên, `finalMethod` trong `ParentClass` được đánh dấu là `final`, nên không thể ghi đè trong `ChildClass`. Nếu bạn cố gắng ghi đè phương thức `final`, trình biên dịch Java sẽ báo lỗi.

        //////////////////- Phân biệt hai từ khóa This và Super ///////////////////////////////////////
        //Trong Java, `this` và `super` là hai từ khóa quan trọng:
        //
        //1. `this`: Từ khóa `this` được sử dụng để tham chiếu đến đối tượng hiện tại, nghĩa là nó trỏ đến instance của lớp hiện tại. `this` có thể được sử dụng để:
        //
        //   - Tham chiếu đến thuộc tính của lớp hiện tại.
        //   - Gọi phương thức của lớp hiện tại.
        //   - Gọi constructor của lớp hiện tại.
        //
        //Ví dụ về sử dụng `this`:
        //
        //```java
        class MyClassHaveContructor {
            private int x;

            public MyClassHaveContructor(int x) {
                this.x = x; // 'this' tham chiếu đến thuộc tính 'x' của lớp hiện tại
            }

            public void printX() {
                System.out.println(this.x); // 'this' tham chiếu đến thuộc tính 'x' của lớp hiện tại
            }
        }
        //```
        //
        //2. `super`: Từ khóa `super` được sử dụng để tham chiếu đến đối tượng của lớp cha. `super` có thể được sử dụng để:
        //
        //   - Tham chiếu đến thuộc tính của lớp cha.
        //   - Gọi phương thức của lớp cha.
        //   - Gọi constructor của lớp cha.
        //
        //Ví dụ về sử dụng `super`:
        //
        //```java
        class ParentClassHaveSuper {
            protected int x;

            public ParentClassHaveSuper(int x) {
                this.x = x;
            }
        }

        class ChildClassUsingSuper extends ParentClassHaveSuper {
            private int y;

            public ChildClassUsingSuper(int x, int y) {
                super(x); // 'super' gọi constructor của lớp cha
                this.y = y;
            }

            public void printX() {
                System.out.println(super.x); // 'super' tham chiếu đến thuộc tính 'x' của lớp cha
            }
        }
        //```
        //
        //Trong ví dụ trên, `ChildClass` kế thừa từ `ParentClass`. Khi tạo một instance của `ChildClass`, nó sử dụng từ khóa `super` để gọi constructor của `ParentClass` và thiết lập giá trị cho thuộc tính `x` của `ParentClass`.
    }
}
