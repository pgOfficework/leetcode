//In fibonacci series, next number is the sum of previous two numbers for example 0, 1,   1, 2, 3, 5, 8, 13, 21, 34, 55 etc. 
//The first two numbers of fibonacci series are 0 and 1.

package practice;

/**
 * A1Fibonacci
 */
public class A01Fibonacci {
    public static void main(String[] args) {
        int num1=0;
        int num2=1;
        int res;

        for (int i = 0; i < 10; i++) {
            
            res=num1+num2;
            System.out.print(res+", ");
            num1=num2;
            num2=res;

        }

    }
    
}