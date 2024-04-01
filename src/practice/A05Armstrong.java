package practice;
//153: 1x3 + 5x3 + 3x3 = 1 + 125+ 27 = 153
//125: 1x3 + 2x3 + 5x3 = 1 + 8 + 125 = 134 (Not an Armstrong Number)

import java.util.Scanner;

public class A05Armstrong {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int number=sc.nextInt();
            int number2=0;
            int rem;
            int number1=number;

            while (number1>0) {
                rem=number1%10;
                number2=number2+(rem*rem*rem);
                number1=number1/10;
            }
            if (number2==number) {
                System.out.println(number+" is armstrong number");
            } else {
                System.out.println(number+" is not armstrong number");
            }
        }
    }
}
