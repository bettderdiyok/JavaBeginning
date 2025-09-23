package Array;

public class TwoDimensionalArray {
    public static void main(String[] args) {
        int [][] numberMatrix = { {1,6,2}, {1,9,4}};
         for (int i=0; i<numberMatrix.length; i++) {
             for (int j=0; j<numberMatrix[0].length; j++) {
                 System.out.print(numberMatrix[i][j] + " ");
             }
             System.out.println("\n");

         }

    }
}
