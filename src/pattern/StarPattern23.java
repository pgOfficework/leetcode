package pattern;

/*Ruby Pattern 23

   A

  B B

 C   C

D     D

 C   C

  B B

   A     */
public class StarPattern23 {

    public static void print(char rows) {

        for (int j = 'A'; j <rows ; j++) {
            System.out.print(" ");
        }
        System.out.println('A');
        for (char i = 'B'; i <= rows; i++) {
            for (int j = i; j <rows ; j++) {
                System.out.print(" ");
            }
            System.out.print(i);
            for (int j = 0; j < (i-'A')*2; j++) {
                System.out.print(" ");
            }
            System.out.println(i);
        }

        for (char i = (char) (rows-1); i >'A'; i--) {
            for (int j = i; j <rows ; j++) {
                System.out.print(" ");
            }
            System.out.print(i);
            for (int j = 0; j < (i-'A')*2; j++) {
                System.out.print(" ");
            }
            System.out.println(i);
        }
        for (int j = 'A'; j <rows ; j++) {
            System.out.print(" ");
        }
        System.out.println('A');

    }
    
    public static void main(String[] args) {
        print('D');
    }
}
