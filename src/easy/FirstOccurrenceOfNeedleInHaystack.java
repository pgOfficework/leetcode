package easy;

/* Given two strings needle and haystack, return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.

Example 1:

Input: haystack = "sadbutsad", needle = "sad"
Output: 0
Explanation: "sad" occurs at index 0 and 6.
The first occurrence is at index 0, so we return 0.
Example 2:

Input: haystack = "leetcode", needle = "leeto"
Output: -1
Explanation: "leeto" did not occur in "leetcode", so we return -1. */
public class FirstOccurrenceOfNeedleInHaystack {
    public static void main(String[] args) {
        String haystack = "a";
        String needle = "a";
        System.out.println(checkOcurence(haystack, needle));

    }

    private static int checkOcurence(String haystack, String needle) {
        int haystackLength = haystack.length();
        int needleLength = needle.length();
        for (int i = 0; i <= haystackLength - needleLength; i++) {
            int j = i;
            int k = 0;
            int count = 0;
            while (haystack.charAt(j) == needle.charAt(k)) {
                j++;
                k++;
                count++;
                if (count == needleLength)
                    return i;
            }

        }
        // int haystackLength = haystack.length();
        // int needleLength = needle.length();
        // for (int i = 0; i < haystackLength; i++) {
        // if (haystackLength - needleLength >= 0) {
        // for (int j = 0; j < needleLength; j++) {
        // int k = i + j;
        // if (k >= haystackLength)
        // return -1;
        // else if (haystack.charAt(k) != needle.charAt(j)) {
        // break;
        // } else if ((haystack.charAt(k) == needle.charAt(j)) && (j == (needleLength -
        // 1))) {
        // return i;
        // }
        // }
        // }
        // }
        return -1;
    }
}
