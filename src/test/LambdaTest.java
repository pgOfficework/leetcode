package test;

public class LambdaTest {

    public static void main(String[] args) {

        FunctionalInterfaceTest obj = (int a, int b) -> {
            return a + b;
        };
        System.out.println(obj.dispalySum(2, 3));

    }

}
