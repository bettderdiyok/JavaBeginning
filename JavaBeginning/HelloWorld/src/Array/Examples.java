package Array;

import java.util.Arrays;
import java.util.Scanner;

public class Examples {
    public static void main(String[] args) {
       /* int[] array = new int[10];
        for (int i=0; i<array.length; i++) {
            array[i] = (int)Math.pow(i, 2);
        }
        for (int i=0; i<array.length; i++) {
            System.out.println(array[i]);

        }

        */

       /*  String[] months = {"January", "February", "March", "April", "May", "June", "July", "August", "September",
                "October", "November", "December"};
        Scanner input = new Scanner(System.in);
        int month = input.nextInt();
        System.out.println(months[month-1]);
        */

        Scanner input = new Scanner(System.in);
        int number;
        int arraysNumber;
        System.out.println("How many numbers do you want to find the average of?");
        number = input.nextInt();

        int[] array = new int[number];

            for(int i=0; i<number; i++) {
            System.out.println("Enter  a number:");
            array [i] = input.nextInt();

        }
        int sum;
        sum = Arrays.stream(array).sum();
        double average = (double)sum / number;

        for (int j=0; j<array.length; j++) {
            System.out.println(array[j]);
        }
        System.out.println("sum : " + sum + "\nAverage: " + average );

        int []arrays = {3, 3, 3, 3};
        for (int num : arrays) {
            System.out.println(num);

        }
    }

}
