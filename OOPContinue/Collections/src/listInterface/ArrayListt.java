package listInterface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class ArrayListt {
    public static void main(String[] args) {

        //An ArrayList is created to store ten elements in memory.
        ArrayList<Integer> numbers = new ArrayList<>();
        //An ArrayList is created with an initial capacity of 1000
        numbers.add(300);
        numbers.add(250);
        @SuppressWarnings("unchecked")
        ArrayList<Integer> numbersClone =  (ArrayList<Integer>) numbers.clone();
        Iterator<Integer> iterator = numbersClone.iterator();
        while(iterator.hasNext()) {
            Integer num = iterator.next();
            System.out.println(num);
        }
        ArrayList<Integer> numbers2 = new ArrayList<>(1000);
        ArrayList<String> names = new ArrayList<>();
        names.add("Bett");
        names.add("Helga");
        names.add("Schinder");
        ArrayList<String> names2 = new ArrayList<>(names);
        for (String name : names2){
            System.out.println(name);
        }
        System.out.println(names2.contains("Bet"));
        System.out.println(names2.contains("Bett"));

        String[] nameArray = names.toArray(new String[0]);
        //new String[0] = şablon (template).
        //Java: “Ne tür dizi istiyorsun?” diye sorar,
        //Sen: “String türünde olsun, boyutunu sen ayarla.” dersin.
        System.out.println(nameArray[0]);
        System.out.println(names.get(1));
        System.out.println(names.set(1, "Olga"));
        System.out.println(names.get(1));
        names.add(2, "Hayriye");
        System.out.println(names.get(2));
        System.out.println(names.get(3));
        names.remove(2);
        System.out.println(names.get(2));

        for (int i=0; i<names.size(); i++){
            System.out.println(names.get(i));
        }
        for(String name : names){
            System.out.println(name);
        }

        ArrayList<Integer> numbersNew = new ArrayList<>();
        ArrayList<Integer> numbersNew2 = new ArrayList<>();
        numbersNew.add(3);
        numbersNew.add(78);
        numbersNew.add(9);
        numbersNew.add(1);
        numbersNew2.add(3);
        numbersNew2.add(1);
        numbersNew2.add(6);
        numbers2.add(4);

        for (int i=0; i<numbersNew.size(); i++) {
            if (numbersNew2.contains(numbersNew.get(i))) {
                numbersNew.remove(i);
            }
        }
        for(Integer num : numbersNew){
            System.out.println(num);
        }







    }

}
