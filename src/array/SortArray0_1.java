package array;

import com.sun.source.tree.Tree;

public class SortArray0_1 {

    public static void main(String[] args) {
        int[] arr = {1, 0, 1, 0, 1, 1, 0, 1, 0};
        sort(arr);
        for (int a : arr)
            System.out.print(a + " ");
    }

    private static void sort(int[] arr) {
        int type_0 = 0;
        int type_1 = arr.length - 1;

        while (type_0 < type_1) {
            if (arr[type_0] == 1) {
                if (arr[type_1] != 1) {
                    arr[type_1] = arr[type_1] + arr[type_0];
                    arr[type_0] = arr[type_1] - arr[type_0];
                    arr[type_1] = arr[type_1] - arr[type_0];
                }
                type_1--;
            } else type_0++;
        }
    }
}
