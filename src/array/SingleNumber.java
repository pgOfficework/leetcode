package array;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/*Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.

You must implement a solution with a linear runtime complexity and use only constant extra space.

 

Example 1:

Input: nums = [2,2,1]
Output: 1
Example 2:

Input: nums = [4,1,2,1,2]
Output: 4
Example 3:

Input: nums = [1]
Output: 1
 

Constraints:

1 <= nums.length <= 3 * 104
-3 * 104 <= nums[i] <= 3 * 104
Each element in the array appears twice except for one element which appears only once.*/
public class SingleNumber {
	
	public static int singleNumber(int[] nums) {
		if(nums.length == 1){
            return nums[0];
        }
		Arrays.sort(nums);
		
		for (int i : nums) {
			System.out.println(i);
		}
		int i=0;
		while (i<nums.length-1) {
			System.out.println("...."+i);
			if(nums[i]!=nums[i+1]) {
				return nums[i];
			}
		}
		return 0;
		
	}

	public static void main(String[] args) {
		int[] input={4,1,2,1,2};
		System.out.println(singleNumber(input));

	}

}
