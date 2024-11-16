import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);

		System.out.println("What is the name you would like to chose?");
		String name = scn.next();

		switch (name) {
		case "John", "Bill":
			System.out.println("This name has 4 letters.");
			break;
		case "Megan":
			System.out.println("This name has 5 letters.");
			break;
		case "Julian":
			System.out.println("This name has 6 letters.");
			break;
		default:
			System.out.println("This name is not in our files");

		}

		int num = switch (name) {
		case "John", "Bill":
			yield 4;
		case "Megan":

			yield 5;
		case "Julian":

			yield 6;
		default:
			yield -1;

		};
		System.out.println("The string that you specified has " + num + " characters.");
	}
}