 package array;
import java.util.*;

public class StaticAndDynamicArray {
	public static void main(String[] args)
	{
		// Static Array
		int[] staticArray = new int[5];
		int[] numbers = { 1, 2, 3, 4, 5 };
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
