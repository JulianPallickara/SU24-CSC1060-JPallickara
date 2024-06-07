import java.util.Scanner;

public class TempConverter {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
	    System.out.println("What would you like your Farenheit to be?");
	    double input = in.nextDouble();
	    System.out.println("You typed "+ input +" degrees in Farenheit.");
		
		double farenheit;
		double celcius;
		double kelvin;
		
		celcius = (input-32)*(5.0/9.0);
		kelvin = (celcius+273.15);
				
		System.out.println("when " + input + " degrees farenheit is converted to celcius it is " + celcius + " degrees celcius.");
		
		System.out.println("When "+ kelvin + " degrees celcius is converted to kelvin it is " + kelvin + " degrees kelvin.");
	}

}
