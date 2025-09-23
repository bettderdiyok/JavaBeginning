import java.util.Arrays;

public class Examples2 {
    public static void main(String[] args) {
        int[][] matrix = new int[3][2];
        createElements(matrix);
        printMatrix(matrix);
        System.out.println(sumElements(matrix));
        int[] result = minMaxNumbers(matrix);
        printMatrix(result);


    }

    public static void createElements(int[][] matrix){
        for (int i=0; i<matrix.length; i++){
            for (int j=0; j<matrix[0].length; j++){
                matrix[i][j] = (int) (Math.random() * 10);
            }

        }

    }

    //Overloading
    public static void printMatrix(int[][] matrix) {
        System.out.println(Arrays.deepToString(matrix));

    }

    public static void printMatrix(int[] array) {
       Arrays.stream(array).forEach(n -> System.out.print(n + " "));
    }

    public static int sumElements(int[][] matrix){
      /*  int sum = 0;
        for(int[] row: matrix) {
            for (int val: row) {
                sum+=val;

            }
        }

       */
        int sum = Arrays.stream(matrix).flatMapToInt(Arrays::stream).sum();



        return sum;
    }

    public static int[] minMaxNumbers (int[][] matrix) {
        int minNum = Integer.MAX_VALUE;
        int maxNum = Integer.MIN_VALUE;
        for (int[] row : matrix) {
            for (int val : row) {
                if (val < minNum) minNum = val;
                if (val > maxNum) maxNum = val;
            }

        }


        return new int[] {minNum, maxNum} ;
    }
}
//Arrays.toString() → tek boyutlu diziler için.
//
//Arrays.deepToString() → çok boyutlu diziler (matris) için.