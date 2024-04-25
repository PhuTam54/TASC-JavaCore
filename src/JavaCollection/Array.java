package JavaCollection;

public class Array {
    public static void main(String[] args) {
        // Array Declaration
        int[] arr = new int[5];
        String[] myStringArray = new String[5];

        // Array Initialization
        myStringArray[0] = "Hello";
        myStringArray[1] = "World";
        myStringArray[2] = "Java";
        myStringArray[3] = "Programming";
        myStringArray[4] = "Language";
        String firstElement = myStringArray[0]; // Lấy giá trị của phần tử thứ 5 trong mảng
        System.out.println(firstElement);

        // Array Traversal
        for (int i = 0; i < myStringArray.length; i++) {
            System.out.println(myStringArray[i]);
        }

        // Array Declaration and Initialization
        int[] arr2 = {10, 20, 30, 40, 50};

        // Array Traversal
        System.out.println("Array elements: ");
        for (int i = 0; i < arr2.length; i++) {
            System.out.println(arr2[i]);
        }

        // Array Reversal
        for (int i = 0; i < arr2.length/2; i++) {
            int temp = arr2[i];
            arr2[i] = arr2[arr2.length - i - 1];
            arr2[arr2.length - i - 1] = temp;
        }

        System.out.println("Array after reversal: ");
        for (int i = 0; i < arr2.length; i++) {
            System.out.println(arr2[i]);
        }

        int[][] twoD = new int[2][3];
        twoD[0][0] = 1;
        twoD[0][1] = 2;
        twoD[0][2] = 3;
        twoD[1][0] = 4;
        twoD[1][1] = 5;
        twoD[1][2] = 6;

        int arr3[][] = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        twoD = new int[][] {
            {1, 2, 3, 5},
            {4, 5, 6, 7, 8}
        };

        for (int i = 0; i < twoD.length; i++) {
            for (int j = 0; j < twoD[i].length; j++) {
                System.out.print(twoD[i][j] + " ");
            }
            System.out.println();
        }
    }
}
