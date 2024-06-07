import java.util.Scanner;

public class Cylinder {


	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);

		System.out.println("This gives you the area of a cylinder as well as its volume. "
				+ "What would you like your radius to be?");
		Float radius = scn.nextFloat();

		System.out.println("What would you like your length to be?");
		Float length = scn.nextFloat();

		double area = computearea(radius);
		double volume = computevolume(area, length);
				
		System.out.printf("Your area is %.2f units squared", area);
		
		System.out.printf(" Your volume is %.2f units cubed", volume);
	
	}
	
	public static double computearea(double radius) {
		double area = radius * radius * Math.PI;
		return area;

	}

	public static double computevolume(double area, double length) {
		double volume =  area*length;
		return volume;
	
	}
}