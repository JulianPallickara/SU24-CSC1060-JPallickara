
public class FormattedOutput {

	public static void main(String[] args) {
		double money = 23.4567;
		
		System.out.printf("The amount is %-+8.2f", money);
	
		int val = 23;
		String msg = "The requeseted value is ";
		
		System.out.printf("%s %d", msg, val);
	}
	
}
