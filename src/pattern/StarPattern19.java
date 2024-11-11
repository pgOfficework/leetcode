package pattern;
/*Box 18
1

1 2

1 2 3

1 2 3 4

1 2 3 4 5    */
public class StarPattern19 {

    public static void print(int num){

        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }


    }


    public static void main(String[] args) {
        print(5);
    }
}
