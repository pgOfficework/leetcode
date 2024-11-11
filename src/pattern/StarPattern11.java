package pattern;
/*Diagonal 11

          *

        *

      *

    *

 *             */
public class StarPattern11 {

    public static void print(int num){

        for (int i=0;i<num;i++){


            for ( int j= num; j >i; j--) {
                System.out.print(" ");
            }
            System.out.println(" *");
        }

    }


    public static void main(String[] args) {
        print(5);
    }
}
