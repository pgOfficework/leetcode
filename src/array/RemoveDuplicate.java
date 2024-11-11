package array;

import java.util.Arrays;

public class RemoveDuplicate {

    public static void main(String[] args) {
        int[] arr={2,4,3,5,3,9,3,4,6,5,7,6,};

        int len = removeDuplicate(arr);

        for (int i = 0; i < len; i++) {
            System.out.print(arr[i]+" ");
        }

    }

    private static int removeDuplicate(int[] arr) {

        int len=arr.length;

        for (int i = 0; i < len; i++) {
            for (int j = i+1; j < len ; j++) {
                if (arr[i]==arr[j]){
                    leftshift(arr,j,len);
                    len--;
                }
            }
        }
        return len;
    }

    public static void leftshift(int[] arr, int i,int len){
        for (int j = i; j < len-1; j++)
            arr[j]=arr[j+1];
    }
}
