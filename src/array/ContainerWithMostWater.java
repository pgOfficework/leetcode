package array;

public class ContainerWithMostWater {
    public static void main(String[] args) {
        int[] arr = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        System.out.println(maxArea(arr));
    }

    public static int maxArea(int[] height) {

        int start1 = 0,start2 = 0;
        int end1 = height.length - 1,end2 = height.length - 1;

        int maxArea = 0;

        while (start1 < end1) {
            int area = 0;

            int min = Math.min(height[start1], height[end1]);

            int count = end1 - start1;

            area = min * count;
            maxArea = Math.max(area, maxArea);
            start1++;
        }
        start1 = 0;

        while (end1 > start1) {
            int area = 0;

            int min = Math.min(height[start1], height[end1]);

            int count = end1 - start1;

            area = min * count;
            maxArea = Math.max(area, maxArea);
            end1--;
        }

        return maxArea;
    }
}
