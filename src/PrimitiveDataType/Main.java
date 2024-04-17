package PrimitiveDataType;

public class Main {
    public static void main(String[] args) {
        System.out.printf("Hello TASC \n");
        int num = 10;
        double pi = 3.14;
        // Casting double sang int sẽ bị làm tròn xuống. (x)
        num = (int)10.99999999999;
        pi = 3;
        System.out.printf("Num after casting 10,99999 double to int: ");
        System.out.println(num);
        System.out.printf("Pi after assign 3,14 to 3 int: ");
        System.out.println(pi);

        char letter = 'a';
        boolean flag = true;
        System.out.printf("Letter: ");
        System.out.println(letter);
        System.out.printf("Flag: ");
        System.out.println(flag);

        System.out.printf("More: ");
        byte byteNum = 123;
        short shortNum = 12345;
        long longNum = 123456789L;
        float floatNum = 3.14f;
        System.out.printf("Byte: ");
        System.out.println(byteNum);
        System.out.printf("Short: ");
        System.out.println(shortNum);
        System.out.printf("Long: ");
        System.out.println(longNum);
        System.out.printf("Float: ");
        System.out.println(floatNum);
    }
}
