package listInterface;

import java.util.*;

public class QueuePriority {
    public static void main(String[] args) {
        Queue<Integer> numbers = new LinkedList<>();
        PriorityQueue<String> names = new PriorityQueue<>();
        numbers.offer(11);
        numbers.offer(12);
        numbers.offer(13);
        numbers.offer(14);
        numbers.offer(15);
        numbers.add(7);
        System.out.println(numbers);
        System.out.println(numbers.peek()); //First element
        System.out.println(numbers.poll());
        System.out.println(numbers);
        System.out.println(numbers.poll());
        System.out.println(numbers);
        System.out.println(numbers.remove());
        System.out.println(numbers);
        names.offer("can");
        names.offer("ayse");
        names.offer("beyhan");
        names.offer("beril");
        names.offer("reyhan");
        names.offer("emre");
        names.offer("ali");
        System.out.println(names);
        Iterator<String> iterator = names.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());}
        System.out.println();
        while (!names.isEmpty()) {
            System.out.println(names.poll());
        }
    }
}
