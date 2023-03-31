public class MethodArraysMaxMinNumbers {
    public static void main(String[] args) {
        int[] array1 = {2, 4, 60, 800, 1, 10, -12, 145};
        int []numbersMaxMin = new int[2];
        numbersMaxMin=maxMinMethods(array1);
        System.out.println("The biggest element in array = " + numbersMaxMin[1]);
        System.out.println("The smallest element in array = " + numbersMaxMin[0]);
    }
    //Metodumuz bize bir eleman değil birden fazla eleman verecek o yüzden dizi olarak aldık
    public static int[] maxMinMethods(int[]a){
        int[] elements=new int[2];
        int max=a[0];
         for(int x:a){
            if(x>max)
                max=x;
        }

         int min=a[0];
          for(int x:a)
             if(x<min) {
                 min=x;
             }
          elements[0]=min;
          elements[1]=max;

        return elements;



    }
}
