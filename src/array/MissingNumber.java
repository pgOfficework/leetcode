package array;

import java.util.HashSet;
import java.util.Set;

public class MissingNumber {

    public static void main(String[] args) {

        int[] num = {9, 6, 4, 2, 3, 5, 7, 0, 1};
        System.out.println(missingNumber(num));
    }

    public static int missingNumber(int[] nums) {
        if (nums.length == 1) {
            return nums[0] > 0 ? nums[0] - 1 : nums[0] + 1;
        }
        Set<Integer> set = new HashSet<>();
        int min = nums[0];
        int max = nums[0];

        for (Integer n : nums) {
            min = Math.min(min, n);
            max = Math.max(max, n);
            set.add(n);
        }

        for (int i = min; i <= max; i++) {
            if (!set.contains(i)) {
                return i;
            }
        }
        return max + 1;

    }
}