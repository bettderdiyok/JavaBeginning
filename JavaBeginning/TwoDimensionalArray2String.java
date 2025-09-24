public class TwoDimensionalArray2String {
    public static void main(String[] args) {
        String[][] str = {{"Betül", "Selim", "Ediz"}, {"Özlem", "Buse", "Ayberk"} };
        for(int i=0; i<2; i++){
            for(int j=0; j<3; j++){
                System.out.print(str[i][j] + " ");

            }
            System.out.println();

        }
        System.out.println(str[0][1]);
        System.out.println(str.length); //satır sayısını veriyor
        System.out.println(str[0].length); //sütun sayısını verdi 0. satırın sütun sayısı
    }
}