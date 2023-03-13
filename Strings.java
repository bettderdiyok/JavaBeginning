
public class Strings {

	public static void main(String[] args) {
		String str1 = "Hello Java";
				System.out.println(str1);
				System.out.println(str1.length()); //Uzunluğunu verir
				System.out.println(str1.charAt(6)); //6. harfi verir.
				
				//length bir metod bu yüzden () ile bitmesi gerek
				int length = str1.length();
				System.out.println(length);
				
				String str2 = "Hello Java" + "Java is the best"	;	
				System.out.println(str2.length());
				
				
				String str3, str4 , str5;
				
				str3 = "Hello";
				str4 = "Java";
				str5 = str3 + str4;
				/*
				System.out.println(str5.length());
	üstteki + ile birleştirme yerine String de concat metodu kullanılır */
				
				str5 = str3.concat(str4);
				System.out.println(str5 + "-" + str5.length());
				

	}

}
