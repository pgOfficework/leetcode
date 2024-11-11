package pattern;

/*Alphabet Pattern 25

    A

   A B

  A B C

 A B C D

A B C D E  */
public class StarPattern25 {

    public static void print(char rows) {

        for (char i = 'A'; i <= rows; i++) {

            for (int j = i; j < rows; j++) {
                System.out.print(" ");
            }

            for (char j = 'A'; j <= i; j++) {
                System.out.print(j+" ");
            }

            System.out.println();
        }

    }
    
    public static void main(String[] args) {
        print('D');
    }
}
