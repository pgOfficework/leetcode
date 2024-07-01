package Microsoft;

public class MedianOfTwoSortedArrays {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        int nums1[] = {1, 2, 3, 4};
        int nums2[] = {5, 6, 7, 8, 9}; // 1 2 3 4 5 6 7 8 9

        System.out.println("\n result : " + findMedianSortedArrays2(nums1, nums2));
    }

    public static double findMedianSortedArrays2(int[] nums1, int[] nums2) {
        int n1 = nums1.length, n2 = nums2.length;

        // Ensure nums1 is the smaller array for simplicity
        if (n1 > n2)
            return findMedianSortedArrays(nums2, nums1);

        int n = n1 + n2;
        int left = (n1 + n2 + 1) / 2; // Calculate the left partition size  4
        System.out.println("left : " + left);
        int low = 0, high = n1;
        System.out.println("low-" + low + "  high-" + high);

        while (low <= high) {
            System.out.println("\n while : low-" + low + "  high-" + high);
            int mid1 = (low + high) / 2; // Calculate mid index for nums1 1-2 2-3 3-4
            int mid2 = left - mid1; // Calculate mid index for nums2     1-2 2-1 3-0

            System.out.println("mid1-" + mid1 + "  mid2-" + mid2);

            int l1 = Integer.MIN_VALUE, l2 = Integer.MIN_VALUE, r1 = Integer.MAX_VALUE, r2 = Integer.MAX_VALUE;

            System.out.println("l1-" + l1 + "  l2-" + l2);
            System.out.println("r1-" + r1 + "  r2-" + r2);

            // Determine values of l1, l2, r1, and r2
            if (mid1 < n1)
                r1 = nums1[mid1]; //1-3 2-4
            if (mid2 < n2)
                r2 = nums2[mid2]; //1-7 2-8 3-5
            if (mid1 - 1 >= 0)
                l1 = nums1[mid1 - 1]; //1-2 2-3 3-4
            if (mid2 - 1 >= 0)
                l2 = nums2[mid2 - 1]; //1-6 2-5

            if (l1 <= r2 && l2 <= r1) {
                // The partition is correct, we found the median
                if (n % 2 == 1)
                    return Math.max(l1, l2);
                else
                    return ((double) (Math.max(l1, l2) + Math.min(r1, r2))) / 2.0;
            } else if (l1 > r2) {
                // Move towards the left side of nums1
                high = mid1 - 1;
            } else {
                // Move towards the right side of nums1
                low = mid1 + 1; //1-3 2-4
            }
        }

        return 0; // If the code reaches here, the input arrays were not sorted.
    }

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int l1 = nums1.length;
        int l2 = nums2.length;

        System.out.println("l1 : " + l1);
        System.out.println("l2 : " + l2);

        int len = (l1 + l2) / 2;
        System.out.println("len : " + len);

        int nums3[] = new int[len];

        for (int i = 0, k = 0, j = 0; (i < l1 || j < l2) && k < len; k++) {

            if (nums1[i] < nums2[j]) {
                nums3[k] = nums1[i++];
            } else {
                nums3[k] = nums2[j++];

            }
        }
        System.out.print("num3 :");
        for (int i : nums3) {
            System.out.print(" " + i);
        }

        if (--len % 2 == 0) {
            return (double) (nums3[--len] + nums3[--len]) / 2;
        } else {
            return (double) nums3[--len];
        }

    }

    public static double findMedianSortedArrays1(int[] nums1, int[] nums2) {
        int l1 = nums1.length;
        int l2 = nums2.length;

        System.out.println("l1 : " + l1);
        System.out.println("l2 : " + l2);

        int len = (l1 + l2) / 2;
        System.out.println("len : " + len);
        if (len == 0) {
            len++;
        }

        int nums3[] = new int[len + 1];

        int i = 0, j = 0, k = 0;

        // Traverse both array
        while (i < l1 && j < l2 && k <= len) {
            // Check if current element of first
            // array is smaller than current element
            // of second array. If yes, store first
            // array element and increment first array
            // index. Otherwise do same with second array
            if (nums1[i] < nums2[j])
                nums3[k++] = nums1[i++];
            else
                nums3[k++] = nums2[j++];
        }

        // Store remaining elements of first array
        while (i < l1 && k <= len)
            nums3[k++] = nums1[i++];

        // Store remaining elements of second array
        while (j < l2 && k <= len)
            nums3[k++] = nums2[j++];

        System.out.print("num3 :");
        for (int n : nums3) {
            System.out.print(" " + n);
        }

        if (len % 2 == 0) {
            System.out.println("\nif");
            return (double) (nums3[len] + nums3[--len]) / 2;
        } else {
            System.out.println("\nelse");
            return (double) nums3[len];
        }
    }

}
