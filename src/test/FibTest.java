package test;

public class FibTest {

    static int[]fibCache;

    public static void main(String[] args) {
        int n=9;

        fibCache=new int[n];

        int number=fibFunc(n-1);

        System.out.println(number);

        for (int n1:fibCache)
            System.out.print(" "+n1);
    }

    private static int fibFunc(int n) {

        if(n<=2){
            fibCache[n]=1;
            return 1;
        }

        if (fibCache[n]!=0){
            return fibCache[n];
        }

        int fibNum=fibFunc(n-1)+fibFunc(n-2);

        fibCache[n]=fibNum;

        return fibNum;
    }
}
