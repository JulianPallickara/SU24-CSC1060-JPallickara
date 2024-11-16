import java.util.Scanner;

public class Means {
	
	
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		System.out.println("What do you want your first number to be?");
		float num1 = scn.nextFloat();

		
		System.out.println("What do you want your second number to be?");
		float num2 = scn.nextFloat();

		
		System.out.println("What do you want your third number to be?");
		float num3 = scn.nextFloat();
		
		//Math.pow(x, y)
		
		float geoMean = (float) (Math.pow(num1*num2*num3, (1.0/3.0)));
		float armMean = (float)(num1+num2+num3)/3;
		
		System.out.println("Your arithmetic mean is " + armMean);
		System.out.println("Your geometric mean is " + geoMean);
		
		scn.close();

		
	}
}
