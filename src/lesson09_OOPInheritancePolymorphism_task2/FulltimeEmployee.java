package lesson09_OOPInheritancePolymorphism_task2;

public class FulltimeEmployee extends Employee{
    private final double monthSalary;
    private boolean isValidMonthSalary=true;
    public FulltimeEmployee(String name, long id, double monthSalary) {
        super(name, id);
        this.monthSalary=monthSalary;
        if (monthSalary<0) {
            isValidMonthSalary=false;
        }
    }

    @Override
    public double calculateMonthlyPay() {
        if (!isValidMonthSalary) return -1;
        return monthSalary;
    }

    @Override
    public String getRole() {
        return "Штатный сотрудник";
    }

    @Override
    public String toString() {
        return super.toString() + ", role=" + getRole() + ", salary=" + calculateMonthlyPay();
    }
}
