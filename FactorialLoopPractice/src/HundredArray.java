import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class HundredArray {

	public float getMean(int[] elements) {
		float mean = 0;
		float sum = 0;
		for (int i = 0; i < elements.length; i++) {
			sum += elements[i];
		}
		mean = (sum / elements.length);
		return mean;
	}

	public int getSmallest(int[] elements) {
		int smallest = elements[0];

		for (int i = 0; i < elements.length; i++) {
			if (smallest > elements[i]) {
				smallest = elements[i];
			}
		}
		return smallest;

	}

	public int getBiggest(int[] elements) {
		int biggest = elements[0];

		for (int i = 0; i < elements.length; i++) {

			if (biggest < elements[i]) {
				biggest = elements[i];
			}

		}
		return biggest;

	}

	public void sort(int[] elements) {
		Arrays.sort(elements);
		for (int i = 0; i < elements.length; i++) {
			System.out.println(elements[i]);
		}
	}

	public float standardDeviation(int[] elements) {
		float mean = getMean(elements);
		float sum = 0;
		for (int i = 0; i < elements.length; i++) {
			float difference = (float) Math.pow((elements[i] - mean), 2);
			sum += difference;
		}
		sum = (sum / elements.length);
		return (float) Math.pow(sum, 0.5);

	}

	public static void main(String[] args) {
		Random random = new Random();
		Scanner scn = new Scanner(System.in);

		System.out.println("What would you like your number to be?");
		int num = scn.nextInt();

		int[] elements = new int[100];

		for (int i = 0; i < 100; i++) {
			elements[i] = random.nextInt(1, 1000);
		}
		
		HundredArray options = new HundredArray();

		switch (num) {
		case 1:
			float mean = options.getMean(elements);
			System.out.println("Your mean is " + mean);
			break;
		case 2:
			int small = options.getSmallest(elements);
			System.out.println("The smalleset number in your array is " + small);
			break;
		case 3:
			int big = options.getBiggest(elements);
			System.out.println("The biggest number in your array is " + big);
			break;
		case 4:
			options.sort(elements);
			break;
		case 5:
			float standard = options.standardDeviation(elements);
			System.out.println("The standard deviation of your array is " + standard);
			break;
		default:
			System.out.println("The number you entered is not valid.");
		}
	}
}
