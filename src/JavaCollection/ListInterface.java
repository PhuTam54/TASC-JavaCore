package JavaCollection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Stack;
import java.util.Vector;

public class ListInterface {
    public static void main(String[] args) {
        // ArrayList
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Apple");
        arrayList.add("Banana");
        arrayList.add(1, "Cherry");
        boolean isContain = arrayList.contains("Banana");
        int listSize = arrayList.size();
        arrayList.iterator().forEachRemaining(System.out::println);
        arrayList.lastIndexOf("Banana");
        arrayList.remove(1);
        arrayList.listIterator().forEachRemaining(System.out::println);
        System.out.println("ArrayList: " + arrayList + isContain + listSize);

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
    }
}
