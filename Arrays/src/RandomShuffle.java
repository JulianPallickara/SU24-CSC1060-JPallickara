import java.util.Random;

public class RandomShuffle {

	public static void main(String[] args) {
		Random random = new Random();
		int [] myArray = {1,2,3,4,5,6,7,8,9,10};
		myArray = shuffle(myArray);
		for (int i = 0; i < myArray.length; i++) {
			int num = (myArray[i]);
			System.out.println(num);
		}
		
	
	}

	public static int[] shuffle(int[] myArray) {
		Random random = new Random();
		for(int i = 0; i < myArray.length; i++) {
			int rand = random.nextInt(myArray.length);
			int temp = myArray[i];
			myArray[i] = myArray[rand];
			myArray[rand] = temp;
			

		}
		return myArray;
		
	}
}
