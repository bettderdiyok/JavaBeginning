import java.util.Scanner;

public class IfElseSituations {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		float clock;
		
		System.out.print("What time is it?  ");
		clock = input.nextFloat();
		
		if(clock < 12) {
			System.out.println("Good Mornings!");
		
		}
		
		else if(clock < 17) {
			System.out.println("Good Days!");
			
		}
		else if(clock < 21) {
			System.out.println("Good Evenings!");
			
		}
		else
			System.out.println("Good Nights!");
		
	}
}
