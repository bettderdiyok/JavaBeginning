package Array;

public class SwapElementsArray {
    public static void main(String[] args) {
       int[] numbers = {1, 9, 5, 2, 7, 9, 60, 120, 55, -9};
       printArray(numbers);
       swapElements(numbers);

    }

    public static void printArray (int []array){
        for(int num : array) {
            System.out.print(num + " ");

        }
        System.out.println("\n");
    }

    public static void swapElements(int[] array) {
        int randomNumber;
        int temp;
        for (int i=0; i<array.length; i++){
            randomNumber = (int)(Math.random() * array.length);
            temp = array[randomNumber];
            array[randomNumber] = array[i];
            array[i] = temp;
        }
        printArray(array);
    }
}
