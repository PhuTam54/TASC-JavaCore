package JavaCollection.MapInterface;

import java.util.*;

public class MapInterface {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("Apple", 10);
        map.put("Banana", 20);
        map.put("Cherry", 30);

        System.out.println("Elements of the map: ");
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }

        Map<String, Integer> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put("Apple", 10);
        linkedHashMap.put("Banana", 20);
        linkedHashMap.put("Cherry", 30);
        System.out.println("LinkedHashMap: " + linkedHashMap);

        enum Fruit {
            APPLE, BANANA, CHERRY
        }
        Map<Fruit, Integer> enumMap = new EnumMap<>(Fruit.class);
        enumMap.put(Fruit.APPLE, 10);
        enumMap.put(Fruit.BANANA, 20);
        enumMap.put(Fruit.CHERRY, 30);
        System.out.println("EnumMap: " + enumMap);

        Map<String, Integer> weakHashMap = new WeakHashMap<>();
        weakHashMap.put("Apple", 10);
        weakHashMap.put("Banana", 20);
        weakHashMap.put("Cherry", 30);
        System.out.println("WeakHashMap: " + weakHashMap);

        Map<String, Integer> identityHashMap = new IdentityHashMap<>();
        identityHashMap.put("Apple", 10);
        identityHashMap.put("Banana", 20);
        identityHashMap.put("Cherry", 30);
        System.out.println("IdentityHashMap: " + identityHashMap);
    }
}
