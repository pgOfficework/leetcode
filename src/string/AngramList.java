package string;

import java.util.*;
import java.util.stream.Collectors;

/**
 * Anagrams are popular word play puzzles, where by rearranging letters of one set of words, you get another set of words.
 * For example, "eleven plus two" is an anagram for "twelve plus one".
 * Crossword puzzle enthusiasts and scrabble players benefit from the ability
 * to view all possible anagrams of a given set of letters.
 * Write a program that takes as input a set of words and returns groups of anagrams for those words.
 *
 * For example, if the input is [ "debitcard", "elvis", "silent", "badcredit",
 * "lives", "freedom", "listen", "levis" ], then there are three group of anagrams.
 *
 * Output:
 * 1. debitcard, badcredit
 * 2. elvis, lives, levis
 * 3. silent, listen
 */

public class AngramList {
    public static void main(String[] args) {

        String[] array = {"debitcard", "elvis", "silent", "badcredit","lives", "freedom", "listen", "levis"};

        String str="debitcard";

        char[] chars =str.toCharArray();
        Arrays.sort(chars);
     //   System.out.println(new String(chars));

        Map<String, List<String>> map=new HashMap<>();


        Arrays.asList(array).stream().forEach(a->{
            System.out.println(a);
            char[] c=a.toCharArray();
            Arrays.sort(c);
            String s = new String(c);

            if (map.containsKey(s)){
                List<String> strings = map.get(s);
                strings.add(a);
                map.put(s,strings);
            }
            else {
                List<String> mapList=new ArrayList<>();
                mapList.add(a);
                map.put(s,mapList);
            }


        });

        List<List<String>> collect = map.entrySet().stream().map(a -> a.getValue()).collect(Collectors.toList());

        System.out.println(collect);
        
        
    }
}
