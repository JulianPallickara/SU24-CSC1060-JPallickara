import java.util.Scanner;

public class CircleCalculator {

	public static void main(String[] args) {
		double circ = 0;
		double area = 0;
		
		Scanner scn = new Scanner(System.in);
		System.out.println("What would you like your radius to be?");
		float rad = scn.nextFloat();

		circ = circCalc(rad);
		
		area = areaCalc(rad);
		
		System.out.println("Your circumference is " + circ + " units.");
		System.out.println("Your diameter is " + (rad*2) + " units");
		System.out.println("Your area is " + area + " units squared.");

		scn.close();

	}

	private static double areaCalc(float rad) {
		return (rad * Math.PI * rad);
	}

	private static double circCalc(float rad) {
		return (2 * Math.PI * rad);
	}

}
