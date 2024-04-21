package String;

public class Main {
    public static void main(String[] args) {
        String strInStringPool = "Hello";
        String strNotStringPool = new String("Hello");
        String strFormat = String.format("Hello, %s", "world");

        String strToStringPool = "Hello";
        String strAlreadyInStringPool = "Hello";
        System.out.println(strToStringPool == strAlreadyInStringPool);

        String str1 = "Hello";
        String str2 = "hello";
        String str3 = "Hello";

        System.out.println(str1.equals(str2));
        System.out.println(str1.equals(str3));

        System.out.println(str1.equalsIgnoreCase(str2));
        System.out.println(str1.equalsIgnoreCase(str3));
    }
}
