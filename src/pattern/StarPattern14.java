package pattern;
/*Rombus 15

     *

    * *

   *   *

  *     *

 *       *

  *     *

   *   *

    * *

     *     */
public class StarPattern14 {

    public static void print(int num){

        for (int i = 0; i <num; i++)
            System.out.print(" ");
        System.out.println("*");

        for (int i=1;i<num;i++){

            for (int j = i; j <num ; j++)
                System.out.print(" ");
            System.out.print("*");

            for (int j = 0; j <i ; j++)
                System.out.print(" ");

            for ( int j= 0; j<i; j++)
                System.out.print(" ");
            System.out.println("*");

        }

        for (int i=2;i<num;i++){

            for (int j = 0; j <i ; j++)
                System.out.print(" ");
            System.out.print("*");

            for ( int j= i; j<num; j++)
                System.out.print(" ");

            for ( int j= i; j<num; j++)
                System.out.print(" ");
            System.out.println("*");

        }

        for (int i = 0; i <num; i++)
            System.out.print(" ");
        System.out.println("*");


    }


    public static void main(String[] args) {
        print(5);
    }
}
