import java.util.Scanner;

public class TimesTable1 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("What would you like your number to be?");
		int num = scn.nextInt();
		
		if (num <= 0) {
			for (int i = 1; i == 10; i++);
			int mult = (num*i);
			System.out.println(mult);
		}
		else {
			System.out.println("Your number is not aplicable for this test.");
		}
	}

}
