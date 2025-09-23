package Array;

public class ArrayCopy {
    public static void main(String[] args) {
        int[] mainArray =  {1, 7, 9, 10};
        int[] copyArray = new int[mainArray.length];

        for (int i=0; i<mainArray.length; i++){
            System.out.println(copyArray[i]);
            copyArray[i] = mainArray[i];
            System.out.println(copyArray[i]);
        }

        //arraycopy
        int[] copyArray2 = new int[mainArray.length];
        System.arraycopy(mainArray,0,copyArray2, 0, mainArray.length);
        for (int num : copyArray2) {
            System.out.println(num);

        }
    }

}
