public class Methods7 {
    public static void main(String[] args) {
        sum(4, 6);
    }

    public static void sum(double a, double b) {
        System.out.println("---First Method---");
        System.out.println(a + b);
    }

    public static void sum(int a, int b) {
        System.out.println("---Second Method---");
        System.out.println(a + b);
    }

    /*Hangisi çalışacak? Tabiki ikinci method çalışacak.Çünkü kural şu sayılarımız tam sayı  olduğu için buna uyan tam
     sayı methodu varsa  ve aynı isimli ise onu çalıştırır.
     */

}