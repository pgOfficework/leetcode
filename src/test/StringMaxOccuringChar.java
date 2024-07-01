package test;

import java.util.HashSet;
import java.util.Set;

//How to find the maximum occurring character in a given String?

public class StringMaxOccuringChar {
    public static void main(String[] args) {
        String str = "aaaabcddaa";
        int count = 0;
        int maxCount = 0;
        char maxChar = 0;


        char[] ch = str.toCharArray();
        Set<Character> set = new HashSet<>();

        for (int i = 0; i < ch.length; i++) {
            if (!set.contains(ch[i])) {
                set.add(ch[i]);
                for (int j = i; j < ch.length; j++) {
                    if (ch[i] == ch[j])
                        count++;
                }
            }
            if (count > maxCount) {
                maxChar = ch[i];
                maxCount = count;
            }
            count = 0;
        }
        System.out.println("char : " + maxChar);
        System.out.println("maxCount : " + maxCount);
    }
}
