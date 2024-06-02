package slidingwindow;

import java.util.HashSet;
import java.util.Set;
import java.util.LinkedHashSet;

//2461
public class MaximumSumOfDistinctSubarraysWithLengthK {
    public static long maximumSubarraySum(int[] nums, int k) {
        HashSet<Integer> set = new HashSet<>();
        long ans = 0;
        long tempSum = 0;

        for (int i = 0; i < nums.length; i++) {
            if (set.size() == k && i - k >= 0) {
                set.remove(nums[i - k]);
                tempSum -= nums[i - k];
            }
            if (set.contains(nums[i])) {
                set.clear();
                set.add(nums[i]);
                tempSum = 0 + nums[i];
            } else {
                tempSum += nums[i];
                set.add(nums[i]);
            }
            if (i == k - 1 || i >= k) {
                if (set.size() == k) {
                    ans = Math.max(ans, tempSum);
                }
            }
        }

        return ans;
    }


    public static void main(String[] args) {

        int[] array = {3,2,3,1};
        int num = 3;
        System.out.println("maximumSubarraySum - " + maximumSubarraySum(array, num));

    }

}
