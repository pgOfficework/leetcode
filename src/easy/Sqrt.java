package easy;

/* Given a non-negative integer x, return the square root of x rounded down to the nearest integer. 
The returned integer should be non-negative as well. You must not use any built-in exponent function or operator.
For example, do not use pow(x, 0.5) in c++ or x ** 0.5 in python.

Example 1:

Input: x = 4
Output: 2
Explanation: The square root of 4 is 2, so we return 2. */
public class Sqrt {
    public static void main(String[] args) {
        System.out.println(mySqrt(20));
    }

    public static int mySqrt(int x) {
        int sqrt = 1;
        int rem = 0;
        for (int i = 1; i < x / 2; i++) {    //16=4x4
            sqrt = i * i;
            System.out.println("i : " + sqrt);
            if (sqrt == x) {
                return i;
            }
            if (sqrt > x) {
                // found left part of decimal
                return sqrt(x, i - 1, i);
            }
        }
        return x;
    }

    private static int sqrt(int X, int low, int high) {
        int mid = (low + high) / 2;
        double p = mid * mid;
        // uncomment below line to see how we reach the final answer
        // System.out.println(low + " " + high + " " + mid + " " + p);

        if (p == X) {
            return mid;
        }
        if (p < X) {
            return sqrt(X, mid, high);
        }
        return sqrt(X, low, mid);
    }
}
