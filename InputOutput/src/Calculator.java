import java.util.Scanner;
public class Calculator {

	
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.println("Put in your first number here. ");
	float num1 = input.nextFloat();
	
	System.out.println("Put in your second number here. ");
	float num2 = input.nextFloat();

	System.out.println(num1 + "+" + num2 + " = " + (num1 + num2));
	System.out.println(num1 + "-" + num2 + " = " + (num1 - num2));
	System.out.println(num1 + "*" + num2 + " = " + (num1 * num2));
	System.out.println(num1 + "/" + num2 + " = " + (num1 / num2));
	System.out.println(num1 + "%" + num2 + " = " + (num1 % num2));

	}

}
