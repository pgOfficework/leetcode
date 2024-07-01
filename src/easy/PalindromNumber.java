package easy;

public class PalindromNumber {

    public static void main(String[] args) {
        int num = 1211;
        String str = String.valueOf(num);

        int start = 0;
        int end = str.length() - 1;

        while (start < end) {
            if (str.charAt(start) != str.charAt(end)) {
                System.out.println("false");
            }
            start++;
            end--;
        }


    }

}
