import java.util.Scanner;

public class SumFractions {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Wat do u want n to be?");
		
		int num = scn.nextInt();
		double sum = 0;

		for (int i = 1; i < num; i++) {
			sum +=  (1/(double)i);
			
		}
		System.out.println("Your sum is " + sum);
	}
}
