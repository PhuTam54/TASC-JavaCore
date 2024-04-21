package KeywordStaticAndFinal;

public class Main {
    public static void main(String[] args) {
        class ClassStaticVariable {
            static int staticVariable = 10;
        }

        class ClassStaticMethod {
            static void staticMethod() {
                System.out.println("This is a static method.");
            }
        }

        class ClassStaticBlock {
            static {
                // static block
            }
        }

        class ClassStaticClass {
            static class StaticNestedClass {
                // ...
            }
        }

        class MathUtils {
            static int myStaticVariable = 10;
            static int add(int a, int b) {
                return a + b;
            }
            static int subtract(int a, int b) {
                return a - b;
            }
        }

        int sum = MathUtils.add(10, 20);
        int difference = MathUtils.subtract(20, 10);
        System.out.println(sum); // 30
        System.out.println(difference); // 10

        int getStaticVariable = MathUtils.myStaticVariable;

        final int myFinalVariable = 10;
//        public final void myFinalMethod() {
//            // ...
//        }
        final class MyFinalClass {
            // ...
        }

        MathUtils.myStaticVariable = 20;

//         MY_CONSTANT = 20; // Lỗi biên dịch, không thể thay đổi giá trị của biến static final
    }
        static final int MY_CONSTANT = 10;
}
