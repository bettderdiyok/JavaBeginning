public class MethodArraysMinNumberShort {
    public static void main(String[] args) {
        int[] array1={3,11,15,13,4,5,7,8,4,5,7,8,2,3,2,3,4,5,7,8,9,11,15,13,4,5,7,8,9,11,15,13,9,11,15,13};
    }
    public static int dizidekiEnBuyukveEnKucukElemanlarinToplami(int[] myarray){
        //parametre olarak gelen myarray dizisindeki en büyük ve en küçük elemanların toplamını döndürün
        int min=myarray[0];
        for(int x:myarray){
            if(x<min){
                min=myarray[x];
            }

        }

        return -1;
    }
}
