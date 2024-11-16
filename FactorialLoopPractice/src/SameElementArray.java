import java.util.Random;

public class SameElementArray {

	public static void main(String[] args) {
		int[] elements = new int[150];

		Random random = new Random();

		for (int i = 0; i < 150; i++) {
			elements[i] = random.nextInt(0, 150);
		}
		int[] elements2 = new int[300];

		for (int i = 0; i < 300; i++) {
			elements2[i] = random.nextInt(0, 300);

		}

		int counter = 0;
		for (int i = 0; i < elements.length; i++) {
			for (int j = 0; j < elements2.length; j++) {
				if (elements[i] == elements2[j]) {
					counter++;
					int dupElements = elements[i];
					System.out.println(dupElements);
				}
			}
		}
		System.out.println("The amount of similar elements was " + counter);
	}

}
