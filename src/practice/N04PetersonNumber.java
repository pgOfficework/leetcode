package practice;

/* Suppose, we have to check the number (n) 145 is Peterson or not.

Number = 145

145 = !1 + !4 + !5

=1+4*3*2*1+5*4*3*2*1

=1+24+120

145=145 */
public class N04PetersonNumber {
    public static void main(String[] args) {
        int number = 145;
        int num = number;

        int fact = 1;
        int rem = 0;
        int sum = 0;

        while (num > 0) {
            fact = 1;
            rem = num % 10;
            while (rem > 1) {
                fact = fact * rem--;
            }
            sum = sum + fact;
            num = num / 10;
        }

        if (number == sum) {
            System.out.println("Peterson Number");
        } else {
            System.out.println("Not Peterson Number");
        }
    }
}
