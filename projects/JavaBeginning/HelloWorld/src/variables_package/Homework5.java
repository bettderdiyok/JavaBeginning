package variables_package;

import java.util.Scanner;

public class Homework5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int guess;
        int counter = 0;
        int randomNum = (int) (Math.random() * 100);
        System.out.println(randomNum);
        do {
            System.out.println("What's your guess?");
            guess = input.nextInt();
            if (guess > randomNum) {
                System.out.println("Decrease!");

            } else if (guess < randomNum) {
                System.out.println("Increase!");

            } else {
                System.out.println("Correct guess!!");
            }
            counter++;
            System.out.println("It has been tried " + counter + " times!");
        } while(randomNum !=  guess);
    }
}
