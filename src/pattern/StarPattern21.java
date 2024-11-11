package pattern;

/*Number Pattern 21 (Pascal's Triangle)

               1

             1   1

           1   2   1

         1   3   3   1

       1   4   6   4   1

     1   5  10  10   5   1     */
public class StarPattern21 {

    public static void print(int rows) {

        for (int i = 0; i <= rows; i++) {
            for (int j = i; j < rows; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print(factorial(i) / (factorial(j) * factorial(i - j))+ " ");
            }
            System.out.println();
        }
    }

    private static int factorial(int n) {
        if (n ==0) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }


    public static void main(String[] args) {
        print(5);
    }
}
