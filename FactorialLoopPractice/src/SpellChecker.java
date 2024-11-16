import java.util.Scanner;

public class SpellChecker {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
	
		int counter = 0;
		String answer1 = ("Alaska");
		String answer2 = ("Missouri");
		String answer3 = ("Massachusettes");
		String answer4 = ("Pheonix");
		String answer5 = ("California");
		String answer6 = ("Rhode Island");
		String answer7 = ("John Jonah Jameson");
	
		System.out.println("What is the biggest state in the USA?");
		String que1 = scn.nextLine();
	    
	    System.out.println("You entered: " + que1);
		if (que1.equals(answer1)) {
			System.out.println("Correct!");
			counter ++; 
		}else {
			System.out.println("Incorrect");
		}
		
		System.out.println("What is the longest river in the US?");
		String que2 = scn.nextLine();
		
	    System.out.println("You entered: " + que2);
	    
		if (que2.equals(answer2)) {
			System.out.println("Correct!");
			counter++; 
		}else {
			System.out.println("Incorrect");
		}
		
		
		System.out.println("Which state is Boston located in?");
		String que3 = scn.nextLine();
		
	    System.out.println("You entered: " + que3);
	
		if (que3.equals(answer3)) {
			System.out.println("Correct!");
			counter++; 
		} else {
			System.out.println("Incorrect");
		}

		
		System.out.println("What is the biggest city in Arizona?");
		String que4 = scn.nextLine();

	    System.out.println("You entered: " + que4);

		if (que4.equals(answer4)) {
			System.out.println("Correct!");
			counter++; 
		}else {
			System.out.println("Incorrect");
		}
		
		System.out.println("Which state has the largest population?");
		String que5 = scn.nextLine();
		
	    System.out.println("You entered: " + que5);

		if (que5.equals(answer5)) {
			System.out.println("Correct!");
			counter++; 
		}else {
			System.out.println("Incorrect");
		}
		
		System.out.println("Which is the smallest state in the US?");
		String que6 = scn.nextLine();
		
		System.out.println("You entered" + que6);
		
		
	
		if (que6.equals(answer6)) {
			System.out.println("Correct!");
			counter++; 
		}else {
			System.out.println("Incorrect");
		}
		
		
		System.out.println("What is the full name of Peter Parker's boss at the Daily Bugle?");
		String que7 = scn.nextLine();
		
	    System.out.println("You entered: " + que7);
		
		if (que7.equals(answer7)) {
			System.out.println("Correct!");
			counter++; 
		}else {
			System.out.println("Incorrect");
		}
		System.out.println("Your final score was "+ counter + "/7");
	}
}
