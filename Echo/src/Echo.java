import java.util.Scanner;

public class Echo {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);

		System.out.println("What is your name? ");
		String name = scn.next();
		scn.nextLine();
		System.out.println("Your name is " + name);
		
		
		System.out.println("Where are you from? ");
		String from = scn.nextLine();
		System.out.println("You're from "  + from + "?!!? Thats cool!");
		
		System.out.println("How old are you? ");
		int age = scn.nextInt();
		System.out.println("You are " + age + " years old");
		
		System.out.println("What's your favorite activity? ");
		String act = scn.next();
		System.out.println("You like to go " + act + "? Nice, I should try that! ");
		
		scn.nextLine();
		System.out.println("How much would you like to donate today? (In dollars). ");
		double don = scn.nextDouble();
		System.out.print("Wow thank you! those "+ don +" dollars will really help me! Have a great day.");
		
	}

}
