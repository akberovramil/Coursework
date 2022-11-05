public class EmployeeBook {

    public static Employee[] employees;

    private EmployeeBook(Employee[] employees) {
        this.employees = employees;
    }
    EmployeeBook() {
        this.employees = new Employee[10];
        employees[0] = new Employee(("Акберов Рамиль Дамирович"), 66000, "Редакция");
        employees[1] = new Employee("Баранов Павел Павлович", 5600, "Редакция");
        employees[2] = new Employee(("Крабов Илья Геннадьевич"), 47854, "Котельная");
        employees[3] = new Employee(("Пичушкин Геннадий Альбертович"), 60600, "Юридический отдел");
        employees[4] = new Employee(("Бобров Михаил Иванович"), 64775, "Бухгалтерия");
        employees[5] = new Employee(("Шишкин Василий Александрович"), 56789, "Редакция");
        employees[6] = new Employee(("Крабов Павел Робертович"), 46987, "Охрана");
        employees[7] = new Employee(("Бедаев Борис Евгеньевич"), 53668, "Редакция");
        employees[8] = new Employee(("Попков Константин Петрович"), 36000, "Редакция");
        employees[9] = new Employee(("Евгеньев Леонид Михайлович"), 47643, "Котельная");
    }


    public double getAverageSalary() {
        int sum = 0;
        for (Employee employee : employees) {
            if (employees == null)continue;
            sum += employee.getSalary();
        }
        return sum / employees.length;
    }

    public void getAllInfoAboutWorkers() {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] == null)continue;
            Employee employee = employees[i];
            System.out.println(employee);
        }
    }
    public double getMaxSalary() {
        double sum = employees[0].getSalary();
        for (int i = 0; i < employees.length; i++) {
            if (sum < employees[i].getSalary() && employees[i] != null) {
                sum = employees[i].getSalary();
            }
        }
        return sum;
    }
    public double getMinSalary() {
        double sum = employees[0].getSalary();
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getSalary() < sum && employees[i] != null) {
                sum = employees[i].getSalary();
            }
        }
        return sum;
    }
    public double getSumOfSalaries() {
        int sum = 0;
        for (int i = 0; i < employees.length; i++) {
            sum += employees[i].getSalary();
        }
        return sum;
    }
    public  void getNamesOfWorkers() {
        for (int i = 0; i < employees.length; i++) {
            Employee employee = employees[i];
            if (employees[i] == null) continue;
            System.out.println(employee.getWorker());
        }
    }
}
