//Metoda dizi gönderimi
public class Main {
    public static void main(String[] args) {
        int[] array1 = {2, 100, 300, 8};
        int[] array2 = {1, 3, 5, 7};
        System.out.println("Sum of array's element : " + sum(array1));
        System.out.println("Sum of array's element : " + sum(array2));
        multipleFive(array2, 5);
        System.out.println();
        theBiggestNum(array1);


    }

    public static int sum(int[] a){
        int sum=0;
        for (int x: a){
            sum+=x;
        }
        return sum;
    }

    public static void multipleFive(int[] a, int num){
        for (int x: a){
            System.out.print(x*num + " ");
        }

    }

    public static void theBiggestNum(int[] a){
        int max = a[0];
        for (int x:a) {
            max = Math.max(max, x);
        }
        System.out.println("The biggest Number:" + max);
    }

}
