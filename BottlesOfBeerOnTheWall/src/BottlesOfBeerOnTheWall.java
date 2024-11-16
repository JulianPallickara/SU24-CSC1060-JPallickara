import java.util.Scanner;

public class BottlesOfBeerOnTheWall {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("How many bottles of beer would you like?");
		int num = scn.nextInt();

		int beer = 0;
		for (int i = 0; i <= num; i++) {
			beer = num - i;
			System.out.println(beer + " bottles of beer on the wall, " + beer + " bottles of beer on the wall");

			if (beer == 0) {
				System.out
						.println("0 bottles of beer on the wall, 0 bottles of beer. Go to the store and buy some more,"
								+ num + " bottles of beer on the wall.");

			} else {
				System.out.println("Take one down, pass it around, " + (beer - 1) + " bottles of beer on the wall");
				System.out.println("");
			}
		}

	}

}
