package streams.comparator;

import org.apache.commons.lang.builder.CompareToBuilder;
import streams.Employee;

import java.util.Collections;
import java.util.Comparator;

public class EmployeeComparator implements Comparator<Employee> {
 
    @Override
    public int compare(Employee o1, Employee o2) {
        return new CompareToBuilder()
                .append(o1.getJobTitle(), o2.getJobTitle())
                .append(o1.getAge(), o2.getAge())
                .append(o1.getSalary(), o2.getSalary()).toComparison();
    }

    //Collections.sort(listEmployees, new EmployeeComparator());



}