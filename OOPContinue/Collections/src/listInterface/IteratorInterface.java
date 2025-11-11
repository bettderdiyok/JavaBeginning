package listInterface;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorInterface {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Betty");
        names.add("Marla");
        names.add("Siena");
        names.add("Ada");
        Iterator<String> iterator = names.iterator();

        while (iterator.hasNext()){
            String name = iterator.next();
            if(name.contains("e")){
                iterator.remove();
            }
            System.out.println("Name : " + name);
        }

        System.out.println("List: " + names);
    }
}
