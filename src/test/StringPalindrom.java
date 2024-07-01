package test;

import java.util.stream.Stream;

public class StringPalindrom {
    public static void main(String[] args) {
        String str = "tacocat";
        int l = str.length();
        Boolean flag = true;
        int i = 0;

        while (i < l / 2) {
            if (str.charAt(i) != str.charAt(l - 1 - i)) {
                flag = false;
            }
            i++;
        }
        if (flag)
            System.out.println("palindrom");
        else
            System.out.println("Not Palindrom");

        StringBuilder sb = new StringBuilder("tacocat");
        if (sb == sb.reverse())
            System.out.println("is palindrom");
        else
            System.out.println("Not Palindrom");

    }


}
