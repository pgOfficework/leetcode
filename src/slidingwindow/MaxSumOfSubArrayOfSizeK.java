package slidingwindow;

import java.util.Arrays;
import java.util.List;

public class MaxSumOfSubArrayOfSizeK {

	public static void main(String[] args) {

		List<Integer> array = Arrays.asList(2, 5, 3, 6, 4, 8, 9, 2, 3, 7);
		array = sunArrayuOfMaxSum(array, 3);

		for (Integer integer : array) {
			System.out.print(integer + " ");
		}

	}

	private static List<Integer> sunArrayuOfMaxSum(List<Integer> array, int k) {

		int sum = 0;
		for (int i = 0; i < k; i++) {
			sum = sum + array.get(i);
		}
		System.out.println("initial sum : " + sum);
		int i = 0;
		int l=i;
		int maxSum=sum;
		
		while (i+k<array.size()) {
			System.out.println("i-"+(i)+" j-"+(i+k));
			sum=sum-array.get(i)+array.get(i+k);
			if(sum>maxSum) {
				maxSum=sum;
				l=i+1;
			}
			System.out.println(sum);
			i++;
		}
		System.out.println("sum : " + sum);

		return array.subList(l, l+k);
	}

}
