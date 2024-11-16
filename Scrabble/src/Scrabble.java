import java.util.Scanner;

public class Scrabble {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("What is the word you would like to do? (Seven letters)");
		String tiles = scn.next();
		
		
		System.out.println("Enter the letters of your word");
		String word = scn.next();
		
		System.out.println(canSpell(tiles,word));

	}

	private static  boolean canSpell(String tiles, String word) {
		
		
		int count = 0;
		for(int i = 0; i <word.length(); i++) {
			for (int j = 0; j < tiles.length(); j++) {
				if(tiles.charAt(j) == word.charAt(i)) {
					tiles = tiles.substring(0,j)+tiles.substring(j+1);
					count++;
				}
			}
		}
		if(count == word.length()) return true;
		
		
		return false;
		
	}

}
