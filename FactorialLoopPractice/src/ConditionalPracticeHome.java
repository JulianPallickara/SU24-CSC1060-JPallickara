import java.util.Scanner;

public class ConditionalPracticeHome {

	private static final Object M = null;

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("How expensive are these glasses?");
		double price = scn.nextInt();
		
		System.out.println("How old are you?");
		int age = scn.nextInt();
		
		System.out.println("What is your gender? Please enter M or F (our store is in Texas)");
		String gender = scn.next();
		
	
	if (age < 15) {
		System.out.println("Your price is now " + (0.7 * price));
	}

	if (age > 65) {
		System.out.println("Your price is now " + (0.6 * price));
	}
	
	if (age > 65 && gender.equals("W")) {
		System.out.println("Your price is now "+ (0.9 * price));

	if (age > 65 && gender.equals("M")) {
			System.out.println("Your price is now "+ (0.91 * price));
	}else {
		System.out.println("Get your ass out of my store before I shoot your head off. ");
	}
	}
}
}
//<15 years old 30% discount, >65 40% discount, >15 + <65 women, 10% discount, in same group men 9%, what is age, gender, 
//price of glasses
