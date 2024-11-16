import java.util.Scanner;

public class PalindromeChecker {

	public static String reverse(String letters) {
		String reversed = "";
		char letter;
		for (int i = 1; i <= letters.length(); i++) {
			letter = letters.charAt(letters.length() - i);
			System.out.println(letter);
		}
			
		return reversed;

	}

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("What would you like your sentance to be?");

		while (scn.hasNext()) {
			String sent = scn.next();

			if (reverse(sent).equals(sent)) {
				System.out.println(" Your message of " + sent + " was a palindrome");

			} else {
				System.out.println(" Your message of " + sent + " was not a palindrome.");
			}
		}

	}
}