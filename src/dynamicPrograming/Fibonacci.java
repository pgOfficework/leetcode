package dynamicPrograming;

public class Fibonacci {
    static long[] fibCache;
    public static void main(String[] args) {
        int n=92;
        fibCache=new long[n+1];
        long start=System.currentTimeMillis();
        System.out.println(fibonacci(n));
        System.out.println(Math.abs(System.currentTimeMillis()-start));

    }

    private static long fibonacci(int n) {
        if (n <=1) {
            return n;
        }
        if (fibCache[n]!=0) {
            return fibCache[n];
        }
        long nTheFibNumber=fibonacci(n-1)+fibonacci(n-2);
        fibCache[n]=nTheFibNumber;
        return nTheFibNumber;

 //       return fibonacci(n-1)+fibonacci(n-2);
    }
// 0 1 1 2 3 5 8 13

}
