public class MethodArraysMaxNumber {
    public static void main(String[] args) {
        int[] array1 = {2, 4, 6, 8, 10, 12};
        sum(array1);

        int[] array2 = {10, 15, 2000, 25, 30, 999, 1881, 894352};
        sum(array2);
        division(array2, 5);

        System.out.println("Max number = " + maxmethod(array2, array2[0]));
    }

    public static void sum(int[] a) {
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum += +a[i];
        }
        System.out.println("Sum=" + sum);
    }

    public static void division(int[] a, int b) {
        int division = 1;
        for (int i = 0; i < a.length; i++) {
            division = a[i] * b;
            System.out.println(i + ")element " + division);


        }
    }

    public static int maxmethod(int[] a, int max) {

        for (int i = 1; i < a.length; i++) {
            if (a[i] > max) {
                max = a[i];
            }

        }
        return max;
    }

}

//Metotlar kod tekrarını önler.