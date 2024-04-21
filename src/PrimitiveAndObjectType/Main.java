package PrimitiveAndObjectType;

import java.lang.reflect.Type;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        int num = 10;
        double pi = 3.14;
        num = (int)10.99999999999; // 10
        pi = 3; // 3

        char letter = 'a';
        boolean flag = true;

        byte byteNum = 123;
        short shortNum = 12345;
        long longNum = 123456789L;
        float floatNum = 3.14f;

        String str = "Hello, TASC";
        Integer integerNum = Integer.valueOf(7);
        ArrayList<String> list = new ArrayList<String>();

        integerNum = null;
        //num = null;

        int toBoxing = 54;
        Integer beingBoxed = Integer.valueOf(toBoxing);
        int unboxing = beingBoxed.intValue();

        Integer autoBoxing = toBoxing;
        int autoUnboxing = beingBoxed;

        int num1 = 10;
        int num2 = 20;
        if (num1 == num2) {
            System.out.println("Primitive Equal");
        } else {
            System.out.println("Primitive Not equal");
        }

        String str1 = new String("Hello");
        String str2 = new String("Hello");
        if (str1.equals(str2)) {
            System.out.println("Object Equal");
        } else {
            System.out.println("Object Not equal");
        }

        int primitiveNum = 10;
        Integer objectNum = 10;

        if (primitiveNum == objectNum) {
            System.out.println("Object and Primitive Equal");
        } else {
            System.out.println("Object and Primitive Not equal");
        }

        //byte, short, int, long: 0
        //float, double: 0.0
        //char: '\u0000' (null character)
        //boolean: false
        int primitiveInt;
        primitiveInt = 0;
        System.out.println(primitiveInt); // Output: 0

        Integer objectInt;
        objectInt = null;
        System.out.println(objectInt); // Output: null
    }
}
