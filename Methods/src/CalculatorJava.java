import java.util.Scanner;


public class CalculatorJava {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		System.out.println ("Give me your first number.");
		Float num1 = scn.nextFloat();
		
		System.out.println ("Give me your second number.");
		Float num2 = scn.nextFloat();
		
		
		float add = add(num1, num2);
		System.out.println("When you add your numbers, you get " + add);
				
		float subtract = subtract(num1, num2);
		System.out.println("When you subtract your numbers, you get " + subtract);
			
		float multiply = multiply(num1, num2);
		System.out.println("When you multiply your numbers, you get " + multiply);
		
		float divide = divide(num1, num2);
		System.out.println("When you divide your numbers, you get " + divide);
		
		float mod = mod(num1, num2);
		System.out.println("When you mod your numbers, you get " + mod);
	
	}

	public static float add(Float num1, Float num2) {
		float add1 = num1 + num2;
		return add1;
	}

	public static float subtract(Float num1, Float num2) {
		float subtract1 = num1 - num2;
		return subtract1;
	}

	public static float multiply(Float num1, Float num2) {
		float multiply1 = num1 * num2;
		return multiply1;

	}

	public static float divide(Float num1, Float num2) {
		float divide1 = num1 / num2;
		return divide1;

	}

	public static float mod(Float num1, Float num2) {
		float mod1 = num1 % num2;
		return mod1;
	
}
	}