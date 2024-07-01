package test;

//How to remove all duplicates from a given string?
public class StringRemoveDuplicateChar {

    public static String unique(String s) {
        String str = new String();
        int l = s.length();
        for (int i = 0; i < l; i++) {
            char c = s.charAt(i);
            if (str.indexOf(c) < 0) {
                str += c;
            }

        }

        return str;
    }

    public static void main(String[] args) {
        // Input string with repeating chars
        String s = "geeksforgeeks";

        System.out.println(unique(s));
    }

}
	
