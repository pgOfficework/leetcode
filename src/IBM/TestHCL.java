package IBM;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// {{1,2,3},{4},{5,6}}
public class TestHCL {

    public static void main(String[] args) {
        List<List<Integer>> list = new ArrayList<>();

        list.add(Arrays.asList(1, 2, 3));
        list.add(Arrays.asList(4));
        list.add(Arrays.asList(5, 6));

        //with stream
        List<Integer> calculationWithStream = calculationWithStream(list);
        System.out.println(calculationWithStream.toString());

        //with for loop
        List<Integer> calculation = calculation(list);
        System.out.println(calculation.toString());


    }

    private static List<Integer> calculationWithStream(List<List<Integer>> list) {

        list.stream().map(a -> a.stream().mapToInt(Integer::intValue).sum()).toList();

        return list.stream().map(a -> a.stream().mapToInt(Integer::intValue).sum()).toList();
    }


    public static List<Integer> calculation(List<List<Integer>> list) {

        List<Integer> result = new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {
            List<Integer> temp = list.get(i);
            int tempResult = 0;

            for (int j = 0; j < temp.size(); j++) {
                tempResult = tempResult + temp.get(j);
            }
            result.add(tempResult);
        }

        return result;
    }
}
