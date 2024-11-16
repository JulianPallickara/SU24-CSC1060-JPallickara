import java.util.Scanner;

public class NumberPalindrome {

	public String reverse(String letters) {
		String reversed = null;

		for (int i = 0; i < letters.length(); i++) {
			char letter = letters.charAt(letters.length() - i);
			System.out.println(letter);
		}

		return reversed;
	}

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("What number would you like to test?");
		int num = scn.nextInt();

		String numberString = new Integer(num).toString();

		System.out.println("Your number is: " + numberString);
		for (int i = 0; i < num; i++) {

		}

	}
}
