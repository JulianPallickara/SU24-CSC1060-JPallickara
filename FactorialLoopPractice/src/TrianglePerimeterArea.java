import java.util.Scanner;

public class TrianglePerimeterArea {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);

		System.out.println("What would you like your side 'a' to be?");
		float sidea = scn.nextFloat();

		System.out.println("What would you like your side 'b' to be? This will be your base.");
		float base = scn.nextFloat();

		System.out.println("What would you like your side 'c' to be?");
		float sidec = scn.nextFloat();

		System.out.println("What would you like your height to be?");
		float height = scn.nextFloat();

		double perm = (sidea + base + sidec);
		double area = (0.5 * base * height);

		System.out.println("Your perimeter is " + perm);
		System.out.println("Your area is " + area);

		scn.close();
	}

}
