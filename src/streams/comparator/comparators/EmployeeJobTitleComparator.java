package streams.comparator.comparators;

import streams.Employee;

import java.util.Comparator;
 
/**
 * This comparator compares two employees by their job titles.
 * @author www.codejava.net
 *
 */
public class EmployeeJobTitleComparator implements Comparator<Employee> {
 
    @Override
    public int compare(Employee emp1, Employee emp2) {
        return emp1.getDept().compareTo(emp2.getDept());
    }
}