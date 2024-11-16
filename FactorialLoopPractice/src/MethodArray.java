
import java.util.Random;
import java.util.Scanner;

public class MethodArray {

	public int numberOfElements(int[] array) {
		int num1 = 100;
		return num1;
	}

	public int sumOfElements(int[] array) {
		int sum = 0;
		for (int i = 0; i == 100; i++) {
			sum += array[i];
		}
		return sum;

	}

	public int lastNumber(int[] array) {
		int last = array[array.length - 1];
		return last;
	}

	public int firstNumber(int[] array) {
		int first = array[0];
		return first;
	}

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		Random random = new Random();

		int num = scn.nextInt();

		int[] array = new int[100];

		for (int i = 0; i < 100; i++) {
			array[i] = random.nextInt(1, 100);
		}

		MethodArray methodArray = new MethodArray();

		switch (num) {
		case 1:
			int elements = methodArray.numberOfElements(array);
			System.out.println("The number of elements in your array was " + elements);
			break;
		case 2:
			int sum = methodArray.sumOfElements(array);
			System.out.println("The sum of all your elements in your array was " + sum);
			break;
		case 3:
			int first = methodArray.firstNumber(array);
			System.out.println("The last number in your array was " + first);
			break;
		case 4:
			int last = methodArray.lastNumber(array);
			System.out.println("The last number in your array was " + last);
			break;
		default:
			System.out.println("The number you entered is not valid.");
		}
	}

}
