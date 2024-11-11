package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test {

    static int i = 1111;
    static int j = 0;

    static {
        i = i-- - --i;
    }

    {
        j = i++ + ++i;

    }
    static long[] fibArray;
    public static void main(String[] args) {
        int n=9;
        fibArray= new long[n+1];

        System.out.println(fib(n));

        int[] arr = {1, 0, 1, 0, 1, 1, 0, 1, 0};
        sortArr(arr);
        for (int a : arr)
            System.out.print(a + " ");



    }

    private static void sortArr(int[] arr) {

        List<int[]> list= Arrays.asList(arr);



        int start=0;
        int end= arr.length-1;

        while (start<end){
            if(arr[start]==1){
                if (arr[end]==0){
                    arr[end]=arr[end]+arr[start];
                    arr[start]=arr[end]-arr[start];
                    arr[end]=arr[end]-arr[start];
                }
                 end--;
            }
            else start++;
        }
    }

    public static long fib(int n){
        if(n<=1){
            return n;
        }

        if (fibArray[n]!=0){
            return fibArray[n];
        }

        long fibNumber=fib(n-1)+fib(n-2);
        fibArray[n]=fibNumber;

        return fibNumber;
    }

}
// 0 1 1 2 3 5 8 13