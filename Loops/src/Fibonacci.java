import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("How many numbers deep do you want your fibbonacci sequence to go?");
		int fibnum = scn.nextInt();
		System.out.println("For loop");
		forFibonacci(fibnum);
		System.out.println("While loop");
		whileFibonacci(fibnum);

	}

	public static void forFibonacci(int fibnum) {
		int num1 = 1;
		int num2 = 1;
		int sum = 0;

		System.out.println("0 \n1 \n1");
		for (int i = 1; i < fibnum-1; i++) {
			sum = num1 + num2;
			num2 = num1;
			num1 = sum;
			System.out.println(num1);
			
		}
	}
	public static void whileFibonacci(int fibnum) {
		int num1 = 1;
		int num2 = 1;
		int sum = 0;
		int i = 1;
		System.out.println("0 \n1 \n1");
		while (i < fibnum-1) {
			sum = num1 + num2;
			num2 = num1;
			num1 = sum;
			System.out.println(num1);
			i++;
		}
	}

}