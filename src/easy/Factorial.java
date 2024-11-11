package easy;

public class Factorial {

    public static void main(String[] args) {
        System.out.println(findFact(4L));
    }

    private static Long findFact(Long num) {
        if (num < 2) {
            return num;
        }
        return num * findFact(num - 1);
    }
}
