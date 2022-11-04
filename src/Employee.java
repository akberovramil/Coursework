import java.util.Arrays;
public class Employee {
    private String worker;
    private double salary;
    private static int count;
    private int id;
    private String departments;
    public Employee(String worker, int salary, String departments) {
        this.worker = worker;
        this.salary = salary;
        this.departments = departments;
        id = ++count;
        }

    public static int getCount() {
        return count;
    }

    public String getWorker() {
        return worker;
    }

    public double getSalary() {
        return salary;
    }

    public String getDepartments() {
        return departments;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void setDepartments(String departments) {
        this.departments = departments;
    }
    @Override
    public String toString() {
        return "ID " + id + ", работник - " + worker + ", зарплата - " + salary + " руб." + ", отдел - " + departments;
    }
}


