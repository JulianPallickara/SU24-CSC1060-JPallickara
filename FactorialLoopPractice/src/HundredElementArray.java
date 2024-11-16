import java.util.Random;
import java.util.Scanner;

public class HundredElementArray {

	public int getNumberOfElements(int[] elements) {
		return elements.length;
	}

	public long getSumOfElements(int[] elements) {
		long sum = 0;
		for (int i = 0; i < elements.length; i++) {
			sum += elements[i];
		}
		return sum;
	}

	public int getFirstNumber(int[] elements) {
		int firstNum = elements[0];
		return firstNum;
	}

	public int getLastNumber(int[] elements) {
		int lastNum = elements[elements.length - 1];
		return lastNum;
	}

	public float getProductNumbers(int[] elements) {
		float product = 1;

		for (int i = 0; i < elements.length; i++) {
			product *= elements[i];

			System.out.println("Product at iteration (" + i + ") = " + product);
		}
		return product;

	}

	public int getLargestNumber(int[] elements) {
		int largestNum = elements[0];

		for (int i = 0; i < elements.length; i++) {
			if (largestNum < elements[i]) {
				largestNum = elements[i];
			}
		}
		return largestNum;
	}

	public static void main(String[] args) {
		int[] elements = new int[100];

		Random random = new Random();

		for (int i = 0; i < 100; i++) {
			elements[i] = random.nextInt(1, 1000);
		}

		HundredElementArray operations = new HundredElementArray();

		Scanner scn = new Scanner(System.in);

		System.out.println("What would you like your numbers to be: (1-6)");
		int operation = scn.nextInt();

		switch (operation) {
		case 1:
			int numberOfElements = operations.getNumberOfElements(elements);
			System.out.println("You have decided to have " + numberOfElements + " numbers in your array.");
			break;
		case 2:
			int sumOfElements = (int) operations.getSumOfElements(elements);
			System.out.println("The sum of all the numbers in your array was " + sumOfElements);
			break;
		case 3:
			int firstNumber = (int) operations.getFirstNumber(elements);
			System.out.println("The first number in your array was " + firstNumber);
			break;
		case 4:
			int lastNumber = (int) operations.getLastNumber(elements);
			System.out.println("The last number in your array was " + lastNumber);
			break;
		case 5:
			float productNums = operations.getProductNumbers(elements);
			System.out.println("The product of all your numbers was " + productNums);
			break;

		case 6:
			int largestNum = operations.getLargestNumber(elements);
			System.out.println("Your biggest number in the array was " + largestNum);
			break;
		default:
			System.out.println("You have chosen an invald option");
			break;

		}

	}
}
