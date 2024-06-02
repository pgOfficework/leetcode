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
        int n1 = mid - l+1;
        int n2 = r - mid;

        int L[] = new int[n1];
        int R[] = new int[n2];

        for (int i = 0; i < n1; i++)
            L[i] = arr[l + i];
        for (int i = 0; i < n2; i++)
            R[i] = arr[mid + 1 + i];

        int i=0;
        int j=0;
        int k=l;
        while (i<n1 && j<n2){
            if (L[i]<R[j]){
                arr[k]=L[i];
                i++;
            }
            else {
                arr[k]=R[j];
                j++;
            }
            k++;
        }

        while (i<n1){
            arr[k]=L[i];
            i++;
            k++;
        }
        while (j<n2){
            arr[k]=R[j];
            j++;
            k++;
        }


    }

    public static void main(String[] args) {
        int[] a = {7, 5, 3, 7, 9, 1, 4, 3, 0};
        System.out.println(Arrays.toString(a));
        MergeSort ob = new MergeSort();
        ob.merge(a, 0, 8);

        System.out.println(Arrays.toString(a));


    }

}
