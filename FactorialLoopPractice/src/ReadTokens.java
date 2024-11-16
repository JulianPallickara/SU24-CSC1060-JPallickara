import java.util.Scanner;
import java.util.StringTokenizer;

public class ReadTokens {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Please enter a sentance");
		String sentance = scn.nextLine(); 
		String word;
		int counter =0;
		StringTokenizer tok = new StringTokenizer(sentance, " ");
		while (tok.hasMoreTokens()) {
			//System.out.println(tok.nextToken());
			word = tok.nextToken();
			counter++;
			if (counter == 3) {
				System.out.println("Your third word is " + word);
			}
		}
		
	}

}
