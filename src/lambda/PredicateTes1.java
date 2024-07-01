package lambda;

import java.util.function.Predicate;
import java.util.ArrayList;

class Employee {
    String id;
    String name;
    int salary;
    int exp;

    Employee(String id, String name, int salary, int exp) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.exp = exp;
    }
}

public class PredicateTes1 {

    public static void main(String[] args) {

        ArrayList<Employee> list = new ArrayList<Employee>();

        list.add(new Employee("1", "John", 1000000, 5));
        list.add(new Employee("2", "john", 2000000, 6));
        list.add(new Employee("3", "Wick", 3000000, 7));
        list.add(new Employee("4", "carter", 4000000, 8));
        list.add(new Employee("5", "liam", 5000000, 9));

        Predicate<Employee> pr = e -> (e.salary > 3000000 && e.exp > 7);
        Predicate<Employee> pr1 = e -> e.salary > 300000;
        Predicate<Employee> pr2 = e -> e.exp > 7;

        for (Employee employee : list) {
            if (pr.test(employee)) {
                System.out.println("name : " + employee.name + " exp : " + employee.exp);
            }
        }

        System.out.println("----and----");
        for (Employee employee : list) {
            if (pr1.and(pr2).test(employee)) {
                System.out.println("name : " + employee.name + " exp : " + employee.exp);
            }
        }

        System.out.println("----or----");
        for (Employee employee : list) {
            if (pr1.or(pr2).test(employee)) {
                System.out.println("name : " + employee.name + " exp : " + employee.exp);
            }
        }

        System.out.println("----negate----");
        for (Employee employee : list) {
            if (pr2.negate().test(employee)) {
                System.out.println("name : " + employee.name + " exp : " + employee.exp);
            }
        }

    }

}
