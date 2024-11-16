import java.util.Scanner;
public class AddSubtractMultiplyDivide {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		System.out.println("What would you like your first number to be?");
		Float num1 = scn.nextFloat();
		
		System.out.println("What would you like your second number to be?");
		Float num2 = scn.nextFloat();
		
		float add = num1+num2;
		float sub = num1-num2;
		float divide = num1/num2;
		float multiply = num1*num2;
		
		System.out.println("When you add " + num1 + "and "+ num2 + " you get " + add);
		System.out.println("When you subtract " + num1 + "and "+ num2 + " you get " + sub);
		System.out.println("When you divide " + num1 + "and "+ num2 + " you get " + divide);
		System.out.println("When you multiply " + num1 + "and "+ num2 + " you get " + multiply);

		System.exit(0);
	
	}

}
