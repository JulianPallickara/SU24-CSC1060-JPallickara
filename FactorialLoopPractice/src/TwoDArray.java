import java.util.Random;

public class TwoDArray {
	public int sums(int[][] array) {
		int rowSum = 0;
		for (int i = 0; i < array.length; i++) {
			rowSum = (array[i][0] += array[i][0]);
			System.out.println("Your sum for the first row was " + rowSum);
		}
		for (int i = 0; i < array.length; i++) {
			rowSum = (array[i][1] += array[i][1]);
			System.out.println("Your sum for the first row was " + rowSum);
		}
		for (int i = 0; i < array.length; i++) {
			rowSum = (array[i][2] += array[i][2]);
			System.out.println("Your sum for the first row was " + rowSum);
		}
		for (int i = 0; i < array.length; i++) {
			rowSum = (array[i][3] += array[i][3]);
			System.out.println("Your sum for the first row was " + rowSum);
		}
		for (int i = 0; i < array.length; i++) {
			rowSum = (array[i][4] += array[i][4]);
			System.out.println("Your sum for the first row was " + rowSum);
		}
		for (int i = 0; i < array.length; i++) {
			rowSum = (array[i][5] += array[i][5]);
			System.out.println("Your sum for the first row was " + rowSum);
		}
		for (int i = 0; i < array.length; i++) {
			rowSum = (array[i][6] += array[i][0]);
			System.out.println("Your sum for the first row was " + rowSum);
		}
		for (int i = 0; i < array.length; i++) {
			rowSum = (array[i][7] += array[i][7]);
			System.out.println("Your sum for the first row was " + rowSum);
		}
		for (int i = 0; i < array.length; i++) {
			rowSum = (array[i][8] += array[i][8]);
			System.out.println("Your sum for the first row was " + rowSum);
		}
		for (int i = 0; i < array.length; i++) {
			rowSum = (array[i][9] += array[i][9]);
			System.out.println("Your sum for the first row was " + rowSum);
		}
		return rowSum;
	}

	public int colSum(int[][] array) {
			int collumSum = 0;
			for (int i = 0; i < array.length; i++) {
				collumSum = (array[0][i] += array[0][i]);
				System.out.println("Your sum for the first row was " + collumSum);
			}
			for (int i = 0; i < array.length; i++) {
				collumSum = (array[1][i] += array[0][i]);
				System.out.println("Your sum for the first row was " + collumSum);
			}
			for (int i = 0; i < array.length; i++) {
				collumSum = (array[2][i] += array[0][i]);
				System.out.println("Your sum for the first row was " + collumSum);
			}
			for (int i = 0; i < array.length; i++) {
				collumSum = (array[3][i] += array[0][i]);
				System.out.println("Your sum for the first row was " + collumSum);
			}
			for (int i = 0; i < array.length; i++) {
				collumSum = (array[4][i] += array[0][i]);
				System.out.println("Your sum for the first row was " + collumSum);
			}
			for (int i = 0; i < array.length; i++) {
				collumSum = (array[5][i] += array[0][i]);
				System.out.println("Your sum for the first row was " + collumSum);
			}
			for (int i = 0; i < array.length; i++) {
				collumSum = (array[6][i] += array[0][i]);
				System.out.println("Your sum for the first row was " + collumSum);
			}
			for (int i = 0; i < array.length; i++) {
				collumSum = (array[7][i] += array[0][i]);
				System.out.println("Your sum for the first row was " + collumSum);
			}
			for (int i = 0; i < array.length; i++) {
				collumSum = (array[8][i] += array[0][i]);
				System.out.println("Your sum for the first row was " + collumSum);
			}
			for (int i = 0; i < array.length; i++) {
				collumSum = (array[9][i] += array[0][i]);
				System.out.println("Your sum for the first row was " + collumSum);
		}
			return collumSum;
		}

	public static void main(String[] args) {
		int [][] array = new int[10][10];
		Random random = new Random();
		
		for (int row = 0; row < 10; row++){
			(int col = 0; col < 10; col++){
			array[row] = random(20, 45);
			array[col] = random(20, 45);

}
}
