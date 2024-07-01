package array;

import java.util.HashSet;

//55
public class JumpGame {
    public static boolean canJump(int[] nums) {

        if (nums.length == 1)
            return true;
        if (nums[0] == 0)
            return false;

        int len = nums.length;
        int i = 0;

        if (nums[0] == len - 1)
            return true;

        while (i < len) {
            if (nums[i] != 0)
                i = i + nums[i];
            else
                break;
        }


        if (i < len - 1)
            return false;
        return true;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{2, 0, 0};

        System.out.println(canJump(arr));
    }
}
