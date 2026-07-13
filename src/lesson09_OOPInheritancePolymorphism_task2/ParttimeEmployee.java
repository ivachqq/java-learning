package lesson09_OOPInheritancePolymorphism_task2;

public class ParttimeEmployee extends Employee{
    private double hourlyRate;
    private double hoursWorked;
    private boolean isValidHoursWorked=true;
    public ParttimeEmployee(String name, long id, double hourlyRate, double hoursWorked) {
        super(name,id);
        this.hourlyRate=hourlyRate;
        this.hoursWorked=hoursWorked;
        if (hoursWorked<0 || hoursWorked>200 || hourlyRate<0) {
            System.out.println("Неправильный ввод данных о работнике");
            isValidHoursWorked=false;
        }
    }
    public void setHourlyRate(double newHourlyRate) {
        if (newHourlyRate>0) hourlyRate=newHourlyRate;
        else System.out.println("Вы пытаетесь ввести отрицательную ставку сотрудника");
    }
    public void setHoursWorked(double newHoursWorked) {
        if (newHoursWorked>0) hoursWorked=newHoursWorked;
        else System.out.println("Вы пытаетесь ввести отрицательные часы работы человека");
    }
    @Override
    public double calculateMonthlyPay() {
        if (!isValidHoursWorked) return -1;
        return hoursWorked*hourlyRate;
    }

    @Override
    public String getRole() {
        return "Почасовой сотрудник";
    }

    @Override
    public String toString() {
        return super.toString() + ", role=" + getRole() + ", salary=" + calculateMonthlyPay();
    }
}
