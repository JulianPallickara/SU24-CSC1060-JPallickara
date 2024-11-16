import java.util.Scanner;

public class DistanceBetweenPoints {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);

		System.out.println("What is your X for your first cordinate?");
		Float x1 = scn.nextFloat();

		System.out.println("What is your Y for your first cordinate?");
		Float y1 = scn.nextFloat();

		System.out.println("What is your X for your second cordinate?");
		Float x2 = scn.nextFloat();

		System.out.println("What is your Y for your second cordinate?");
		Float y2 = scn.nextFloat();

		double distance = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));

		System.out.println("The distance between your 2 points is " + distance + " units.");

		scn.close();
	}

}
