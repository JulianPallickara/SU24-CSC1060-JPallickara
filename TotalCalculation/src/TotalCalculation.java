import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.io.File;

public class TotalCalculation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String dbFile = "items.txt";

		double subtotal = 0;
		double taxRate = 0.053;
		double grandTotal = 0;
		double taxAmt = 0;

		try {
			Scanner read = new Scanner(new File(dbFile));
			System.out.println("File successfully opened.");
			while (read.hasNextDouble()) {
				subtotal += read.nextDouble();
			}

			taxAmt = subtotal * taxRate;
			grandTotal = subtotal + taxAmt;

			System.out.println("Subtotal: " + subtotal);
			System.out.printf("Tax:%.2f\n", taxAmt);
			System.out.printf("Total: %.2f\n", grandTotal);

		} catch (FileNotFoundException e) {
			System.out.println("Oops, looks like there isn't a file called " + dbFile);

		}
		String outFile = "/Users/jpallickara/Desktop/Total.txt";

		try {
			FileWriter write = new FileWriter(outFile);

			String line1 = String.format("Subtotal: ", subtotal);
			String line2 = String.format("Tax:%.2f\n", taxAmt);
			String line3 = String.format("Total:%.2f\n", grandTotal);

			write.write(line1);
			write.write(line2);
			write.write(line3);

		} catch (IOException e) {
			System.out.println("Oh no you couldn't create a file there!!!");

		}
	}
}
