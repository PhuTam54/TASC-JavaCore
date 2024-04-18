package KeywordStaticAndFinal;

public class Main {
    public static void main(String[] args) {
        /////////////////- Tại sao phương thức main luôn được khai báo là static ?
        // Phương thức main trong Java luôn được khai báo là static vì nó được gọi bởi JVM mà không cần tạo một đối
        // tượng của lớp chứa nó. Nếu phương thức main không được khai báo là static, JVM sẽ cần tạo một đối tượng
        // của lớp chứa phương thức main trước khi có thể gọi phương thức đó. Điều này sẽ gây ra mâu thuẫn vì
        // phương thức main được gọi khi chương trình bắt đầu chạy, trước khi bất kỳ đối tượng nào được tạo.
        ////////////////////////////////////////////////////////////////////////////

        ///////////////////////////// - Thế nào là static ?
        //Trong Java, từ khóa static được sử dụng để tạo các thành viên (biến, phương thức, khối và lớp lồng nhau)
        // thuộc lớp, không thuộc bất kỳ đối tượng cụ thể nào của lớp đó.
        // 1.Biến static: Biến static được khởi tạo chỉ một lần, tại thời điểm tải lớp. Nó là một biến thuộc lớp,
        // không thuộc đối tượng. Do đó, tất cả các đối tượng của lớp đó chia sẻ cùng một bản sao của biến static.
        class ClassStaticVariable {
            static int staticVariable = 10;
        }
        // 2.Phương thức static: Phương thức static thuộc về lớp, không thuộc về đối tượng. Bạn có thể gọi phương thức
        // static mà không cần tạo đối tượng của lớp. Phương thức static chỉ có thể truy cập trực tiếp vào các
        // biến static và không thể truy cập trực tiếp vào các biến không phải static hoặc phương thức không phải static.
        class ClassStaticMethod {
            static void staticMethod() {
                System.out.println("This is a static method.");
            }
        }
        // 3. Khối static: Khối static được sử dụng để khởi tạo các biến static. Nó được thực thi một lần khi lớp được
        // tải vào bộ nhớ.
        class ClassStaticBlock {
            static {
                // static block
            }
        }
        // 4. Lớp static: Lớp static là một lớp lồng nhau mà không cần một đối tượng của lớp bên ngoài để có thể tồn tại.
        class ClassStaticClass {
            static class StaticNestedClass {
                // ...
            }
        }

        // =>> Lưu ý rằng từ khóa static không thể được áp dụng cho các lớp ở cấp độ cao nhất, chỉ có thể áp dụng
        // cho các lớp lồng nhau.

        ////////////////// Phương thức, thuộc tính khai báo bằng từ khóa static được sử dụng khi nào ?
        // Phương thức và thuộc tính khai báo bằng từ khóa static trong Java được sử dụng khi bạn muốn chúng thuộc về lớp, chứ không phải một đối tượng cụ thể nào của lớp đó. Dưới đây là một số trường hợp cụ thể:
        //Biến static: Khi bạn muốn một biến có giá trị chung và được chia sẻ bởi tất cả các đối tượng của lớp, bạn nên sử dụng biến static. Biến static chỉ được khởi tạo một lần và giữ giá trị của nó trong suốt quá trình thực thi chương trình.
        //Phương thức static: Khi bạn muốn một phương thức có thể được gọi mà không cần tạo một đối tượng của lớp, bạn nên sử dụng phương thức static. Phương thức static thường được sử dụng để tạo các phương thức tiện ích hoặc các phương thức không phụ thuộc vào trạng thái của đối tượng.
        //Ví dụ, bạn có thể tạo một lớp MathUtils với các phương thức static để thực hiện các phép toán toán học:
        class MathUtils {
            static int myStaticVariable = 10;
            static int add(int a, int b) {
                return a + b;
            }
            static int subtract(int a, int b) {
                return a - b;
            }
        }
        // Và sau đó, bạn có thể gọi các phương thức này mà không cần tạo một đối tượng của MathUtils:
        int sum = MathUtils.add(10, 20);
        int difference = MathUtils.subtract(20, 10);
        // print
        System.out.println(sum); // 30
        System.out.println(difference); // 10

        ///////////////// Làm thế nào để truy cập được tới phương thức, thuộc tính static
        // Để truy cập đến phương thức hoặc thuộc tính static trong Java, bạn có thể sử dụng tên của lớp chứa chúng, theo sau là dấu chấm (.) và tên của phương thức hoặc thuộc tính. Bạn không cần tạo một đối tượng của lớp để truy cập đến các thành viên static.
        int getStaticVariable = MathUtils.myStaticVariable;
        //Lưu ý rằng việc truy cập đến các thành viên static thông qua một thực thể (đối tượng) của lớp thay vì trực tiếp thông qua lớp là không được khuyến nghị, vì nó có thể gây nhầm lẫn.

        ///////////////////- Thế nào là final ?
        // +Trong Java, từ khóa final được sử dụng để chỉ định rằng một biến, phương thức hoặc lớp không thể được thay đổi hoặc kế thừa.
        //Biến final: Khi một biến được khai báo là final, giá trị của nó không thể thay đổi sau khi đã được khởi tạo. Điều này có nghĩa là bạn có thể gán giá trị cho một biến final một lần duy nhất.
        final int myFinalVariable = 10;
        //	Phương thức final: Khi một phương thức được khai báo là final, nó không thể bị ghi đè (override) trong một lớp con.
//        public final void myFinalMethod() {
//            // ...
//        }
        //	Lớp final: Khi một lớp được khai báo là final, nó không thể bị kế thừa bởi các lớp khác.
        final class MyFinalClass {
            // ...
        }
        //+Lưu ý rằng từ khóa final không làm cho một đối tượng trở nên không thể thay đổi. Nó chỉ ngăn chặn việc gán lại tham chiếu đến đối tượng đó. Nếu đối tượng là một đối tượng có thể thay đổi (như một ArrayList, ví dụ), bạn vẫn có thể thay đổi nội dung của nó.

        /////////////// Khai báo 1 biến final khác gì với static, biến khai báo bằng final có thể chỉnh sửa được không ? Nếu được cho ví dụ minh họa.

        // Biến final và static trong Java có những đặc điểm riêng:
        //Biến final: Khi một biến được khai báo là final, giá trị của nó không thể thay đổi sau khi đã được khởi tạo. Điều này có nghĩa là bạn chỉ có thể gán giá trị cho một biến final một lần duy nhất. Biến final không phải là một biến chung của lớp, mỗi đối tượng của lớp đều có một bản sao riêng của biến final.
//        final int myFinalVariable = 10;
        // myFinalVariable = 20; // Lỗi biên dịch, không thể thay đổi giá trị của biến final

        // Biến static: Biến static là một biến chung của lớp, không thuộc về một đối tượng cụ thể nào của lớp. Tất cả các đối tượng của lớp đều chia sẻ cùng một bản sao của biến static. Giá trị của biến static có thể thay đổi và thay đổi này sẽ ảnh hưởng đến tất cả các đối tượng của lớp.
//        static int myStaticVariable = 10;
        MathUtils.myStaticVariable = 20; // Được phép, giá trị mới sẽ ảnh hưởng đến tất cả các đối tượng của lớp

        //Nếu một biến được khai báo là final, bạn không thể thay đổi giá trị của nó sau khi đã khởi tạo. Tuy nhiên, nếu một biến là static final, nó vừa là biến chung của lớp vừa không thể thay đổi giá trị sau khi khởi tạo. Biến static final thường được sử dụng để định nghĩa các hằng số.
        //static final int MY_CONSTANT = 10;
        // MY_CONSTANT = 20; // Lỗi biên dịch, không thể thay đổi giá trị của biến static final
    }
}
