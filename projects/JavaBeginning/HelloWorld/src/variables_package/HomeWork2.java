package variables_package;

public class HomeWork2 {
    public static void main(String[] args) {
       int second = 4283;
       int minute = second / 60;
       int remainderSecond = second % 60;
        System.out.println("Minute : " + minute + "\nSecond : " + remainderSecond);

        double fahrenheit = 100;
        double celcius =  5.0/9.0 * (fahrenheit - 32);
        System.out.println(celcius);

        int year = 4000;
        boolean isLeapYear = (year % 400 == 0) || (year % 4 == 0 && year % 100 != 0);
        System.out.println(isLeapYear);


    }
}
