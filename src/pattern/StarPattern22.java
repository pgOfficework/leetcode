package pattern;

/*Number Pattern 22

1 0 1 0 1

0 1 0 1 0

1 0 1 0 1

0 1 0 1 0

1 0 1 0 1  */
public class StarPattern22 {

    public static void print(int rows) {

        for (int i = 0; i < rows; i++) {
            for (int j = i+1; j <= rows+i; j++) {
                System.out.print(j%2+" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        print(5);
    }
}
