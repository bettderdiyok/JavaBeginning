
public class AssignmentOperators {

	public static void main(String[] args) {
		
	/*	int j, k;
		j = 10; // j ye 10 değeri atandı 
		j = 5; // j nin ilk değeri silindi; yerine 5 atandı 
		k = j; // k = 5 oldu 
		System.out.println("j = " + j); 
		System.out.println("k = " + k); 
		// Çoklu atama 
		k = j = 10; // (k = (j = 10)) 
		System.out.println("j = " + j); 
		System.out.println("k = " + k); 
*/
		
		int x = 5; 
		int y = 4; 
		System.out.print("x= " + x + " ve y = " + y + " ise x += y = "); 
		x += y; 
		System.out.println(x); 
		System.out.print("x= " + x + " ve y = " + y + " ise x -= y = "); 
		x -= y; 
		System.out.println(x); 
		System.out.print("x= " + x + " ve y = " + y + " ise x *= y = "); 
		x *= y; 
		System.out.println(x); 
		System.out.print("x= " + x + " ve y = " + y + " ise x /= y = "); 
		x /= y; 
		System.out.println(x); 
		System.out.print("x= " + x + " ve y = " + y + " ise x %= y = "); 
		x %= y;
		System.out.println(x); 


	}

}
