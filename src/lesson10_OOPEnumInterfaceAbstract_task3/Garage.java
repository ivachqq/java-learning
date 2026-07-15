package lesson10_OOPEnumInterfaceAbstract_task3;

public class Garage {
    Vehicle[] garage = new Vehicle[10];
    private static int counter = 0;
    public void add(Vehicle vehicle) {
        if (vehicle==null) {
            System.out.println("Вы пытаетесь добавить null сущность, мы не можем этого сделать!");
            return;
        }
        if (counter<garage.length) {
            garage[counter]=vehicle;
            counter++;
        }
        else System.out.println("Гараж переполнен, мы не можем добавить новый транспорт!");
    }

    public void startAll() {
        for (int i = 0; i<counter;i++) {
            Driveable vehicle = (Driveable)garage[i];
            vehicle.startEngine();
        }
    }
    public void stopAll() {
        for (int i = 0; i<counter;i++) {
            Driveable vehicle = (Driveable)garage[i];
            vehicle.stopEngine();
        }
    }
    public void printReport() {
        for (int i = 0; i<counter;i++) {
            System.out.println(garage[i].toString());
        }
    }
}
