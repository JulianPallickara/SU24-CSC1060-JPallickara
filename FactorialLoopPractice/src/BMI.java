import java.util.Scanner;

public class BMI {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);

		System.out.println("How much do you weigh?");
		float weight = scn.nextFloat();

		System.out.println("How tall are you? (In feet).");
		float height = scn.nextFloat();

		float kgs = (float) (weight/2.205);

		float meters = (float) (height/ 3.281);
		
		double bmi = kgs / (Math.pow(meters, 2));

		System.out.println("Your BMI is " + bmi);

		scn.close();
	}

}