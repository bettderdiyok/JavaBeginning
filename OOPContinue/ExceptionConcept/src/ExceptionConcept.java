import java.util.Scanner;


public class ExceptionConcept {
    public static void main(String[] args) {
        String[] array = {"abc", "234", null, "bdc"};
        for (int i = 0; i < array.length + 1; i++) {
            try {
                int num = array[i].length() + Integer.parseInt(array[i]);
            } catch (NumberFormatException e) {
                System.out.println(e);

            } catch (NullPointerException e) {
                System.out.println(e);

            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println(e);
            }









      /*  Scanner input = new Scanner(System.in);
        try {
            System.out.println("Enter a number : ");
            int number = input.nextInt();
            System.out.println(number);
        }catch (Exception e) {
            System.out.println("Exception : " + e.toString());
            System.out.println("You don't enter a number!");
        }


       */

        }
        System.out.println("Here");

        for (int i = 0; i < array.length + 1; i++) {
            try {
                int num = array[i].length() + Integer.parseInt(array[i]);
            } catch (Exception e) {
                System.out.println(e);
            }

        }
    }
}
