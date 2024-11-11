package streams;

import org.w3c.dom.ls.LSOutput;

import java.util.*;
import java.util.stream.Collectors;


public class MapTest {

    public static void main(String[] args) {
        String s1 = "pp";
        String s2 = null;
        s1.intern();
        List<String> cars = Arrays.asList("Maruti", "Honda", "Pagani", "BMW", "Lamborghini", "Wolkswagon");

        List<Employee> emp = EmployeeDataBase.getAllEmployees();

        List<Integer> numberList = Arrays.asList(10, 20, 25, 40, 50);

        //filter
        numberList.stream().filter(n -> n % 2 == 0).forEach(System.out::println);

        emp.stream().filter(str -> str.getName().length() > 8).forEach(n -> System.out.println(n.getName()));

        emp.stream().filter(e -> e.getSalary() > 200000).forEach(n -> System.out.println(n.getSalary()));

        //Map
        List<String> uppercaseCars;
        uppercaseCars = cars.stream().map(c -> c.toUpperCase()).collect(Collectors.toList());
        System.out.println(uppercaseCars);

        emp.stream().filter(e -> e.getSalary() > 200000).map(e -> e.getSalary() + 123).forEach(System.out::println);

        emp.stream().map(e -> e.getSalary() + 11).forEach(e -> System.out.println(e));


        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

        int sum = list.stream().mapToInt(i -> i).sum();
        System.out.println(sum);

        sum = list.stream().reduce(0, (a, b) -> a + b + 1);
        System.out.println(sum);

        sum = list.stream().reduce(Integer::sum).get();
        System.out.println(sum);

        String nullName = null;
        String name = Optional.ofNullable(s1).orElseThrow(
                IllegalArgumentException::new);
        System.out.println(name);

        List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

        Integer reduce = list1.stream().reduce(0, Integer::sum);
        System.out.println("sum " + reduce);

        int sum1 = list1.stream().mapToInt(Integer::intValue).sum();

        System.out.println("sum1 " + reduce);


        List<Integer> nums = Arrays.asList(1,2,3,4,5);

        Map<Boolean, List<Integer>> collect = nums.stream().collect(Collectors.partitioningBy(a -> a % 2 == 0));

        System.out.println(collect);

        emp.forEach(System.out::println);

        Map<String, List<Employee>> collect1 = emp.stream().collect(Collectors.groupingBy(Employee::getDept));

        System.out.println();

        collect1.entrySet().forEach(System.out::println);

        Map<String, Long> collect2 = emp.stream().collect(Collectors.groupingBy(Employee::getDept, Collectors.counting()));

        System.out.println();

        collect2.entrySet().forEach(System.out::println);

        //findFirst

        Employee employee = emp.stream().filter(e -> e.getDept().equals("Development"))
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("Employee not Found"));

        System.out.println(employee);

        boolean anyMatch = emp.stream()
                .anyMatch(e -> e.getId() == 1);

        System.out.println(anyMatch);

        List<Employee> skip = emp.stream().sorted(Comparator.comparing(Employee::getId))
                .skip(2)
                .toList();

        System.out.println(skip);
    }

}
