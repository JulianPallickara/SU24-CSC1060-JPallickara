import java.util.Scanner;

public class Graphs {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("What would you like your width to be?");
		int x = scn.nextInt();

		System.out.println("What would you like your length to be?");
		int y = scn.nextInt();

		String str = "";
		for (int i = 1; i <= x; i++) {
			str += "#";

		}
		for (int j = 1; j <= y; j++) {
			System.out.print(str + "\n");
			// System.out.println(str);

		}

	}

}
