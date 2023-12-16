import java.util.Scanner;

public class Ternary {
    public static void main(String[] args) {
    int number;
    long start = System.currentTimeMillis();
    Scanner input = new Scanner(System.in);
        int i=2;
        while(i<1000) {
            if (primeNumber(i)) {
                System.out.printf("%d : prime number\n", i);
            }
            else
                System.out.printf("%d : not prime number\n", i);
            i++;
        }
        long end = System.currentTimeMillis();
        System.out.printf("Start Time:%d\n", start);
        System.out.printf("End Time:%d\n",end);
        System.out.printf("Differance:%.3f", ((double)end-start)/1000);

    }

    public static boolean primeNumber(int num){
        int flag=0;
        boolean which;

        for(int i=2; i<num; i++){ //sayı  kendi yarısından daha büyük sayıya bölünmez
            if(num % i == 0){
                flag++;
                break;
            }
        }
       which = (flag == 0) ? true : false;
     return which;
    }
}
