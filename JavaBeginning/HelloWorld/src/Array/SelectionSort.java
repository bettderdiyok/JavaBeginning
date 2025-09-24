package Array;
import java.util.Arrays;

public class SelectionSort {

        public static void main(String[] args) {
            int[] numbers = {64, 25, 12, 22, 11};

            System.out.println("Before sorting: " + Arrays.toString(numbers));

            selectionSort(numbers);

            System.out.println("After sorting: " + Arrays.toString(numbers));
        }

        public static void selectionSort(int[] array) {
            int n = array.length;

            // dış döngü: her adımda doğru pozisyona bir eleman koyar
            for (int i = 0; i < n - 1; i++) {
                // i. pozisyondan sonra en küçük elemanı bul
                int minIndex = i;
                for (int j = i + 1; j < n; j++) {
                    if (array[j] < array[minIndex]) {
                        minIndex = j;
                    }
                }

                // en küçük ile i. elemanı swap et
                int temp = array[i];
                array[i] = array[minIndex];
                array[minIndex] = temp;

                // her adımı görmek için
                System.out.println("Step " + (i+1) + ": " + Arrays.toString(array));
            }
        }
    }

