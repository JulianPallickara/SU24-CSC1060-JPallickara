import java.util.Scanner;

public class VowelCounter {

	public static void main(String[] args) {
		
		int counter = 0;
		Scanner scn = new Scanner(System.in);
		
		System.out.println("What would you like your word to be?");
		
		String word = scn.next();
		
		char test;
		
		for (int i = 0; i <= word.length() - 1; i++) {
			
			test = word.charAt(i);
			if (test == 'a' || test == 'e' || test == 'i' || test == 'o' || test == 'u') {
				counter ++;
			}
		}
		System.out.println("Your word, " + word + " had " + counter + " vowel(s) in it.");
	}

}
