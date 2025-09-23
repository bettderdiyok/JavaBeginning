package variables_package;

import java.util.Scanner;

public class HomeWork3 {
    public static void main(String[] args) {
     /*  Scanner input = new Scanner(System.in);
        System.out.println("----Welcome to Body Mass Index Program---");
        System.out.println("Enter your weight in kilograms : ");
        double weight = input.nextDouble();
        System.out.println("Enter your height in santimeter : ");
        int height = input.nextInt();
        double bodyMassIndex = (weight / Math.pow(height/100.0, 2));
        System.out.println("Your body mass index : " + bodyMassIndex);

        if (bodyMassIndex < 15) {
            System.out.println("Extremely underweight");
        } else if (bodyMassIndex > 15 && bodyMassIndex < 16 ) {
            System.out.println("Severely underweight");
        } else if (bodyMassIndex > 16 && bodyMassIndex < 25){
            System.out.println("Healthy");
        } else if (bodyMassIndex> 25 && bodyMassIndex < 40) {
            System.out.println("overweight");
        } else {
            System.out.println("Obese");
        }

*/
        Scanner input = new Scanner(System.in);
        int choose = 0;
        int lotteryNumRemind;
        int lotteryNumQuotient;
        int guess;
        int guessQuotient;
        int guessRemind;
        System.out.println("Welcome to Lottery !!! Today is your lucky day!!!! ");
        do {
            int lotteryNum = (int)((Math.random() * (100 - 10 + 1) + 10));
            lotteryNumQuotient = lotteryNum / 10;
            lotteryNumRemind = lotteryNum % 10;
            System.out.println("Lottery Number : " + lotteryNum);
            System.out.println("What's your guess?");
            guess = input.nextInt();
            guessQuotient = guess / 10;
            guessRemind = guess % 10;
            if (lotteryNum == guess) {
                System.out.println("You won the lottery!!!");
            }  else if (guessRemind == lotteryNumQuotient && guessQuotient == lotteryNumRemind) {
                System.out.println("You Won 5000 Liras");
            } else if (lotteryNumQuotient == guessQuotient || lotteryNumQuotient == guessRemind || lotteryNumRemind == guessQuotient || lotteryNumRemind == guessRemind) {
                System.out.println("You won 1000 Liras");
            }
            else {
                System.out.println("You didn't win but if you play again 1");
                System.out.println("Lottery Number : " + lotteryNum);
                System.out.println("Your choose : ");
                choose = input.nextInt();
            }
        } while (choose == 1);
        System.out.println("The lottery is done.");



    }
}
//int r = (int)(Math.random() * (üst - alt + 1)) + alt;