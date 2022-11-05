public class Main {

    public static void main(String[] args) {
        EmployeeBook employeesBook = new EmployeeBook();
        System.out.println(employeesBook.getAverageSalary());
        System.out.println(employeesBook.getMaxSalary());
        System.out.println(employeesBook.getMinSalary());
        System.out.println(employeesBook.getSumOfSalaries());
        employeesBook.getNamesOfWorkers();
        employeesBook.getAllInfoAboutWorkers();
    }
}
