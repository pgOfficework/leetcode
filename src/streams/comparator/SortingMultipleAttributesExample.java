package streams.comparator;

import streams.Employee;
import streams.EmployeeDataBase;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
 
/**
 * This program demonstrates how to sort a list collection by multiple
 * attributes using a chained comparator.
 *
 * @author www.codejava.net
 *
 */
public class SortingMultipleAttributesExample {
 
    public static void main(String[] args) {
 
        System.out.println("===== SORTING BY MULTIPLE ATTRIBUTES =====");
 
        List<Employee> listEmployees = EmployeeDataBase.getAllEmployees();
 
        System.out.println("*** Before sorting:");
 
        for (Employee emp : listEmployees) {
            System.out.println(emp);
        }

        //using EmployeeComparator class
        Collections.sort(listEmployees, new EmployeeComparator());

        //using EmployeeChainedComparator class
//        Collections.sort(listEmployees, new EmployeeChainedComparator(
//                new EmployeeJobTitleComparator(),
//                new EmployeeAgeComparator(),
//                new EmployeeSalaryComparator())
//        );
 
        System.out.println("\n*** After sorting:");
 
        for (Employee emp : listEmployees) {
            System.out.println(emp);
        }
 
    }
}