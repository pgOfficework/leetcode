package array;

//#80
public class RemoveDuplicatesRromSortedArrayII {

    public static int removeDuplicates(int[] nums) {
        int j = 1;
        for (int i = 1; i < nums.length; i++) {
            if (j == 1 || nums[i] != nums[j - 2]) {
                nums[j++] = nums[i];
            }
        }
        return j;
    }

    public static void leftShift(int[] arr, int index, int d) {
        for (int i = index - d; index < arr.length; i++) {
            arr[i] = arr[index++];
        }
    }

    public static void main(String[] args) {
        int[] nums1 = {0, 0, 1, 1, 1, 1, 2, 3, 3};//0,0,1,1,1,1,2,3,3

        System.out.println(removeDuplicates(nums1));

        for (int j : nums1) {
            System.out.print(j + " ");
        }
    }
}
