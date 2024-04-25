package JavaCollection.SetInterface;

import java.util.*;

public class SetInterface {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("Apple");
        set.add("Banana");
        set.add("Cherry");
        set.add("Apple"); // This will not be added as "Apple" is already present in the set

        System.out.println("Elements of the set: ");
        for (String element : set) {
            System.out.println(element);
        }

        Set<String> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add("Apple");
        linkedHashSet.add("Banana");

        System.out.println("Elements of the linkedHashSet: ");
        for (String element : linkedHashSet) {
            System.out.println(element);
        }

        Set<String> treeSet = new TreeSet<>();
        treeSet.add("Apple");
        treeSet.add("Banana");

        System.out.println("Elements of the treeSet: ");
        for (String element : treeSet) {
            System.out.println(element);
        }

        enum Fruit {
            APPLE, BANANA, CHERRY
        }
        Set<Fruit> enumSet = EnumSet.allOf(Fruit.class);
        System.out.println("EnumSet: " + enumSet);
    }
}