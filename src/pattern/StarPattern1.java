package pattern;
/*Star Pattern 1

 *

 * *

 * * *

 * * * *

 * * * * *   */
public class StarPattern1 {

    public static void print(int num){

        for (int i=0;i<num;i++){
            for (int j = 0; j <=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }


    public static void main(String[] args) {
        print(5);
    }
}
