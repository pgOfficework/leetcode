package sorting;

import java.util.Arrays;

public class MergeSort {

    public void merge(int[] a, int l, int r) {
        if (l < r) {
            int mid = (l + r) / 2;
            merge(a, l, mid);
            merge(a, mid + 1, r);
            sort(a, l, mid, r);
        }

    }


    private void sort(int[] arr, int l, int mid, int r) {
        int left = mid - l + 1;
        int right = r - mid;

        int[] L = new int[left];
        int[] R = new int[right];

        for (int i = 0; i < left; i++)
            L[i] = arr[l + i];
        for (int i = 0; i < right; i++)
            R[i] = arr[mid + 1 + i];

        int i = 0;
        int j = 0;
        int k = l;
        while (i < left && j < right) {
            if (L[i] < R[j]) {
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        while (i < left)
            arr[k++] = L[i++];

        while (j < right)
            arr[k++] = R[j++];


    }

    public static void main(String[] args) {
        int[] a = {7, 5, 3, 7, 9, 1, 4,-1, 3, 0};
        System.out.println(Arrays.toString(a));
        MergeSort ob = new MergeSort();
        ob.merge(a, 0, 9);


        System.out.println(Arrays.toString(a));

    }

}
