
public class Operators2 {

	public static void main(String[] args) {
	/*	int x = 10; 
		int y =3; 
		System.out.println("x / y = " + (x / y) ); 
		System.out.println("(int)(x / y) = " + (int)(x / y)); 
		System.out.println("(float)(x / y) = " + (float)(x / y) ); 
		System.out.println("(double)(x / y) = " + (double)(x / y)); 
		System.out.println("(float)x / y) = " + ((float)x / y)); 
		System.out.println("(double)x / y) = " + ((double)x / y)); 
*/
		int x, y, isonuç ; 
		float fsonuç ; 
		double dsonuç; 
		x = 7; 
		y = 5; 
		isonuç = x/y; 
		System.out.println("x / y = " + isonuç ); 
		fsonuç = (float) x / y; 
		System.out.println("x / y = " + fsonuç ); 
		fsonuç = x / (float) y; 
		System.out.println("x / y = " + fsonuç ); 
		fsonuç = (float)x / (float) y; 
		System.out.println("x / y = " + fsonuç ); 
		dsonuç = (double)x/y; 
		System.out.println("x / y = " + dsonuç ); 
		dsonuç = x/(double)y; 
		System.out.println("x / y = " + dsonuç ); 
		dsonuç = x/(double)y; 
		System.out.println("x / y = " + dsonuç ); 


	}

}
