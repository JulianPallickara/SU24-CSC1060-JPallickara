import java.util.Scanner;
public class RemainderCheckere {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		System.out.println("What would you like your first number to be");
		int num1 = scn.nextInt();
		
		System.out.println("What would you like your second number to be?");
		int num2 = scn.nextInt();

		int quotient = num1/num2;
		System.out.println("Your quotient is "+ (quotient));
		
		
		if (num1%num2==0) {
			System.out.println("Your numbers had no remainder!");
			
		} else {
			System.out.println("Your remainder is "+ (num1 % num2));
		
		}
	}
}
	


