package lesson10_OOPEnumInterfaceAbstract_task3;

public class Main {
    public static void main(String[] args) {
        Garage garage = new Garage();

        Car car1 = new Car("Camry", FuelType.GASOLINE);
        Car car2 = new Car("BMW X5", FuelType.DIESEL);
        ElectricScooter scooter = new ElectricScooter("Ninebot", FuelType.ELECTRIC);

        System.out.println("=== Добавление в гараж ===");
        garage.add(car1);
        garage.add(car2);
        garage.add(scooter);
        garage.add(null); // не должен добавиться

        System.out.println("\n=== Отчёт до старта ===");
        garage.printReport();

        System.out.println("\n=== Попытка ехать без старта ===");
        car1.drive(10);
        System.out.println("car1 after drive without start: " + car1);
        System.out.println("car1 isRunning: " + car1.isRunning());

        System.out.println("\n=== startAll ===");
        garage.startAll();
        System.out.println("car1 isRunning: " + car1.isRunning());
        System.out.println("scooter isRunning: " + scooter.isRunning());

        System.out.println("\n=== drive после старта ===");
        car1.drive(50);
        car2.drive(120.5);
        scooter.drive(15);
        car1.drive(-10); // невалидный км, пробег не должен вырасти

        System.out.println("\n=== Отчёт после поездок ===");
        garage.printReport();

        System.out.println("\n=== stopAll ===");
        garage.stopAll();
        System.out.println("car1 isRunning: " + car1.isRunning());
        System.out.println("car2 isRunning: " + car2.isRunning());
        System.out.println("scooter isRunning: " + scooter.isRunning());

        System.out.println("\n=== Отчёт после остановки ===");
        garage.printReport();
    }
}
