package string;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

public class JavaSubstringComparisons {
    public static String getSmallestAndLargest1(String s, int k) {

        String smallest = s.substring(0,k);
        String largest = s.substring(0,k);

        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'


        for (int j = 1; j < s.length()-k+1; j++) {
            int i=0;
            String temp = s.substring(j,j+k);

            while (i<k){
                if (temp.charAt(i)>smallest.charAt(i)){
                    break;
                }
                else if (temp.charAt(i)==smallest.charAt(i)){
                    i++;
                }
                else {
                    smallest=temp;
                    break;
                }
            }
            i=0;
            while (i<k){
                if (temp.charAt(i)<largest.charAt(i)){
                    break;
                }
                else if (temp.charAt(i)==largest.charAt(i)){
                    i++;
                }
                else {
                    largest=temp;
                    break;
                }
            }

        }

        return smallest + "\n" + largest;
    }

    public static String getSmallestAndLargest(String s, int k) {

        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'

        List<String> list=new ArrayList<>();

        int start=0;
        int i=0;

        while (k<=s.length()){
            list.add(s.substring(start++,k++));
        }
        List<String> sorted = list.stream().sorted().toList();

        return sorted.get(0) + "\n" + sorted.get(sorted.size()-1);
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = "welzaaaometojava";
        int k = 3;
        scan.close();

        System.out.println(getSmallestAndLargest(s, k));

        System.out.println("array");
        System.out.println(getSmallestAndLargest1(s, k));
    }
}