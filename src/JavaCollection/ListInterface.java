package JavaCollection;

import java.util.*;

public class ListInterface {
    public static void main(String[] args) {
        // ArrayList
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Apple");
        arrayList.add("Banana");
        arrayList.add(1, "Cherry");
        arrayList.get(1);
        arrayList.set(1, "Date");
        boolean isEmpty = arrayList.isEmpty();
        boolean isContain = arrayList.contains("Banana");
        int listSize = arrayList.size();
        arrayList.iterator().forEachRemaining(System.out::println);
        arrayList.lastIndexOf("Banana");
        arrayList.remove(1);
        arrayList.listIterator().forEachRemaining(System.out::println);
        arrayList.clear();
        System.out.println("ArrayList: " + arrayList + isContain + isEmpty + listSize);

        // LinkedList
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("Dog");
        linkedList.add("Cat");
        linkedList.add("Mouse");
        linkedList.addFirst("Elephant");
        linkedList.addFirst("Tiger");
        linkedList.addLast("Lion");
        linkedList.addLast("Zebra");
        String firstLinked = linkedList.removeFirst();
        String firstLinkedWithoutRemove = linkedList.getFirst();
        String lastLinked = linkedList.removeLast();
        String lastLinkedWithoutRemove = linkedList.getLast();
        System.out.println("LinkedList: " + linkedList + firstLinked + firstLinkedWithoutRemove + lastLinked + lastLinkedWithoutRemove);

        // Vector
        Vector<String> vector = new Vector<>();
        vector.add("Hello");
        vector.add("World");
        vector.addElement("Java");
        vector.removeElement( "Programming");
        int vectorCapacity = vector.capacity();
        int vectorSize = vector.size();
        System.out.println("Vector: " + vector + vectorCapacity + vectorSize);

        // Stack
        Stack<String> stack = new Stack<>();
        stack.push("First");
        stack.push("Second");
        stack.push("Third");
        String lastInFirstOutItem = stack.pop();
        String lastInFirstOutItemWithOutRemove = stack.peek();
        System.out.println("Stack: " + stack + lastInFirstOutItem + lastInFirstOutItemWithOutRemove);
        Scanner sc = new Scanner(System.in);

        Stack<String> stackString = new Stack<>();

        // example of reversing a string
        System.out.println("Enter the string: ");
        String s = sc.nextLine();
        int len = s.length();
        for (int i = 0; i < len; i++) {
            stackString.push(s.charAt(i) + "");
        }
        System.out.println("Reversal string: ");
        for (int i = 0; i < len; i++) {
            System.out.print(stackString.pop());
        }

        // example of converting from decimal to binary
        Stack<String> stackPositiveNumber = new Stack<>();
        System.out.println("\nEnter a positive integer:");
        int x = sc.nextInt();
        while (x > 0) {
            int positiveNumber = x % 2;
            System.out.print(positiveNumber);
            stackPositiveNumber.push(positiveNumber + "");
            x /= 2;
        }
        System.out.println("\nBinary number is:");
        int n = stackPositiveNumber.size();
        for (int i = 0; i < n; i++) {
            System.out.print(stackPositiveNumber.pop());
        }
    }
}
