public class Factorial {
    public static void main(String[] args) {
        int factorial=6;
        int multip=1;

        for(int i=1; i<=factorial; i++ ){
            multip*=i;
        }
        System.out.println("Result = " + multip);
    }
}
