package streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FilterOddAndEvenNumbers {

    public static void main(String[] args) {
        List<Integer> integersList = new ArrayList<>();
        integersList.add(1);
        integersList.add(2);
        integersList.add(3);
        integersList.add(4);
        integersList.add(5);

        integersList.stream()
                .collect(Collectors.partitioningBy(p -> p % 2 == 0));
    }
}