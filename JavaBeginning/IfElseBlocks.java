import java.util.Scanner;

public class IfElseBlocks {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num1, num2;
		
		System.out.print("Enter num1 = ");
		num1 = input.nextInt();
		
		System.out.print("Enter num2 = ");
		num2 = input.nextInt();
		
		if(num1 > num2) {
			System.out.println("num1 is bigger than num2");
			
		}
		
		else
			System.out.println("num2 is bigger than num1");
	}
}


