import java.util.Scanner;

public class CharacterAtIndex {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("What would you like your word to be?");
		String word = scn.next();

		System.out.println("What is a number that you like?");
		int num = scn.nextInt();

		int index = num + 1;

		char letter = word.charAt(index);
		System.out.println("Your letter is " + letter);
	}

}
