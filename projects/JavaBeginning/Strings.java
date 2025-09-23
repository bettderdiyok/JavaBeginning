
public class Strings {

	public static void main(String[] args) {
		 /* String str = "Hello Java";
       		String str2 = "My name is Betty" + "How are you?";
        	String str3 = "Did you have a good day?";
        	String str4;
        	int a = str.length();
        	System.out.println(str.length());
        	System.out.println(a);
        	System.out.println(str2.length());
        	//String Birlestirme
       		System.out.println(str.concat(" I'm Betty"));
        	str4 = str + str3;
       		System.out.println(str4.length());
        */
		String str1 = "Hello Java";
		String st1, st2, st3, st4, st5, st6;
                int a, b2;
		st1 = "Hello!";
                st2 = " Java is ";
                st3 = " Learning";
                st4 = "Easy";
                st5 = st1.concat(st3).concat(st2).concat(st4);
		st6 = "hELLO!";
		
		a = st1.compareTo(st4);
       		b2 = st1.compareTo(st1);
				
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
		
                

        	System.out.println(st5);
        	System.out.println(st5.length());
		System.out.println(st5);
        	System.out.println(st5.length());
        	System.out.println(st1.indexOf('o'));

        	System.out.println(st1.indexOf('b'));
        	System.out.println(st1.lastIndexOf('l'));
        	System.out.println(st1.charAt(4));
        	System.out.println(a);
        	System.out.println(b2);
        	System.out.println(st1.compareToIgnoreCase(st6));
        	System.out.println(st1.contains("lo"));
        	System.out.println(st1.endsWith("lo"));
        	System.out.println(st1.replace("o","e"));
        	System.out.println(st1.replaceAll("Hello!", "Halo!!"));
        	System.out.println(st1.replaceFirst("l", "i"));
        	System.out.println(st1.toLowerCase());
        	System.out.println(st1.toUpperCase());
				

	}

}
