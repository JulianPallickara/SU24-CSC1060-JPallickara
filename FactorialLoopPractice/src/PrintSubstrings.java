import java.util.Scanner;

public class PrintSubstrings {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("What would you like your word to be?");

		String mess = scn.next();

		for (int i = 0; i < mess.length() + 1; i++) {
			String let = mess.substring(0, i);
			System.out.println(let);

		}
	}

}
