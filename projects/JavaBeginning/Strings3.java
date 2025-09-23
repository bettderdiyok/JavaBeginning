
public class Strings3 {

	public static void main(String[] args) {
		String example = "Hello world world world";
		System.out.println(example.contains("lo"));
		System.out.println(example.contains("ab"));
		//Belli bir karakter dizisini içerip içermediğini kontrol ediyoruz.

		System.out.println(example.endsWith("lo")); 
		// karakter dizimi lo ile bitiyor muı ?
		System.out.println(example.replace('l', 't'));
		//replace karakter bazında çalışıyor.
		System.out.println(example.replaceAll("Hello", "Hi"));
		System.out.println(example.replaceAll("world", "mars"));
		
		System.out.println(example.replaceFirst("world", "mars"));
		
		System.out.println(example.toLowerCase());
		System.out.println(example.toUpperCase());
		
	}

}
