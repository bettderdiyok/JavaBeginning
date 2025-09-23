public class Examples {
    public static void main(String[] args) {
        int[] array = new int[100];
        createArrayElements(array);
        printArray(array);
        System.out.println(calculateAverage(array));
        System.out.println(howManyElements(calculateAverage(array), array));
    }

    public static void createArrayElements(int[] array){
        for (int i=0; i< array.length; i++){
            int randomNum = (int) (Math.random() * 100 + 1);
            array[i] = randomNum;
        }

    }
    public static void printArray(int[] array){
        for (int num: array){
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static double calculateAverage(int[] array){
        int sum = 0;
        double average;
        for (int num : array) {
            sum += num;
        }
        average = (double)sum / array.length;

        return average;

    }

    public static int howManyElements(double average, int[] array) {
        int count = 0;
        for (int i=0; i<array.length; i++) {
            if (array[i] < average) {
                count++;
            }
        }
        return count;
    }
}
