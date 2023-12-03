import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /* int[][] score = new int[2][3];
        score[0][0] = 15;
        score[0][1]= 78;
        score[0][2] = 11;
        score[1][0] = 1;
        score[1][1] = 99;
        score[1][2]= 978;
        for(int i=0; i<2; i++){
            for(int j=0; j<3; j++){
                System.out.print(score[i][j] + " ");
            }
            System.out.println();
        }
      //----------------------------

        int[][] score = {{1,2},
                         {3,5},
                        {56,89}};
        int row = score.length;
        int column = score[0].length;
        for(int i=0; i< row; i++){
            for(int j=0; j< column; j++){
                System.out.print(score[i][j] + " ");
            }
            System.out.println();
        }
       //-----------------------------------

        int[][] A = {{1,2,3,}, {5, 6, 7}, {0, 3, 4}};
        int[][] B = {{0,2,4},
                     {6,7,8},
                     {0,3,4}};
        int [][] newMatrix = new int[3][3];
        int row = A.length;
        int column = A[0].length;
        for (int i=0; i<row; i++){
            for(int j=0; j<column; j++){
                newMatrix[i][j] = A[i][j] + B[i][j];
            }
        }

        for(int i=0; i<row; i++){
            for(int j=0; j<column; j++){
                System.out.print(newMatrix[i][j] + " ");
            }
            System.out.println();

        }
        */
      String[][] str = {{"Ali", "Veli", "Kırk"}, {"Dokuz", "Elli", "Hasan"}, {"Boka", "Basan", "Eheheh"}};
        int row = str.length;
        int column = str[0].length;

        for(int i=0; i<row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print(str[i][j] + " ");
            }
            System.out.println();
        }





    }
}

