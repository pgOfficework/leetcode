package streams;

public class Employee {
    private String name;
    private String jobTitle;
    private int age;
    int salary;
 
    public Employee(String name, String jobTitle, int age, int salary) {
        this.name = name;
        this.jobTitle = jobTitle;
        this.age = age;
        this.salary = salary;
    }
    public Employee(int salary, String name) {
        this.name = name;
        this.salary = salary;
    }
 
    // getters and setters



    public String toString() {
        return String.format("%s\t%s\t%d\t%d", name, jobTitle, age, salary);
    }

    public String getName() {
        return name;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public int getAge() {
        return age;
    }

    public int getSalary() {
        return salary;
    }
}