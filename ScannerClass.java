import java.util.Scanner;

public class ScannerClass {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int a, b;
		System.out.println("Enter first number:");
		a=input.nextInt();
		System.out.println("Enter second number:");
		b=input.nextInt();

		System.out.println("a=" + a + " b=" + b);
		
		boolean why;
		System.out.println("which? true or false");
		why = input.nextBoolean();
		System.out.println("result=" + why);
		
		byte num1;
		System.out.println("Enter a number:");
		num1 = input.nextByte();
		System.out.println("result=" + num1);
		
		double num2;
		System.out.println("Enter a number:");
		num2 = input.nextDouble();
		System.out.println("result=" + num2);
		
		
		String name;
		System.out.println("Enter a name:");
		name = input.next();
		System.out.println("result=" + name);
		
		
	
		
		
		
		
		
		
		
		
	
		
	}

}
