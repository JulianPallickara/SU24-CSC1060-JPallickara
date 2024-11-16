import java.util.Scanner;

public class SpecificCharacter {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("What would you like your word to be?");
		String word = scn.next();
		
		System.out.println("What letter do you think your statement ends with?");
		int reccomended = scn.nextInt();
		char letter = word.charAt(word.length()+1);
		
		if (reccomended == letter) {
			System.out.println("Nice! You got it right!");
		}else {
		System.out.println("You got it wrong, the letter was " + letter);
	}
}
}