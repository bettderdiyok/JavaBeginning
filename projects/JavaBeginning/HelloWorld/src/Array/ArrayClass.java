package Array;
import java.util.Arrays;

public class ArrayClass {
    public static void main(String[] args) {
        int[] numbers = {8, 7, 2, -8, 14, 19, 11};
        int[] numbers2 = {8, 7, 2, -8, 14, 19, 11};
        System.out.println("Before sorting");
        printArray(numbers2);
       /* System.out.println("After sorting");
        Arrays.sort(numbers);
        printArray(numbers);

        */
        Arrays.sort(numbers2, 2, 5);
        System.out.println("\nAfter sorting from 2 to 5");
        printArray(numbers2);

        System.out.println("Faster sorting");
        Arrays.parallelSort(numbers2);
        printArray(numbers2);
        System.out.println("\n");

        //Before sorting for binary search
        System.out.println( Arrays.binarySearch(numbers2, 7 ));
        System.out.println(Arrays.equals(numbers, numbers2));
        printArray(numbers);
        printArray(numbers2);



    }
    public static void printArray(int[] numbers){
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();

    }
}
