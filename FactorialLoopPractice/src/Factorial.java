import java.util.Scanner;

public class Factorial {
	public int factoral(int num) {
		int product = 1;
		if (num <= 1)
			return 1;
		return factoral(num - 1) * (num);
	}

	public static void main(String[] args) {
		System.out.println("What would you like your number to be?");
		Scanner scn = new Scanner(System.in);
		int num = scn.nextInt();

		Factorial factorial = new Factorial();
		
		int finalNum = factorial.factoral(num);

		System.out.println(finalNum);
	}

}