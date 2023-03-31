public class MethodOverloading4 {
    public static void main(String[] args) {
        sum(5,6.5);
    }
    public static void sum(double a, double b){
        System.out.println("Sum of the numbers = " + (a + b));
    }

    public static void sum(int  a, double b){
        System.out.println("Sum of the numbers2 = " + (a + b));
    }
    //Kendiyle örtüşen veri tipli olan metodu çalıştırır önce.
}
