
public class MathMethods {

	public static void main(String[] args) {
		int num1, num2, num3;
		num1 = 15;
		num2 = -10;
		double num = -25;
		double num4 = -9.7;
		double num5 = 9.7;
		double num6 = 9.2;
		int abs = Math.abs(num2); 
		System.out.println(abs);
		System.out.println(Math.abs(num));
	    
		//Tabana yuvarlama: ceil method
		System.out.println(Math.ceil(num4));
		System.out.println(Math.ceil(num5));
		System.out.println(Math.ceil(num6));
		
		//Tavana yuvarlama :floor method
		System.out.println(Math.floor(num6));
		System.out.println(Math.floor(num4));
		
		// pi sayısı tanımlama. Math kütüphanesi içinde tanımlanmış PI sabit sayısı vardır.
		System.out.println(Math.PI);
		System.out.println(Math.PI * Math.pow(3, 2));
		
		
		//trigonometrik fonksiyon kullanımı sin, cos, tan, cot:
		System.out.println(Math.sin(30)); //radyan cinsinden
		System.out.println(Math.sin(30*Math.PI/180));
		System.out.println(Math.sin(90*Math.PI/180));
		System.out.println(Math.cos(0*Math.PI/180));
		System.out.println(Math.tan(45*Math.PI/180));
		
		//Kuvvet hesabı:
		System.out.println((int)Math.pow(2, 10));
		
		//Karekök hesabı:
		System.out.println(Math.sqrt(9));
		
		// max method iki sayıdan büyük olanı yazdırır
		int  a=5, b=1;
		System.out.println(Math.max(a, b));
		System.out.println(Math.max(5.3, 6)); 
		//double değer yazdırır int e atayamazsın.
		
		
		// min method iki sayıdan küçük olanı döndürür.
		System.out.println(Math.min(a, b));
		System.out.println(Math.min(11, 99.0));
		//yanındaki sayı double olduğundan double olarak sonuç verir.
		
		// 0 ile 1 arasındaki rastgele sayıları yazdırmak için:
		// 0 dahil 1 hariç
		System.out.println(Math.random());
		System.out.println(Math.random()*10);// 0 ile 10 arasında olur 10 olmaz
		// 0 ile 10 arasında tam sayı olsun istiyorsak:
		System.out.println((int)(Math.random()*10));//parantezlere dikkat
		
		int lowerBounds = 50;
		int upperBounds = 100+1 - lowerBounds;
		
       //50 -150 arası 50 ve 150 dahil sayılar gelir.
		  for(int i=0; i<100; i++) {
			System.out.println((int)(lowerBounds + Math.random()* upperBounds));
			
		}
		
		// round method en yakın tam sayıya yuvarlar.
		 
		  System.out.println(Math.round(5.6));
		  System.out.println(Math.round(5.5));
		  System.out.println(Math.round(5.2));
		  
		  
		 int c, d;
		 c = (int)Math.round(4.5); //long değer döndürür long daha büyüktür intten bu yüzden atayamayız.
		// type casting yaparak zorla atarız.
		 System.out.println(c);
		 
		 d = Math.round(4.5f); // parantez float olduğundan int döndürecek.
		 System.out.println(d);
		 
		
		

	}

}
