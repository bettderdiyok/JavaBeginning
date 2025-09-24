package variables_package;

import java.util.Scanner;

public class ScannerClass {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
       /* System.out.println("Enter your name :");
        String  name = input.nextLine();
        System.out.println("Name : " + name);


        System.out.println("Enter your weight :");
        float weight = input.nextFloat();
        System.out.println(weight);

        System.out.println("Enter your name2 :");
        String name2 = input.nextLine(); // boşluk olunca arada bşluktan sonrasını almıyor \n görmüyor
        System.out.println(name2);
        System.out.println("Enter your name3 :");
        String name3 = input.nextLine();
        System.out.println(name3);
*/
        char letter = input.next().charAt(0);
        System.out.println(letter);
//next sonra nextline kullanınca betul derdiyok girsek nextline da görmez direk derdiyok u ona atar
    }
}
//next String döner String  İ CHAR A DÖNÜŞTÜRDÜK.