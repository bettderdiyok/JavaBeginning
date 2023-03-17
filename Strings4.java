
public class Strings4 {

	public static void main(String[] args) {
		String str = "abc ABC 123 abc 123";
		String strNew = str.replace("123", "bet");
		String strNew2= str.replaceAll("123", "HELLO");
		//bir karakteri kaldır ve yerine başka bir şey koy demek.
		System.out.println(strNew);
		System.out.println(strNew2);
		System.out.println(strNew.indexOf("A"));
		System.out.println(strNew.charAt(4));
		//Küçük a harifini silip atmak için :
		
		System.out.println(str.replace("a", ""));
		System.out.println(str.replace("a", " "));
		
		String sentence ="Bir berbr bir berbere gel beraber bir berbr dükkanı açalım demiş";
		System.out.println(sentence.replaceAll("berbr", "berber"));
		System.out.println(str.replaceAll(" ", ""));
		
		System.out.println(str.replaceAll("([a-z])","")); 
		// a dan z ye olan hepsini "" arasındaki ile değiştir.
		System.out.println(str.replaceAll("([0-9])","")); 
		
		
		
		String strs = "   A B C D   ";
		System.out.println(strs.length());
		//Bir string in başındaki ve sonundaki karakteri kaldırma:
		System.out.println(strs.trim());
		
		
		String strs2 = "Başarının yolu, konuşmayı bırakmak ve yapmaya başlamaktır.";		
		System.out.println(strs2.substring(10));
		// 10 ve 10 dan sonrakileri yazdırır.
		
		//Metin içerisinden parça almak başlangıcı ve sonu verilen 
		System.out.println(strs2.substring(10, 13));
		//10 dan başla indisi 13 e kadar olan ı al 13 ü alma
		
		
		int length1 = strs2.length();
		System.out.println(length1);
		
		System.out.println(strs2.substring(10, length1));
		
		
		
		
		
		
		
		
		
	}

}
