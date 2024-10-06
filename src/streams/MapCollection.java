package streams;

import java.util.HashMap;
import java.util.Map;

public class MapCollection {
    public static void main(String[] args) {
        Map<String,String> map= new HashMap<>();

        map.put("a","abc");
        map.put("b","bcd");
        map.put("c","cde");
        map.put("d","def");


        map.entrySet().stream().forEach(m->{
            System.out.println(m.getKey()+" : "+m.getValue());
        });
    }
}
