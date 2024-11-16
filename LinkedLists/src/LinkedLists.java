import java.util.Arrays;
import java.util.LinkedList;

public class LinkedLists {

	public static void main(String[] args) {

		LinkedList<String> list = new LinkedList<String>();
		
		list.add("A");
		list.add("B");
		list.add("C");
		list.add("D");
		list.add("E");

		System.out.println(list);
		System.out.println(list.size());
		list.remove("B");
		list.remove(3);
		list.removeFirst();
		list.removeLast();
		System.out.println(list);

		list.removeAll(list);
		
		list.add("Coding");
		list.add("is");
		list.add("fun!");
		System.out.println(list);

		list.add(1, "Java");
		
		System.out.println(list);
		
		list.set(1,"Python");
		
		System.out.println(list);

		Object[] arr = list.toArray();
		
		System.out.println(Arrays.toString(arr));
	}

}