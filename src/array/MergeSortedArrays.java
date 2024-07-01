package array;

//#88
public class MergeSortedArrays {

    public static void main(String[] args) {
        int[] nums1 = {3, 5, 7, 0, 0, 0};
        int[] nums2 = {2, 3, 4};

        int m = 3;
        int n = 3;

        mergeSortedArrays(nums1, nums2, 3, 3);
        for (int i = 0; i < nums1.length; i++) {
            System.out.print(nums1[i] + " ");
        }

    }

    private static void mergeSortedArrays(int[] nums1, int[] nums2, int l1, int l2) {
        int i = l1 - 1;
        int j = l2 - 1;
        int k = l1 + l2 - 1;

        while (j >= 0) {
            if (i >= 0 && nums1[i] > nums2[j])
                nums1[k--] = nums1[i--];
            else
                nums1[k--] = nums2[j--];
        }
    }
}
