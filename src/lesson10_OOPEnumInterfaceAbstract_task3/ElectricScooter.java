package lesson10_OOPEnumInterfaceAbstract_task3;

public class ElectricScooter extends Vehicle implements Driveable{
    private boolean checkIsRunning;
    public ElectricScooter(String model, FuelType fuelType) {
        super(model, fuelType);
        checkIsRunning=false;
    }
    @Override
    public String getVehicleType() {
        return "Электро-скутер";
    }
    @Override
    public void startEngine() {
        System.out.println("Скутер запущен");
        checkIsRunning=true;

    }
    @Override
    public void stopEngine() {
        System.out.println("Скутер остановлен");
        checkIsRunning=false;
    }
    @Override
    public boolean isRunning() {
        return checkIsRunning;
    }
}
