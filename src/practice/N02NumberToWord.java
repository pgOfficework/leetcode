package practice;

public class N02NumberToWord {
    public static void main(String[] args) {

        String number = "4556";
        char[] num = number.toCharArray();
        int length = num.length;

        if (num.length > 0) {
            if (length == 1) {
                System.out.println(oneDigit(num[0]));
            } else if (length == 2) {
                System.out.println(twoDigit(num));
            } else if (length == 3) {
                System.out.println(threeDigit(num));
            } else if (length == 4) {
                System.out.println(fourDigit(num));
            }
            else {
                System.out.println("Given number has more tha 4 digits");
            }

        }

    }

    static String oneDigit(char num) {
        if (num != 0) {
            String[] oneDigit = { "Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine" };
            return oneDigit[num - '0'];
        } else
            return "";
    }

    static String twoDigit(char[] num) {
        String res = "";
        if (num[num.length - 2] == '1') {
            String[] elevenToNinteen = { "Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen",
                    "Seventeen", "Eighteen", "Ninteen" };
            return elevenToNinteen[num[1] - '0'];
        } else if (num[num.length - 2] != '0') {

            String[] tenthDigit = { "Twenty", "Thirthy", "Fourty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninty" };
            return tenthDigit[num[num.length - 2] - '2'] + " " + oneDigit(num[num.length - 1]);
        }
        return res;

    }

    static String threeDigit(char[] num) {
        return oneDigit(num[num.length - 3]) + " " + "Hundred" + " " + twoDigit(num);

    }

    static String fourDigit(char[] num) {
        return oneDigit(num[0]) + " " + "Thousand" + " " + threeDigit(num);
       

    }

}
