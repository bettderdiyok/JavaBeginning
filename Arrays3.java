
public class Arrays3 {

	public static void main(String[] args) {
		int[] array1 = {50, 60, 80, 85, 99, 100};
        int[] array2 = {5, 10, 15, 20, 25, 30};
        int[] array3 = new int[6];
        int sum = 0;
        for(int i=0; i<array1.length; i++) {
        	
        array3[i] = array1[i] + array2[i];  
     }
        
     for(int j=0; j<array3.length; j++) {
        	System.out.println(array3[j]);
        	sum = sum + array3[j];
        }
     System.out.println(sum);
 }
}