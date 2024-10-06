package easy;

public class ReverseInteger {
    public static void main(String[] args) {
        System.out.println(reverse(1534236469));
    }

    public static int reverse(int x) {
        if(x>-10 && x<10 ){
            return x;
        }

        int mul=(x>0)?1:-1;
       // System.out.println(Math.abs(x));
        x=Math.abs(x);
        int rev=0;

        while (x>0){
            if(rev<Integer.MIN_VALUE/10 ||rev>Integer.MAX_VALUE/10)
                return 0;
            rev=(rev*10)+(x%10);
            x=x/10;
            System.out.println(rev);
        }
        rev=rev*mul;

        return rev;

    }
}
