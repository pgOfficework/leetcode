package IBM;

import java.util.*;
import java.util.stream.Collectors;

class Employee {
    private String empId;
    private String empName;
    private int salary;
    private String band;

    public Employee(String empId, String empName, int salary, String band) {
        this.empId = empId;
        this.empName = empName;
        this.salary = salary;
        this.band = band;
    }

    public String getEmpId() {
        return empId;
    }

    public String getEmpName() {
        return empName;
    }

    public int getSalary() {
        return salary;
    }

    public String getBand() {
        return band;
    }
}

public class EmployeePromotionEvaluation {

    private static class EmployeePerformance {
        private String empId;
        private int learningHrs;
        private int rating;
        private int salary;
        private int year;

        public EmployeePerformance(String empId, int learningHrs, int rating, int salary, int year) {
            this.learningHrs = learningHrs;
            this.rating = rating;
            this.salary = salary;
            this.year = year;
            this.empId = empId;
        }

        public int getLearningHrs() {
            return learningHrs;
        }

        public String getEmpId() {
            return empId;
        }

        public int getRating() {
            return rating;
        }

        public int getSalary() {
            return salary;
        }

        public int getYear() {
            return year;
        }
    }

    private static List<Employee> employees = new ArrayList<>();
    private static List<EmployeePerformance> employeePerformances = new ArrayList<>();

    public static void main(String[] args) {
        employees.add(new Employee("01234", "Robin Thomas", 90000, "7A"));
        employees.add(new Employee("123467", "Suvajit Sanyal", 100000, "7B"));
        employees.add(new Employee("ABCXYZ", "Netaji Bose", 25000, "6A"));
        employees.add(new Employee("KKSK09", "Jhasin Rani", 25000, "6A"));

        employeePerformances.add(new EmployeePerformance("01234", 70, 6, 70000, 2021));
        employeePerformances.add(new EmployeePerformance("01234", 40, 8, 65000, 2020));
        employeePerformances.add(new EmployeePerformance("01234", 60, 6, 60000, 2019));

        employeePerformances.add(new EmployeePerformance("123467", 70, 9, 90000, 2021));
        employeePerformances.add(new EmployeePerformance("123467", 55, 6, 90000, 2020));
        employeePerformances.add(new EmployeePerformance("123467", 90, 8, 90000, 2019));

        String empId = "123467";
        validateForPromotion(empId);
    }

    private static void validateForPromotion(String empId) {
        Employee employee = employees.stream().filter(e -> e.getEmpId().equals(empId)).findFirst().orElse(null);

        if (employee == null) {
            System.out.println("INVALID INPUT");
            return;
        }

        if (employee.getBand().equals("6A")) {
            System.out.println("NOT A ELIGIBLE CANDIDATE");
            return;
        }

        List<EmployeePerformance> employeePerformancesForEmployee = employeePerformances.stream()
                .filter(e -> e.getEmpId().equals(empId)).collect(Collectors.toList());

        double averageLearningHrs = employeePerformancesForEmployee.stream()
                .mapToInt(EmployeePerformance::getLearningHrs).average().orElse(0);
        double averageRating = employeePerformancesForEmployee.stream().mapToInt(EmployeePerformance::getRating)
                .average().orElse(0);
        int lastRating = employeePerformancesForEmployee.get(0).getRating();

        if (averageRating >= 6 && lastRating >= 8 && averageLearningHrs >= 70) {
            System.out.println("EMP NAME: " + employee.getEmpName() + ", EMPID: " + employee.getEmpId()
                    + ", CURRENT SALARY: " + employee.getSalary() + ", CURRENT BAND: " + employee.getBand());
        }
    }
}
