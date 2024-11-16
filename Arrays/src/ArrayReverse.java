
public class ArrayReverse {

	public static void main(String[] args) {
		int [] array = {1,2,3,4,5,6,7,8,9,10};
		int[] revarray = reverse(array);
		
		for(int i = 0; i < array.length; i++) {
			System.out.print(revarray[i] + " ");
		}
	}


	public static int[] reverse(int[] array) {
		int[] newarray = new int[array.length]; 
		for(int i = 0; i < array.length; i++) {
			newarray[array.length-i-1] = array[i];
		}
		return newarray;
	
	}
}
