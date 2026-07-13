package lesson09_OOPInheritancePolymorphism_task2;

abstract public class Employee {
    private final String name;
    private final long id;
    abstract double calculateMonthlyPay();
    abstract String getRole();
    public Employee(String name, long id) {
        this.name=name;
        this.id=id;
    }
    @Override
    public String toString() {
        return "id=" + id + ", name=" + name;
    }

}
