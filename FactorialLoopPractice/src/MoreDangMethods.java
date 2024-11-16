import java.util.Random;
import java.util.Scanner;

public class MoreDangMethods {

	public String addUp(int[] elements) {
		String pair = "";
		for (int i = 0; i < elements.length; i++) {
			for (int j = 0; j < elements.length; j++) {
				int sum = elements[i] + elements[j];
				if ((sum > 120) && (sum < 140)) {
					pair = ("The pair that adds up is " + elements[i] + " and " + elements[j] + " to " + sum);
					System.out.println(pair);
				}

			}
		}
		return pair;
	}

	public int getEven(int[] elements) {

		int even = 0;
		for (int i = 0; i < elements.length; i++) {
			if (elements[i] % 2 == 0) {
				even++;
			} else {
				even = (even + 0);
			}
		}
		return even;

	}

	public int getOdd(int[] elements) {
		int odd = 0;
		for (int i = 0; i < elements.length; i++) {
			if (elements[i] % 2 != 0) {
				odd++;
			} else {
				odd = (odd + 0);
			}
		}
		return odd;
	}

	// This method returns the number of times the random number is observed.
	public int randomNum(int[] elements) {
		Random random = new Random();
		int sameNum = 0;
		int yourRandomNum = random.nextInt(1, 100);

		for (int i = 0; i < elements.length; i++) {
			if (yourRandomNum == elements[i]) {
				System.out.println("Found duplicate " + elements[i]);
				sameNum++;
			}
		}
		return sameNum;

	}

	public static void main(String[] args) {
		Random random = new Random();
		Scanner scn = new Scanner(System.in);

		System.out.println("What would you like your number to be?");
		int num = scn.nextInt();

		int[] elements = new int[1000];

		for (int i = 0; i < 1000; i++) {
			elements[i] = random.nextInt(1, 100);
		}
		MoreDangMethods options = new MoreDangMethods();

		switch (num) {
		case 1:
			int even = options.getEven(elements);
			System.out.println("The amount of even numbers in your array is " + even);
			break;
		case 2:
			int odd = options.getOdd(elements);
			System.out.println("The amount of odd numbers in your array is " + odd);
			break;
		case 3:
			int same = options.randomNum(elements);
			System.out.println("A number repeated " + same + " times.");
			break;
		case 4:
			options.addUp(elements);
			break;
		default:
			System.out.println("The number you entered is not valid.");
		}

	}
}