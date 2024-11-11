package pattern;

/*Alphabet Pattern 24

A

A B

A B C

A B C D

A B C D E

A B C D E F   */
public class StarPattern24 {

    public static void print(char rows) {

        for (char i = 'A'; i <= rows; i++) {

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
