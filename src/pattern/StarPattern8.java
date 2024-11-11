package pattern;
/*Star Pattern 8

 * * * * *

  * * * *

   * * *

    * *

     *  */
public class StarPattern8 {

    public static void print(int num){

        for (int i=0;i<num;i++){

            for ( int k= 0; k <=i; k++) {
                System.out.print(" ");
            }
            for ( int j= num; j >i; j--) {
                System.out.print(" *");
            }
            System.out.println();
        }

    }


    public static void main(String[] args) {
        print(5);
    }
}
