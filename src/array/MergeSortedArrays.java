package array;

import java.util.Arrays;
import java.util.stream.IntStream;

public class MergeSortedArrays {

	public static void main(String[] args) {
		int[] numbers1 = { 3, 5, 7, 9, 11, 13 };
		int[] numbers2 = { 1, 3, 4, 6, 8, 10 };
		
	

		// Merge or Concatenate 2 Arrays using Stream.of()
//		Integer[] mergedNames = Stream.of(numbers1, numbers2) // merging
//				.flatMap(Stream::of) // flattening
//				.toArray(Integer[]::new); // converting to Array

//		Stream.of(mergedNames).sorted().collect(Collectors.toList())
//			.forEach(a -> System.out.print(a + " "));
//		
//		int[] numbers3 =
				IntStream.concat(Arrays.stream(numbers1), Arrays.stream(numbers2))
        .sorted()
        .forEach(System.out::println);
//		Stream.of(numbers3).forEach(System.out::println);
		

	}

}
