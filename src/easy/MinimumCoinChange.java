package easy;

public class MinimumCoinChange {
    public static void main(String[] args) {
        System.out.println(coins(50));
    }

    public static int coins(int num) {
        if (num == 25 || num == 10 || num == 5 || num == 1)
            return 1;

        int count = 0;

        count += num / 25;
        num %= 25;

        count += num / 10;
        num %= 10;

        count += num / 5;
        num %= 5;

        count += num;

        return count;
    }
}
