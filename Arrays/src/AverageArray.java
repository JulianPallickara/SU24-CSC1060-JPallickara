
public class AverageArray {

	public static void main(String[] args) {
		int[] array = { 10, 8, 5, 3, 2 };
		int sum = 0;
		for (int i = 1; i < array.length - 1; i++) {
			sum += array[i];
			
		}

		System.out.println("Your average is " + sum/array.length);

	}

}