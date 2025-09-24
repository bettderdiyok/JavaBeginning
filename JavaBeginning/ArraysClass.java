import  java.util.Arrays;
public class NewMain {
    public static void main(String[] args) {
        int[] list = {1, 2, 3, 4};
        int[] list2 = {2, 6, 4, 5, 8, 4, 2, 4, 5};
        double[] list3 = {2.3, 8.9, 4.5};
        //Array i ekrana bastırır.
        System.out.println(Arrays.toString(list));
        System.out.println(Arrays.toString(list3));
        Arrays.fill(list, 2); //Tüm elemanlar 2 oldu
        System.out.println(Arrays.toString(list));
        Arrays.fill(list2, 3, 7,0);
        // 3 ten başla 7 ye kadar o koy 7 dahil değil
        System.out.println(Arrays.toString(list2));
        Arrays.sort(list2);
        System.out.println(Arrays.toString(list2));
        //binarySearch de önce sıralı olmalı.
        System.out.println(Arrays.binarySearch(list2, 5));
        int[] newList = Arrays.copyOf(list2, 5 );
        System.out.println(Arrays.toString(newList));
        int[] newList2 = Arrays.copyOfRange(list2, 4, 7);
        System.out.println(Arrays.toString(newList2));
        System.out.println(Arrays.equals(newList, newList2));

    }
}

