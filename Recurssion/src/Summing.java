
public class Summing {

	public static void main(String[] args) {
		System.out.println(sum(5));
		System.out.println(fact(5));
	}
	public static int sum(int n) {
		if(n<=1) return 1;
		return n + sum(n-1);
	}
	
	public  static int fact(int n) {
		if (n<=1) return n;
		return fact(n-1)*(n);
	}
	public static int recursFib(int fibNum) {
		if(fibNum <= 1) return fibNum;
		return recursFib(fibNum - 1) + recursFib(fibNum-2);
	}

}
