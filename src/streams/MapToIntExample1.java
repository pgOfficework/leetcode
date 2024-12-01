package streams;

import java.util.Arrays;
import java.util.List;  
import java.util.stream.Collectors;  
import java.util.stream.IntStream;  
class OfficeEmployee {  
    private String EmployeeName;  
    private int EmployeeSalary;  
    public OfficeEmployee(String EmployeeName, int EmployeeSalary) {  
        this.EmployeeName = EmployeeName;  
        this.EmployeeSalary = EmployeeSalary;  
    }  
    public String Get_Name() {  
        return EmployeeName;  
    }  
    public int Get_Salary() {  
        return EmployeeSalary;  
    }  
    @Override  
    public String toString() {  
        return "OfficeEmployee{" +  
                "EmployeeName='" + EmployeeName + '\'' +  
                ", EmployeeSalary=" + EmployeeSalary +  
                '}';  
    }  
}  
public class MapToIntExample1{  
    public static void main(String[] args) {  
        // Creation of a list of OfficeEmployee objects  
        List<OfficeEmployee> employees = Arrays.asList(  
                new OfficeEmployee("Eshwar", 50000),  
                new OfficeEmployee("Sreeram", 60000),  
                new OfficeEmployee("Arti", 75000),  
                new OfficeEmployee("Meghana", 90000)  
        );  
        // Using mapToInt to calculate bonus based on EmployeeSalary  
        IntStream bonusStream = employees.stream()  
                .mapToInt(employee -> calculateBonus(employee.Get_Salary()));  
        // Displaying original list of employees  
        System.out.println("Original List of Employees: ");  
        employees.forEach(System.out::println);  
        // Displaying bonus amounts using mapToInt  
        System.out.println("\nBonus Amounts using mapToInt: ");  
        bonusStream.forEach(bonus -> System.out.print(bonus + " "));  
        // Using mapToInt to categorize employees into EmployeeSalary ranges  
        IntStream salaryRangeStream = employees.stream()  
                .mapToInt(employee -> categorizeSalaryRange(employee.Get_Salary()));  
        // Displaying EmployeeSalary ranges  
        System.out.println("\n\nSalary Ranges using mapToInt: ");  
        salaryRangeStream.forEach(range -> System.out.print(range + " "));  
        // Using mapToInt and filter to get total EmployeeSalary of high-performing employees  
        int totalHighPerformersSalary = employees.stream()  
                .filter(employee -> calculatePerformanceRating(employee.Get_Salary()) > 0.8)  
                .mapToInt(OfficeEmployee::Get_Salary)  
                .sum();  
        System.out.println("\n\nTotal Salary of High Performers: " + totalHighPerformersSalary);  
        // Using mapToInt and collecting to create a list of incremented salaries  
        List<Integer> incrementedSalaries = employees.stream()  
                .mapToInt(employee -> employee.Get_Salary() + 10000)  
                .boxed()  
                .collect(Collectors.toList());  
        System.out.println("\nList of Incremented Salaries using mapToInt and collect: " + incrementedSalaries);  
    }  
    private static int calculateBonus(int EmployeeSalary) {  
        // Simulated bonus calculation based on EmployeeSalary  
        return (int) (EmployeeSalary * 0.1);  
    }  
    private static int categorizeSalaryRange(int EmployeeSalary) {  
        // Simulated EmployeeSalary range categorization  
        if (EmployeeSalary < 60000) return 1;  
        else if (EmployeeSalary < 80000) return 2;  
        else return 3;  
    }  
    private static double calculatePerformanceRating(int EmployeeSalary) {  
        // Simulated performance rating calculation based on EmployeeSalary  
        return EmployeeSalary > 70000 ? 0.9 : 0.7;  
    }  
}  