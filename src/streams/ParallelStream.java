package streams;

import java.util.*;

public class ParallelStream {
    public static void main(String[] args) {
        Map<String, List<String>> map = new HashMap<>();
        List<List<String>> list=new ArrayList<>();

        List<String> list1 = Arrays.asList("car", "car", "bike", "bus", "bus", "bus");
        List<String> list2 = Arrays.asList("Aaaaaaaaaa", "Bbbbb", "Ccccccccccc","Ddddddddd");
        List<String> list3 = Arrays.asList("Maruti", "Honda", "Pagani", "BMW", "Lamborghini", "Wolkswagon");


        map.put("a", list1);
        map.put("b", list2);
        map.put("c", list3);

     //   list.add(list1);
      //  list.add(list2);
        list.add(list3);

        map.entrySet().stream().parallel().forEach(System.out::println);

        list3.parallelStream().forEach(System.out::println);



    }

}
