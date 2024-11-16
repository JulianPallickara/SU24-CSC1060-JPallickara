
public class SumOfForNumbers {

	public static void main(String[] args) {

		int i = 1;
		int sum = 0;
		while (i <= 40 ) {
			sum += i;
			i++;
		}
		System.out.println(sum);
		sum = 0;
		for(int j = 1; j<=40; j++) {
			sum +=j;
		}
		System.out.println(sum);
	}
}