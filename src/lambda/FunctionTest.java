package lambda;

import java.util.ArrayList;
import java.util.function.Function;

class Employee1 {
    int salary;
    String name;

    public Employee1(int salary, String name) {
        super();
        this.salary = salary;
        this.name = name;
    }


}

public class FunctionTest {

    public static void main(String[] args) {
        ArrayList<Employee1> emp = new ArrayList<>();

        emp.add(new Employee1(100000, "A"));
        emp.add(new Employee1(200000, "B"));
        emp.add(new Employee1(300000, "C"));
        emp.add(new Employee1(400000, "D"));

        Function<Employee1, Integer> fn = e -> {
            int sal = e.salary;

            if (sal > 300000)
                return sal * 10 / 100;
            else
                return sal * 8 / 100;

        };

        for (Employee1 employee : emp) {
            System.out.println(fn.apply(employee));
        }
    }

}
