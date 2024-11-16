import java.util.Scanner;

public class StringProcessing {

	public String reverse(String text) {

		char[] reversedArray = new char[text.length()];

		for (int i = 0; i < text.length(); i++) {
			reversedArray[i] = text.charAt(text.length() - i - 1);

		}
		String reverseString = new String(reversedArray);
		return reverseString;
	}

	public int theLength(String statement) {
		int length = statement.length();
		return length;
	}

	public char firstChar(String statement) {
		char first = statement.charAt(0);
		return first;

	}

	public char lastChar(String statement) {
		char last = statement.charAt(statement.length());
		return last;

	}

	public boolean isPalindrome(String text) {
		boolean palindrome = false;
		String reverseString = reverse(text);

		if (reverseString.equals(text)) {
			palindrome = true;
		}
		return palindrome;
	}

	public static void main(String[] args) {
		StringProcessing streamer = new StringProcessing();

		Scanner scn = new Scanner(System.in);

		System.out.println("What would you like your statement to be?");
		String statement = scn.next();
		String juliansText = "HelloThere";

		System.out.println("What would you like your number to be?");
		int num = scn.nextInt();

		switch (num) {
		case 4:
			String reverseString = streamer.reverse(statement);
			System.out.println("The reversed string is " + reverseString);
			break;

		case 5:
			boolean isPalindrome = streamer.isPalindrome(statement);
			if (isPalindrome) {
				System.out.println("Your statement was a palindrome!");
			} else {
				System.out.println("Your statement was not a palindrome.");
			}
			break;
		case 1:
			int theLength = streamer.theLength(statement);
			System.out.println("The length of your statement was " + theLength);
			break;
		case 2:
			int firstChar = streamer.firstChar(statement);
			System.out.println("The first character in your string was " + firstChar);
			break;
			
		case 3:
			int lastChar = streamer.lastChar(statement);
			System.out.println("The first character in your string was " + lastChar);
			break;
		default:
			System.out.println("The number you entered awwas not valid.");
		}

	}

}
