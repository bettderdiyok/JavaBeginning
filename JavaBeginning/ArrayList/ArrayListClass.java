import java.sql.SQLOutput;
import java.util.ArrayList;

public class ArrayListClass {
    public static void main(String[] args) {
        ArrayList<Integer>  number = new ArrayList<>();
        number.add(15);
        number.add(-7);
        number.add(99);
        number.add(1);
        number.add(5);
        number.add(17);
        number.add(9);
        number.add(93);
        number.add(2);

        for (int i:number) {
            System.out.println(i);

        }
        System.out.println();
        System.out.println(number.size()); //Boyut öğrenme
        System.out.println(number.get(6)); // 6.indexteki değer
        // 99 ile 1 arasına sayı eklemek istediğimizde
        number.add(3, 50);
        number.add(8, 100);
        System.out.println();
        for (int i:number) {
            System.out.println(i);

        }
        System.out.println();
        number.remove(1);
        for (int i:number) {
            System.out.println(i);

        }
        System.out.println();
        //En son indexteki elemanı atmak için:
        number.remove(number.size()-1);
        for (int i:number) {
            System.out.println(i);

        }

        System.out.println();
        System.out.println(number.contains(999));
        System.out.println(number.indexOf(5));
        System.out.println(number.indexOf(-10));
        System.out.println(number.isEmpty());
        System.out.println();
        number.set(3, 15);
        number.set(6, 15);
        for (int i:number) {
            System.out.println(i);

        }

        System.out.println(number.indexOf(15)); //ilk olan idex i verir.
        System.out.println(number.lastIndexOf(15)); // Son index i verir.
        System.out.println();
        ArrayList<String> st = new ArrayList<String>();
        st.add("AUDI");
        st.add("BMW");
        st.add("FIAT");

        System.out.println(st.get(0));
        System.out.println(st.size());
        st.add(1, "TOGG");
        System.out.println(st.get(1));
        System.out.println(st.size());
        System.out.println(st.set(2, "TESLA"));
        System.out.println();
        for (String i:st) {
            System.out.println(i);

        }
       

    }
}
