package lesson09_OOPInheritancePolymorphism_task2;

public class Contractor extends Employee{
    private double projectFee;
    private boolean isValidProjectFee=true;
    private boolean paidThisMonth=false;
    public Contractor(String name, long id, double projectFee) {
        super(name,id);
        this.projectFee=projectFee;
        if (projectFee<0) {
            System.out.println("У сотрудника зарплата меньше 0");
            isValidProjectFee=false;
        }
    }
    public void markPaidThisMonth() {
        paidThisMonth=true;
    }
    @Override
    public double calculateMonthlyPay() {
        if (!isValidProjectFee) return -1;
        if (paidThisMonth) return projectFee;
        return 0;
    }

    @Override
    public String getRole() {
        return "Проектный сотрудник";
    }

    @Override
    public String toString() {
        return super.toString() + ", role=" + getRole() + ", salary=" + calculateMonthlyPay();
    }
}
