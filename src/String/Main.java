package String;

public class Main {
    public static void main(String[] args) {
        ////////////////// - Tìm hiểu về các đặc điểm và tính chất của String trong java
        //Trong Java, String là một lớp đặc biệt và có một số đặc điểm và tính chất quan trọng sau:
        //Bất biến (Immutable): Một khi String được tạo, nó không thể thay đổi. Mỗi thao tác thay đổi nội dung
        // của String sẽ tạo ra một đối tượng String mới.
        //String Pool: Trong Java, một khu vực bộ nhớ đặc biệt được gọi là "String Pool" được sử dụng để lưu trữ
        // tất cả các đối tượng String được tạo thông qua phép gán trực tiếp (ví dụ: String str = "Hello";).
        // Nếu một String mới được tạo và nó đã tồn tại trong String Pool, thì tham chiếu đến String đã tồn tại
        // sẽ được trả về thay vì tạo một đối tượng mới.
        //So sánh: Để so sánh nội dung của hai String, bạn nên sử dụng phương thức .equals() thay vì toán tử ==.
        // Toán tử == sẽ so sánh tham chiếu, không phải nội dung.
        //Nối chuỗi: Bạn có thể nối các String lại với nhau bằng toán tử +. Tuy nhiên, do tính bất biến của String,
        // mỗi thao tác nối sẽ tạo ra một đối tượng String mới. Điều này có thể dẫn đến hiệu suất kém nếu bạn thực
        // hiện nhiều thao tác nối trong một vòng lặp. Trong trường hợp đó, sử dụng StringBuilder hoặc StringBuffer
        // là một lựa chọn tốt hơn.
        //Phương thức hữu ích: Lớp String cung cấp nhiều phương thức hữu ích như length(), charAt(int index),
        // substring(int beginIndex, int endIndex), split(String regex), trim(), toLowerCase(), toUpperCase(),
        // replace(oldChar, newChar), startsWith(String prefix), endsWith(String suffix), contains(CharSequence s),
        // và nhiều phương thức khác.

        //////////////////////- Có bao nhiêu cách để tạo 1 biến String
        //Có ba cách chính để tạo một biến String trong Java:
        // 1.Sử dụng toán tử gán =: Đây là cách phổ biến nhất để tạo một String. Khi bạn tạo một String bằng cách này,
        // Java sẽ kiểm tra xem String đó có tồn tại trong String Pool hay không. Nếu có, nó sẽ trả về tham chiếu đến
        // String đã tồn tại. Nếu không, nó sẽ tạo một String mới và thêm nó vào String Pool.
        String strInStringPool = "Hello";
        // 2.Sử dụng từ khóa new: Khi bạn tạo một String bằng cách này, Java sẽ luôn tạo một đối tượng String mới,
        // ngay cả khi một String giống hệt đã tồn tại trong String Pool.
        String strNotStringPool = new String("Hello");
        // 3.Sử dụng phương thức format: Phương thức format của lớp String cho phép bạn tạo một String mới với định
        // dạng cụ thể. Điều này rất hữu ích khi bạn cần tạo một String phức tạp từ nhiều giá trị khác nhau.
        String strFormat = String.format("Hello, %s", "world");
        // =>> Lưu ý rằng cách thứ hai sẽ không tận dụng được String Pool, điều này có thể dẫn đến việc sử dụng bộ nhớ
        // không hiệu quả nếu bạn tạo nhiều String giống nhau.

        //- Tìm hiểu về String pool?
        // String Pool, còn được gọi là Constant String Pool, là một khu vực bộ nhớ đặc biệt trong Heap Memory được sử
        // dụng để lưu trữ tất cả các đối tượng String được tạo thông qua phép gán trực tiếp
        // (ví dụ: String str = "Hello";).  Một số điểm quan trọng về String Pool:
        //Tái sử dụng đối tượng: Khi một String mới được tạo, JVM sẽ kiểm tra xem String đó có tồn tại trong String Pool
        // hay không. Nếu có, thì tham chiếu đến String đã tồn tại sẽ được trả về thay vì tạo một đối tượng mới.
        // Điều này giúp tiết kiệm bộ nhớ.
        //Bất biến: Do các String trong String Pool là bất biến, nên một String cụ thể chỉ cần được lưu trữ một lần.
        // Điều này giúp tiết kiệm bộ nhớ và tăng hiệu suất.
        //Tạo bằng từ khóa new: Khi bạn tạo một String bằng từ khóa new, một đối tượng mới sẽ luôn được tạo trong
        // Heap Memory, không phụ thuộc vào việc String đó có tồn tại trong String Pool hay không.
        // Điều này có thể dẫn đến việc sử dụng bộ nhớ không hiệu quả.
        //Phương thức intern(): Phương thức intern() của lớp String cho phép bạn thêm một String vào String Pool
        // nếu nó chưa tồn tại. Nếu String đã tồn tại, phương thức này sẽ trả về tham chiếu đến
        // String đã tồn tại trong String Pool.
        //Ví dụ về việc sử dụng String Pool:
        String strToStringPool = "Hello"; // Tạo một String và thêm nó vào String Pool
        String strAlreadyInStringPool = "Hello"; // Không tạo một đối tượng mới, mà trả về tham chiếu đến String đã tồn tại trong String Pool
        System.out.println(strToStringPool == strAlreadyInStringPool); // In ra "true" vì cả hai tham chiếu đều trỏ đến cùng một đối tượng trong String Pool

        //- Làm sao để so sánh hai chuỗi trong java
        // Trong Java, bạn có thể so sánh hai chuỗi bằng cách sử dụng phương thức .equals() hoặc .equalsIgnoreCase().
        // Phương thức .equals() sẽ so sánh hai chuỗi dựa trên nội dung và phân biệt chữ hoa chữ thường,
        // trong khi .equalsIgnoreCase() sẽ so sánh nội dung mà không phân biệt chữ hoa chữ thường.
        // Dưới đây là một ví dụ về cách sử dụng hai phương thức này:
        String str1 = "Hello";
        String str2 = "hello";
        String str3 = "Hello";

        // Sử dụng phương thức .equals()
        System.out.println(str1.equals(str2)); // In ra "false" vì .equals() phân biệt chữ hoa chữ thường
        System.out.println(str1.equals(str3)); // In ra "true"

        // Sử dụng phương thức .equalsIgnoreCase()
        System.out.println(str1.equalsIgnoreCase(str2)); // In ra "true" vì .equalsIgnoreCase() không phân biệt chữ hoa chữ thường
        System.out.println(str1.equalsIgnoreCase(str3)); // In ra "true"
    }
}
