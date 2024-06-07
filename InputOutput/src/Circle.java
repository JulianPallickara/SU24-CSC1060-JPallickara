import java.util.Scanner;

public class Circle {

	public static void main(String[] args) {
		Scanner scn =  new Scanner(System.in);
		System.out.println("Here is a circle calculator, what would you like your radius to be?");
		Float rad = scn.nextFloat();
		System.out.println("For your radius of "+ rad + ", your perimeter is " + (rad * Math.PI * 2));
		System.out.println("For your radius of "+ rad + ", your area is " + (rad * Math.PI * rad));

	}

}
