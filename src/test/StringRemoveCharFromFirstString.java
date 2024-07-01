package test;

//How to remove characters from the first String which are present in the second String? (solution)
//For example, if the first String "India is great" and the second String is "in" then the output should be "da s great"
public class StringRemoveCharFromFirstString {

    public static void main(String[] args) {
        String str1 = "India is great";
        String str2 = "in";
        String str = new String();
        int len = str2.length();

        str1 = str1.toLowerCase();

        for (int i = 0; i < len; i++) {
            char c = str2.charAt(i);


            for (int j = 0; j < str1.length(); j++) {

                if (c != str1.charAt(j)) {
                    str += str1.charAt(j);
                }
            }
            str1 = str;
            str = "";
        }

        System.out.println(str1);

    }

}
