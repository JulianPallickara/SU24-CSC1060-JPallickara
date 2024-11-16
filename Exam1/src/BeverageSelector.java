import java.util.Scanner;

public class BeverageSelector {		
	
	
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("What drink would you like to have? (1-3)");
		int num = scn.nextInt();
		
		if (num == 3){
			System.out.println("Your beverage is coffee.");
		}
		if (num == 2){
			System.out.println("Your beverage is coke.");
		}
		if (num == 1){
			System.out.println("Your beverage is water.");
		}
			
	}

}
