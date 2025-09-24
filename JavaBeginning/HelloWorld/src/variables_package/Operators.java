package variables_package;

public class Operators {
    public static void main(String[] args) {
        int a = 60;
        int b = 40;
        System.out.println("num1 :" + a + " num2 : " + b + " Sum : " + (a + b));
        System.out.println("Sum" + a + b);
        System.out.println("Substraction : " + (a - b));
        System.out.println("Division : " +  ((double) a / b));

        int num1 = 10;
        int num2 = ++num1;
        int num3 = num1--;
        System.out.println("Result : " + ((num1) + (--num2) + (num3++)));


        num1 += num2;
        System.out.println(num2);
        System.out.println(num1);

        double doubleNum = 6.50;
        double result = 0;
        result++;
        doubleNum *= result;
        System.out.println("result : " + doubleNum);

        /*
        doubleNum = 6.5
        result = 0
        result = 1
        doubleNum = 6.50
         */
        int s1 = 10;
        int s2 = 6;
        s1++;
        --s2;
        s1 *= --s2;
        System.out.println("s1 : " + s1);
        System.out.println("s2 : " + s2);
        /*
        s1 = 11
        s2 = 5
        s1 = 55
        s2 = 4
        s1= 44

         */


/*
İşlem Önceliği
() içi önce hesaplanır
++ ve -- eğer değişkenden önce ise
çarpma ve bölme
toplama ve çıkarma
atama işlemi
++ ve -- sonda ise
 */

        int number1 = 15;
        int number2 = 5;
        int resultLast = 0;

        resultLast = (number1 + number2*2 - number2 ) + number2 - number1 * 4 + number1;
        System.out.println(resultLast);
        resultLast = (number1 * number2 + 4 / 2 ) + number1++ *   number2 + number1;
        System.out.println(resultLast);

        /*
        number1 = 15
        number2 = 5
        resultLast = 0
        (15 + 10 - 5) + 5 - 60 + 15 -> 20 + -40 -> -20
        (77 ) +
         */





    }  /*

   num1 = 10
   num2 = 11
   num1 = 11
   num3 = 11
   num1 = 10
10 + 10 + 11
     */



}
