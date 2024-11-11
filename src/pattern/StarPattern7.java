package pattern;
/*Star Pattern 7

     *

    * *

   * * *

  * * * *

 * * * * *    */
public class StarPattern7 {

    public static void print(int num){

        for (int i=0;i<num;i++){

            for ( int j= num; j >i; j--) {
                System.out.print(" ");
            }
            for ( int k= 0; k <=i; k++) {
                System.out.print(" *");
            }

            System.out.println();
        }

    }


    public static void main(String[] args) {
        print(5);
    }
}
