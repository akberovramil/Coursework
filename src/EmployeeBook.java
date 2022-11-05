public class EmployeeBook {

    public static Employee[] employees;

    private EmployeeBook(Employee[] employees) {
        this.employees = employees;
    }
    EmployeeBook() {
        this.employees = new Employee[10];
        employees[0] = new Employee(("������� ������ ���������"), 66000, "��������");
        employees[1] = new Employee("������� ����� ��������", 5600, "��������");
        employees[2] = new Employee(("������ ���� �����������"), 47854, "���������");
        employees[3] = new Employee(("�������� �������� �����������"), 60600, "����������� �����");
        employees[4] = new Employee(("������ ������ ��������"), 64775, "�����������");
        employees[5] = new Employee(("������ ������� �������������"), 56789, "��������");
        employees[6] = new Employee(("������ ����� ����������"), 46987, "������");
        employees[7] = new Employee(("������ ����� ����������"), 53668, "��������");
        employees[8] = new Employee(("������ ���������� ��������"), 36000, "��������");
        employees[9] = new Employee(("�������� ������ ����������"), 47643, "���������");
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
