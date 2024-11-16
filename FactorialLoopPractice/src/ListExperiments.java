import java.util.ArrayList;
import java.util.Scanner;

public class ListExperiments {

	public boolean removeThird(ArrayList colors) {
		if (colors.size() <= 2) {
			return false;
		}
		colors.remove(2);

		return true;

	}

	public String removeElement(ArrayList colors, int index) {
		String returnString = "No such element found";

		if (colors.size() > (index + 1)) {
			returnString = (String) colors.get(index);
			colors.remove(index);
		}

		return returnString;

	}

	public ArrayList replaceFourth(ArrayList colors) {
		if (colors.size()>=4) {
		colors.remove(3);
		colors.add(3, "Purple");

		}
		else {
			System.out.println("Not enough elements in your array to remove.");
		}
	
		return colors;

	}

	public ArrayList backwardsArray(ArrayList colors) {
		for (int i = 0; i < colors.size(); i++) {
			System.out.println((colors.size() - i));
		}
		 return colors;
	}

	public long sum(int x, int y) {
		int xAndy = (x + y);
		return xAndy;
	}

	public static void main(String[] args) {
		ArrayList<String> colors = new ArrayList<String>();
		colors.add("Red");
		colors.add("Orange");
		colors.add("Yellow");
		colors.add("Green");

		Scanner scn = new Scanner(System.in);
		System.out.println("What number would you like to select?");
		int num = scn.nextInt();

		ListExperiments options = new ListExperiments();

		switch (num) {
		case 1:
			boolean sucess = options.removeThird(colors);
			if (sucess) {
				System.out.println("Removal of the third element was sucessful");
			}
			break;
		case 2:
			String removedElement = options.removeElement(colors, 2);
			System.out.println("The element that you removed was " + removedElement);
			break;
		case 3:
			int x = 2;
			int y = 1;
			int addedNums = (int) options.sum(x, y);
			System.out.println("When x and y were added you got " + addedNums);
			break;
		case 4:
			ArrayList replaced = options.replaceFourth(colors);
			System.out.println("When you replaced your fourth element with purple your array was " + replaced);
			break;
		case 5:
			ArrayList backwards = options.backwardsArray(colors);
			System.out.println("When you turn your colors backwards, you get " + colors);
			break;
		default:
			System.out.println("Your number is invalid.");
		}
	}
}
