package practice;

import java.util.Scanner;

//76X76=57 76 true

public class N03AutomorphicNumber {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int number = scanner.nextInt(); // 76
            int n = number;
            int d = 1;
            int rem = 0;

            int calculation = number * number;

            while (n > 0) {
                n = n / 10;
                d = d * 10;
            }

            rem = calculation % d;

            if (number == rem) {
                System.out.println("Automorphic");
            } else {
                System.out.println("Not Automorphic");
            }
        }

    }
}
