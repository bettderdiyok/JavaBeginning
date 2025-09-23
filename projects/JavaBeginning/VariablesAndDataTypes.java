
public class VariablesAndDataTypes {

	public static void main(String[] args) {
		byte num1 = 120;
		System.out.println(num1);
		
	/*	byte = 128; 1 bytlık yer tutar ve -128 ile 127 arasında değer alır.
	      bu yüzden  hata verir.
		*/
		
		double num2 = 5;
		System.out.println(num2);
		
		double num3 = 5.2;
		System.out.println(num3);
		
		/* float num4 = 5.2; Hata verir çünkü burada float olduğunu 5.2f veya 5.2F veya Casting yani tip dönüşümü(float)num4
	ile yapmamız gerek yapmazsak 5.2 yi double olarak algılıyor 
	ve double 8byte ve float 4 bytle lık yer kapladığı için double ı float a ataymayacağımız için de hata veriyor.
	*/
		
		float num5 = 5.2f;
		System.out.println(num5);
		
		char letter ='B';
		System.out.println(letter);
		
		char letter2 = 'B';
		System.out.println((int)letter2); // ASCII Table
		
		char letter3 = 66;
                System.out.println(letter3);
		
		boolean why=true; // ya true ya false olmalı
		System.out.println(why);
		
		String name = "Betül";
		System.out.println(name);
		}
	

}
