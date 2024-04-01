package easy;

public class SearchInsertPosition {

	public static void main(String[] args) {
		int nums[] = { -1, 3, 5, 6 };
		int target = 0;
		System.out.println(searchInsert(nums, target));

	}

	public static int searchInsert(int[] nums, int target) {

		int i = 0;
		int size = nums.length - 1;
		if (size == i) {
			if (target <= nums[i])
				return i;
			else
				return i + 1;
		}

		for (i = 0; i < size; i++) {
			if (nums[i] == target)
				return i;
			else if (target < nums[i] & target > nums[i + 1])
				return i + 1;
			else if (target < nums[i])
				return i;
		}
		if (target > nums[i])
			return i + 1;
		return i;
	}

}
