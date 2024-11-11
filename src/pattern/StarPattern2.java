package pattern;
/*Star Pattern 2

 * * * * *

 * * * *

 * * *

 * *

 *   */
public class StarPattern2 {

    public static void print(int num){

        for (int i=num;i>0;i--){
            for (int j = i; j >0; j--) {
                System.out.print("*");
            }
            System.out.println();
        }

    }


    public static void main(String[] args) {
        print(5);
    }
}
