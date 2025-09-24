
public class Arrays2 {

	public static void main(String[] args) {
		/* double [] studentNotes = new double[6];
		studentNotes[0] = 40;
		studentNotes[1] = 15;
		studentNotes[2] = 30;
		studentNotes[3] = 95;
		studentNotes[4] = 70;
		
		
		for(int i=0; i<=5; i++) {
			System.out.println(studentNotes[i]);
			
		}
		*/
		//Diğer dizi gösterimi
		
		double[] studentNotes={40, 15, 30, 95, 70};
		for(int i=0; i<5; i++) {
			System.out.println(studentNotes[i]);
			
		}
		System.out.println(studentNotes.length);
		
		/*int[] intArray = {1.4,2.5};
       int veri tipindeki bir diziye double tipli değerler atayamazsın
		*/
		String[] stringArray = {"Betül", "Selim", "Ayberk"};
		System.out.println(stringArray[1]);
	int sum=0;
	int[] numbers = {5, 7, 3, 5, 1, 7, 8};
	for(int i=0; i<numbers.length; i++) {
		sum = sum + numbers[i];
		
	}
	  System.out.println("Sum = " + sum);
	}
	
	

}
