import java.util.Scanner;

public class PowersOf2Again {
	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		System.out.println("What would you like your power to be?");
		
		float num = scn.nextFloat();

		for (int i = 1; i <= num; i++) {
			int mul = (int) Math.pow(2, i);
			System.out.println(mul);

		}
		scn.close();
	}
}