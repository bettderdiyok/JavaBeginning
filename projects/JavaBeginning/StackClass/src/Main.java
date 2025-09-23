import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Stack st1 = new Stack();
        int select=0, number;
        while(select!=5) {
            System.out.println("1-Push");
            System.out.println("2-Pop");
            System.out.println("3-Size of Stack");
            System.out.println("4-Print to Stack");
            System.out.println("5-Exit");
            System.out.print("Select the  process you want to do process : ");
            select = input.nextInt();

            switch (select) {
                case 1:
                    System.out.print("Enter the  number you want to do push : ");
                    number = input.nextInt();
                    st1.push(number);
                    break;
                case 2:
                    st1.pop();
                    break;
                case 3:
                    System.out.println("Size of stack : " + st1.size());
                    break;
                case 4:
                    st1.print();
                       break;
                   }


            }

        }


    }
