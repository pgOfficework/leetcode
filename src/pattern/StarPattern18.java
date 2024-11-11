package pattern;
/*Box 18
 * * * * * *
 *         *
 *         *
 *         *
 *         *
 *         *
 *         *
 *         *
 * * * * * *   */
public class StarPattern18 {

    public static void print(int num){

        for (int i = 0; i < num; i++)
                System.out.print(" *");
        System.out.println();
        for (int i = 2; i < num; i++) {
            System.out.print(" *");

            for (int j = 1; j < num; j++)
                System.out.print(" ");

            System.out.println("   *");
        }
        for (int i = 0; i < num; i++)
            System.out.print(" *");


    }


    public static void main(String[] args) {
        print(5);
    }
}
