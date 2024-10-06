package test;

import java.util.HashMap;
import java.util.Map;

public class MapTest {
    public static void main(String[] args) {
        Map<String,Integer> map=new HashMap<>();

        map.put(new String("ABC"),1);
        map.put(new String("ABC"),2);

        System.out.println(map.get("ABC"));

        System.out.println(new String("ABC").hashCode());
        System.out.println(new String("ABC").hashCode());

        String str1="May";
        String str2=new String("June");
        String str3=new String(str2.concat("July"));
        str1.concat(str3);
        str2=str3;

        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);


        Map<Customer,Integer> map1=new HashMap<>();

        map1.put(new Customer("ABC"),1);
        map1.put(new Customer("ABC"),2);

        System.out.println(map1.get(new Customer("ABC")));

        String s3 = "JournalDev";
        int start = 1;
        char end = 5;
        System.out.println(s3.substring(start, end));
    }
}
