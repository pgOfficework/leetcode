package streams;

import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.*;

public class Sorting {
    public static void main(String[] args) {
        List<People> people = List.of(new People("John", "Boston"),
                new People("Mary", "Boston"),
                new People("Anthony", "Boston"),
                new People("Monica", "Amsterdam"),
                new People("Seth", "São Paulo"));

        Collection<People> collect = people.stream()
                .sorted(Comparator.comparing(People::getCity)
                        .thenComparing(People::getName))
                .collect(toList());

        for (People s: collect){
            System.out.println(s.city+ " "+s.name);
        }


    }
}
