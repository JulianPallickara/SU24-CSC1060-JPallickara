import java.util.Scanner;
public class NumberGuesser {

	public static void main(String[] args) {
		Scanner scn = new Scanner (System.in);
		
		int num = 9;
		int counter = 0;
		
		System.out.println("You will guess a number between 1-10. I will give you your count.");
		
		counter = 0;
		    while(num == num) {
				System.out.println("What would you like your guess to be?");
				int guesses = scn.nextInt();
				if (guesses == num);
					System.out.println("Nice you got it right! It took you " + counter + " guesses");
				}
				if (counter != num){
					counter = counter+1;
					System.out.println("You got it wrong. Your guess number so far is " + counter);
				
			}
	}

}