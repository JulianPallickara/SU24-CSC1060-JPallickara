import java.util.Random;

public class SameThreeElements {

	public static void main(String[] args) {
		int[] elements = new int[75];
		int[] elements2 = new int[125];
		int[] elements3 = new int[300];
		Random random = new Random();

		for (int i = 0; i < elements.length; i++) {
			elements[i] = random.nextInt(0, 150);
		}
		for (int i = 0; i < elements2.length; i++) {
			elements2[i] = random.nextInt(0, 150);

		}

		for (int i = 0; i < elements3.length; i++) {
			elements3[i] = random.nextInt(0, 150);

		}

		int counter = 0;
		int similarElements = 0;
		for (int i = 0; i < elements.length; i++) {
			for (int j = 0; j < elements2.length; j++) {
				for (int k = 0; k < elements3.length; k++) {
					if ( (elements[i] == elements2[j]) && (elements[i] == elements3[k]) && (elements3[k] == elements2[j]) ) {
						counter++;
						similarElements = elements[i];
						System.out.println("Found duplicate element " + similarElements);
					}
				}
			}
		}
		System.out.println("You had " + counter + " elements that were the same");
	}

}
