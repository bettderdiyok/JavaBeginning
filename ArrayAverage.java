public class Main {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        double  series = 0.0;
        double harmonicSeriesAvg;
        for(double i=1; i< array.length+1; i++){
            series+=1/i;
        }
        harmonicSeriesAvg= array.length / series;
        System.out.println(harmonicSeriesAvg);

       /* int[] array = new int[10];
        int sum=0;
        for(int i=0; i< array.length; i++){
            array[i] = (int)(Math.random()*10 + 1);
        }
        System.out.println("ARRAY:");
        for (int x: array) {
            System.out.print(x + " ");
            sum+=x;

        }
        System.out.println();
        System.out.println(Arrays.stream(array).average().orElse(0));
        System.out.println(sum/ (double)array.length);

    }

        */

    }
}