package Methods;

import java.util.Scanner;

public class MethodExample {
     static Scanner input = new Scanner(System.in);
     static int x, y;

    public static void main(String[] args) {
        int chooseUser;

        do {
            chooseUser = showTheMenu();
           switch (chooseUser) {
               case 0:
                   break;
               case 1:
                   System.out.println(productNumbers());
                   break;
               case 2:
                   System.out.println(sumNumbers());
                   break;
               case 3:
                   System.out.println(powerNumbers());
                   break;
               default:
                   System.out.println("Wrong Number");
           }
        } while (chooseUser != 0);
        System.out.println("Exited the menu");
        input.close();

    }

    public static int showTheMenu (){
        int choose;
        System.out.println("************ MENU **********");
        System.out.println("1 - Find the product of two numbers ");
        System.out.println("2 - Find the sum of two numbers ");
        System.out.println("3 - Find the power of two numbers ");
        System.out.println("Press 0 to exit. ");
        choose = input.nextInt();
        return choose;
    }

    public static int productNumbers() {
       askValues();
        return x*y;
    }
    public static int sumNumbers() {
        askValues();
        return x+y;
    }

    public static int powerNumbers() {
        askValues();
        return (int)Math.pow(x, y);
    }


    public static void askValues(){
        System.out.println("Enter two numbers : ");
        x = input.nextInt();
        y = input.nextInt();
    }
}
