import java.util.Scanner;

public class NaturalLogs {

	public static long factorial(double d) {
		long factorial=1;
		for (int i=1; i <= d; i++) {
			factorial*=i;
		}
		return factorial;
	}
	
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("What would you like your n to be?");
		int num = scn.nextInt();
		System.out.println("What would you like your X to be?");
		double log = 1;
		double sign = 1;
		
		for (int i = 2; i < num; i++) {
			log +=  (sign)*(1/(double)i);
			sign *= -1;
		}
		System.out.println("Your natural log is " + log);
		
		if (num%2==0);
		for (int i = 2; i < num; i++) {
			double cosine = factorial(Math.pow((sign)*(1/(double)i), i));
			sign *= -1;
	 {
		 if (num%2!=0);
			for (int j = 2; j < num; j++) {
				double sin = factorial(Math.pow((sign)*(1/(double)j), j));
				sign *= -1;
			}
			System.out.println("Your Cosine is " + cosine);
			System.out.print("Your sin is " + sin);

}
}
}}