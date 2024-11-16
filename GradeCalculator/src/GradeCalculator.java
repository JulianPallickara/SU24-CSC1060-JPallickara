import java.util.Scanner;

public class GradeCalculator {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("What would you like to see the grade of?");
		int grade = scn.nextInt();
		
		if (grade >= 92) {
			System.out.println("A");
		}
		else if ((grade > 92) && (grade > 89)){
			System.out.println("A-");
		}
		else if ((grade > 87) && (grade > 89)){
			System.out.println("B+");
		}
		else if ((grade > 82) && (grade > 87)){
			System.out.println("B");
		}
		else if ((grade >= 79) && (grade >= 82)){
			System.out.println("B-");
		}
		else if ((grade >= 77) && (grade >= 79)){
			System.out.println("C");
		}
		else if ((grade >= 69) && (grade >= 72)){
			System.out.println("C-");
		}
		else if ((grade >= 67) && (grade >= 69)){
			System.out.println("D+");
		}
		else if ((grade >= 60) && (grade >= 67)){
			System.out.println("D");
		}
		else if ((grade >= 0) && (grade >= 60)){
			System.out.println("F");
		}else {
		System.out.println("Please enter a valid grade.");
	}

}
}