package dynamicPrograming;

import java.util.Arrays;

public class Fibonacci {
    static long[] fibCache;

    public static void main(String[] args) {
        int n = 9;
        fibCache = new long[n];
        long start = System.currentTimeMillis();
    //    System.out.println(fibonacci(n));
        fibonacci(n-1);
      //  System.out.println(Math.abs(System.currentTimeMillis() - start));

        Arrays.stream(fibCache).sequential().forEach(System.out::println);

    }

    private static long fibonacci(int n) {

        if (n <= 2) {
            fibCache[n]=1;
            return 1;
        }
        if (fibCache[n] != 0) {
            return fibCache[n];
        }
        long nTheFibNumber = fibonacci(n - 1) + fibonacci(n - 2);
        fibCache[n] = nTheFibNumber;
        return nTheFibNumber;

           //    return fibonacci(n-1)+fibonacci(n-2);
    }
// 0 1 1 2 3 5 8 13

}
