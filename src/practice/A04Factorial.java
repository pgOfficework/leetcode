package practice;

import java.util.Scanner;

//4! = 4*3*2*1 = 24 

public class A04Factorial {
    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {
            int num = scanner.nextInt();
            int fact = 1;

            while (num != 0) {
                fact = fact * num--;
            }
            System.out.println(fact);
        }

    }
}
