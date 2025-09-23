package variables_package;

public class Homework {
    public static void main(String[] args) {
    /*
     1)
     String stringNum =  "150";
     int value =  Integer.parseInt(stringNum); //Wrapper Classes - Boxing
        System.out.println(value + 100);
     Integer value2 = Integer.valueOf(stringNum);
     System.out.println(value2);

     String intNum = String.valueOf(value);
        System.out.println(intNum);

*/
        /*
        int num1 = 5/3;
        float num2 = 5f/3f; // virgülden sonra 7 karaktere kadar saklar
        double num3 = 5d/3d; // Hassas işlemlerde double

        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num3);

*/
/*
        System.out.println(1.0 - 0.1 - 0.1 - 0.1 - 0.1 - 0.1);
        System.out.println(1.0 - 0.9);
*/
        int number1 = 1;
        int number2 = 2;
        double average = (double)(number1 + number2) / 2;
        System.out.println(average);

        int number3 = 1;
        int number4 = 2;
        double average2 = (number3 + number4) / 2.0;
        System.out.println(average2);



        // "150" yerine "150b" olsa hata verirdi.
        //String referance bir tip int ise primitive otomatik çevrilmez.
        //parseInt aslında String’i okuyup bir primitive int üretir.
    }
}
