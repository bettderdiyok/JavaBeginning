public class TwoDimensionalArray {
    public static void main(String[] args) {
  /*   Çok Boyutlu Dizide 1. tanımlama şekli
       int[][] score = new int[2][3];
        score[0][0] = 1;
        score[0][1] = 2;
        score[0][2] = 3;
        score[1][0] = 4;
        score[1][1] = 5;
        score[1][2] = 6;

        for(int i=0; i<2; i++){
            for(int j=0; j<3; j++){
                System.out.println(score[i][j]);

            }

        }
        */

        //2. gösterim
        int [][] a = {{1, 2, 3},
                          {4, 5, 6},
                          {7, 8 ,9},
                          {3, 2, 1}};// 4 tane parantez var 4 satır demek
          System.out.println(a[2][2]);
        System.out.println();


          int [][] b = {{5, 4, 3}, {4, 9, 0}, {2, 5, 0}, {4, 3, 2}};
          int [][] c = new int[4][3];

          for(int i=0; i<4; i++){
              for(int j=0; j<3; j++){
                  c[i][j] = a[i][j] + b[i][j];

              }


          }

       for(int i=0; i<4; i++){
           for(int j=0; j<3; j++){
               System.out.print(c[i][j] + " ");

           }
           System.out.println();

       }







    }
}
