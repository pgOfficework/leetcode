package test;

import java.util.Arrays;
import java.util.List;

public class TestSapiance {

    public static void main(String[] args) {
        List<String> list= Arrays.asList("sap","aa","bengaluru");

       list.stream().filter(m -> m.startsWith("s")).forEach(System.out::println);

       String name="Prathamesh";

        for (int i = 0; i < name.length()-1; i++) {
                System.out.println(name.charAt(i++));
        }

    }
}
