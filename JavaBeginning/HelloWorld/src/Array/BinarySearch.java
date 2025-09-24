package Array;

public class BinarySearch {

    public static void main(String[] args) {
       int[] arrayNumber = {1, 3, 5, 7, 9, 11, 13};
       int target = 9;
       binarySearch(arrayNumber, target);

    }

    public static void selectionSort(int[] arrayNumber){
        int minIndex;
        int temp;
        for (int i=0; i<arrayNumber.length; i++) {
            minIndex = i;
            for (int j = i+1; j<arrayNumber.length; j++) {
                if(arrayNumber[j] < arrayNumber[minIndex]){
                    minIndex = j;
                }
            }
            //swap
             temp = arrayNumber[i];
             arrayNumber[i] = arrayNumber[minIndex];
             arrayNumber[minIndex] = temp;



        }

    }

    public static int binarySearch (int[] numbersArray, int target){
        selectionSort(numbersArray);
        int lowIndex = 0;
        int highIndex =numbersArray.length-1;

        while(highIndex >= lowIndex) {
            int midIndex = (lowIndex + highIndex) / 2;
            if (target < numbersArray[midIndex]){
                highIndex = midIndex - 1;
            }else if(target == midIndex) {
                return midIndex;
            }else {
                lowIndex = midIndex + 1;
            }


        }
        return lowIndex - 1;

    }
}
