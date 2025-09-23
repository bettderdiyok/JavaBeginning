package variables_package;

import java.util.Scanner;

public class Homework4 {
    public static void main(String[] args) {
        // Example 1
      /*  Scanner input = new Scanner(System.in);
        System.out.println("Enter three numbers : ");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int num3 = input.nextInt();
        int sum = num1 + num2 + num3;
        double average = sum / 3.0;
        System.out.println("Average : " + average);
        System.out.printf("%.2f", average);

       */
       for(int i=1; i<11; i++){
           System.out.print(i);
           if (i !=10) {
               System.out.print(",");
           }
       }
    }
}
