package lesson10_OOPEnumInterfaceAbstract_task3;

public class Car extends Vehicle implements Driveable{
    private boolean checkIsRunning;
    public Car(String model, FuelType fuelType) {
        super(model, fuelType);
        checkIsRunning=false;
    }
    @Override
    public String getVehicleType() {
        return "Машина";
    }
    @Override
    public void startEngine() {
        System.out.println("Двигатель машины запущен");
        checkIsRunning=true;

    }
    @Override
    public void stopEngine() {
        System.out.println("Двигатель машины остановлен");
        checkIsRunning=false;
    }
    @Override
    public boolean isRunning() {
        return checkIsRunning;
    }
}
