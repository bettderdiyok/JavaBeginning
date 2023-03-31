public class MethodArraysMaxNumberShort {
    public static void main(String[] args) {
    int[] array1 = {2, 4, 6, 8, 120, 12, 15};
    int maxNumbers = max(array1);
        System.out.println("The biggest number is " + maxNumbers);
    }

    public static int max(int[] a){
        int max=a[0];
        for(int x:a){
            if(x>max)
                max=x;
        }
        return max;
    }
}
