 package array;
import java.util.*;

public class StaticAndDynamicArray {
	public static void main(String[] args)
	{
		// Dynamic Array
		// Create an ArrayList of integers.
		ArrayList<Integer> dynamicArray = new ArrayList<>();

		// Add elements to the dynamic array.
		dynamicArray.add(1);
		dynamicArray.add(2);
		dynamicArray.add(3);
		dynamicArray.forEach(System.out::println);

		// Remove an element from the dynamic array.
		dynamicArray.remove(1);
	}
}
