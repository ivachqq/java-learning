package lesson09_OOPInheritancePolymorphism_task2;

public class PayrollDepartment {
    Employee[] employees = new Employee[1000];
    int countEmployees=0;

    public void hire(Employee employee) {
        if (employee==null) {
            System.out.println("Вы пытаетесь добавить null вместо сотрудника");
            return;
        }
        employees[countEmployees]=employee;
        countEmployees++;
    }

    public double totalPayroll() {
        double total = 0;
        for (int i = 0; i<countEmployees;i++) {
            total+=employees[i].calculateMonthlyPay();
        }
        return total;
    }

    public Employee highestPaidEmployee() {
        if (countEmployees == 0) return null;
        double max = 0;
        int index=0;
        for (int i = 0; i<countEmployees;i++) {
            if (max<employees[i].calculateMonthlyPay()) {
                max=employees[i].calculateMonthlyPay();
                index=i;
            }
        }
        return employees[index];
    }

    public void printPayrollReport() {
        for (int i = 0; i<countEmployees;i++) {
            System.out.println(employees[i].toString());
        }
    }
}
