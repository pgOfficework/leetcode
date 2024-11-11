package pattern;
/*Star Pattern 16

     *
    * *
   * * *
  * * * *
 * * * * *    */
public class StarPattern16 {

    public static void print(int num){

        for (int i = 1; i < num; i++) {

            for (int j = i; j < num; j++)
                System.out.print(" ");

            for (int j = 0; j < i; j++)
                System.out.print("* ");

            System.out.println();
        }

    }


    public static void main(String[] args) {
        print(5);
    }
}
