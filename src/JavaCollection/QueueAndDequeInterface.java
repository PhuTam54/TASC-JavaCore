package JavaCollection;
import java.util.LinkedList;
import java.util.ArrayDeque;
import java.util.PriorityQueue;

public class QueueAndDequeInterface {
    public static void main(String[] args) {
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

        // ArrayDeque as Queue and Deque
        ArrayDeque<String> arrayDeque = new ArrayDeque<>();
        arrayDeque.add("Apple");
        arrayDeque.addFirst("Banana");
        arrayDeque.remove();
        arrayDeque.pollLast();
        arrayDeque.pollLast();
        arrayDeque.pollLast();
        arrayDeque.pollLast();
        System.out.println("ArrayDeque: " + arrayDeque);

        PriorityQueue<String> queue = new PriorityQueue<>();
        queue.offer("Apple");
        queue.offer("Banana");
        queue.offer("Cherry");
        System.out.println("Head of the queue: " + queue.peek());

        System.out.println("Elements of the queue: ");
        while (!queue.isEmpty()) {
            System.out.println(queue.poll());
        }
    }
}
