package pattern;
/*Star Pattern 3

 *
 * *
 * * *
 * * * *
 * * * * *
 * * * *
 * * *
 * *
 *   */
public class StarPattern3 {

    public static void print(int num){

        for (int i=0;i<num;i++){
            for (int j = 0; j <=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i=num-1;i>0;i--){
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
