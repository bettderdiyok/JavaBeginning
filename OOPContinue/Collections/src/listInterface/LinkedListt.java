package listInterface;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListt {
    static LinkedList<Integer> numbers = new LinkedList<>();
    public static void main(String[] args) {
        numbers.add(5);
        numbers.add(3);
        numbers.add(2);
        iterator();
        numbers.add(1,100);
        System.out.println();
        iterator();
        numbers.set(0, 5900);
        System.out.println();
        iterator();
    }

    public static void iterator(){
        Iterator<Integer> number = numbers.iterator();
        while (number.hasNext()){
            int num = number.next();
            System.out.println(num);
        }
    }
}
