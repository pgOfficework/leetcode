package practice;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class A06RandomNumber {
    public static void main(String[] args) {
        //Using the random() Method
        System.out.println(Math.random());

        //Using the Random Class
        Random random = new Random();
        System.out.println(random.nextInt(50));

        //Using the ThreadLocalRandom Class
        System.out.println(ThreadLocalRandom.current().nextDouble());

        //Using the ints() Method (in Java 8)
        //method that generates a stream of 9 integers between 50 to 90
        random.ints(4, 50, 90).forEach(System.out::println);
    }
}
