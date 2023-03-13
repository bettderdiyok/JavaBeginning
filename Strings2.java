
public class Strings2 {

	public static void main(String[] args) {
		String str1, str2, str3, str4, str5, str6;
		str1 = "hello";
		str2 = "JAVA ";
		str3 = "Learning ";
		str4 = "is Easy";
		str5 = "electric electronic";
		str6 = "HELLO";
		
	/*	str5 = str1.concat(str2).concat(str3).concat(str4);
		System.out.println(str5);
    */

	System.out.println(str1.indexOf('z')); // Sonuç -1 ise aradığın harf yoktur
	System.out.println(str1.indexOf('o'));	
	System.out.println(str4.indexOf('s'));
	System.out.println(str4.lastIndexOf('s'));
	System.out.println(str5.lastIndexOf('e'));
	//Eğer kelimede aynı harften birden fazla varsa indexOf() metodu ilk olanı bize getirir.
		
				
    int a;
     
    
    a = str2.charAt(3);
    System.out.println(a); 
    // a int olduğundan ASCII tablosundaki karşılık geleni yazdırdı.
				
    int b= str1.compareTo(str2);
    System.out.println(b);
    
   int c = str1.compareToIgnoreCase(str6);
    System.out.println(c);
    
    
    
		

	}

}
