package PrimitiveAndObjectType;

import java.lang.reflect.Type;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        /////////////// Phân biệt kiểu dữ liệu nguyên thủy và kiểu dữ liệu object.
        // Kiểu dữ liệu nguyên thủy
        int num = 10;
        double pi = 3.14;
        // Casting double sang int sẽ bị làm tròn xuống. (x)
        num = (int)10.99999999999; // 10
        pi = 3; // 3

        char letter = 'a';
        boolean flag = true;

        byte byteNum = 123;
        short shortNum = 12345;
        long longNum = 123456789L;
        float floatNum = 3.14f;

        // Kiểu dữ liệu object
        String str = "Hello, TASC";
        Integer integerNum = Integer.valueOf(7);
        ArrayList<String> list = new ArrayList<String>();

        // Object type is nullable
        integerNum = null;
        // Primitive type is not nullable
        //num = null;

        /////////////////// Có thể chuyển đổi giữa kiểu dữ liệu nguyên thủy và kiểu dữ liệu đối tượng trong Java.
        // Điều này thường được gọi là boxing và unboxing.

        int toBoxing = 54;
        // Boxing là quá trình chuyển đổi kiểu dữ liệu nguyên thủy thành kiểu dữ liệu đối tượng tương ứng. Ví dụ:
        Integer beingBoxed = Integer.valueOf(toBoxing);
        // Unboxing là quá trình chuyển đổi kiểu dữ liệu đối tượng thành kiểu dữ liệu nguyên thủy tương ứng. Ví dụ:
        int unboxing = beingBoxed.intValue();

        //Java cung cấp tự động boxing và unboxing, nghĩa là bạn không cần phải gọi phương thức valueOf hoặc intValue
        // một cách rõ ràng. Ví dụ:
        Integer autoBoxing = toBoxing;
        int autoUnboxing = beingBoxed;
        //Tuy nhiên, cần lưu ý rằng việc sử dụng tự động boxing và unboxing có thể dẫn đến NullPointerException
        // nếu đối tượng là null.

        /////////////// Có thể so sánh hai kiểu dữ liệu này với nhau không?

        // Không thể so sánh trực tiếp giữa kiểu dữ liệu nguyên thủy và kiểu dữ liệu đối tượng trong Java.
        // So sánh kiểu dữ liệu nguyên thủy: Khi so sánh hai giá trị kiểu dữ liệu nguyên thủy,
        // bạn có thể sử dụng các toán tử so sánh như ==, <, >, <=, >=. Ví dụ:
        int num1 = 10;
        int num2 = 20;
        if (num1 == num2) {
            System.out.println("Primitive Equal");
        } else {
            System.out.println("Primitive Not equal");
        }
        // So sánh kiểu dữ liệu đối tượng: Khi so sánh hai đối tượng, bạn cần phải sử dụng phương thức .equals().
        // Điều này bởi vì khi bạn sử dụng toán tử == với đối tượng,
        // bạn đang so sánh xem hai tham chiếu có trỏ đến cùng một đối tượng hay không,
        // chứ không phải so sánh nội dung của chúng. Ví dụ:
        String str1 = new String("Hello");
        String str2 = new String("Hello");
        if (str1.equals(str2)) {
            System.out.println("Object Equal");
        } else {
            System.out.println("Object Not equal");
        }
        // ouput Object Equal bởi vì nội dung của hai chuỗi là giống nhau,
        // mặc dù chúng là hai đối tượng khác nhau trong bộ nhớ.

        // => có thể so sánh giữa kiểu dữ liệu nguyên thủy (primitive type) và kiểu dữ liệu đối tượng (object type)
        // trong Java, nhưng bạn cần phải chắc chắn rằng kiểu dữ liệu đối tượng đã được unboxing thành kiểu dữ liệu
        // nguyên thủy tương ứng trước khi so sánh.
        // Dưới đây là một ví dụ về việc so sánh giữa kiểu dữ liệu nguyên thủy và kiểu dữ liệu đối tượng:

        int primitiveNum = 10;
        Integer objectNum = 10;

        if (primitiveNum == objectNum) {
            System.out.println("Object and Primitive Equal");
        } else {
            System.out.println("Object and Primitive Not equal");
        }

        ///////////////// Giá trị khi khởi tạo biến với hai loại kiểu dữ liệu này là gì?
        // Khi khởi tạo biến với hai loại kiểu dữ liệu này trong Java, giá trị mặc định sẽ khác nhau:
        // Kiểu dữ liệu nguyên thủy (Primitive type): Khi bạn khởi tạo một biến kiểu dữ liệu nguyên thủy mà không gán
        // giá trị, nó sẽ được gán một giá trị mặc định tùy thuộc vào kiểu dữ liệu:
        //byte, short, int, long: 0
        //float, double: 0.0
        //char: '\u0000' (null character)
        //boolean: false
        int primitiveInt;
        primitiveInt = 0;
        System.out.println(primitiveInt); // Output: 0
        // Kiểu dữ liệu đối tượng (Object type): Khi bạn khởi tạo một biến kiểu dữ liệu đối tượng mà không gán giá trị,
        // nó sẽ được gán giá trị mặc định là null.
        Integer objectInt;
        objectInt = null;
        System.out.println(objectInt); // Output: null

        // Lưu ý: Trong ví dụ trên, nếu bạn thử in ra primitiveInt hoặc objectInt mà không gán giá trị cho chúng,
        // bạn sẽ nhận được lỗi biên dịch vì Java không cho phép sử dụng biến chưa được khởi tạo.
    }
}
