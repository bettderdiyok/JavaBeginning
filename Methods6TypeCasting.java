public class Methods6TypeCasting {
    public static void main(String[] args) {
        System.out.println("Division = " + division1(10,4));
        System.out.println("Division = " + division2(10,4));
        System.out.println("Division = " + division3(10,4));
        System.out.println("Division = " + division4(10,4));

    }

    public static int division1(int a, int b){
        return a/b;

    }


    public static double division2(int a, int b){
        return a/b;

    }

    public static double division3(int a, int b){
        return (double)a/b;

    }

    public static double division4(double a, double b){
        return a/b;

    }

    /*public static int division5(float a, float b){
        return a/b;
Burada hata verir çünkü a/b bölümünden float bir değer çıkar fakat method int veri tipinde .
    }
    */



}
