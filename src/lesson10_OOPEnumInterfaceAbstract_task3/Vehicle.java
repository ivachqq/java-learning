package lesson10_OOPEnumInterfaceAbstract_task3;

abstract public class Vehicle {
    protected final String model;
    protected final FuelType fuelType;
    protected double mileage=0;
    public Vehicle(String model, FuelType fuelType) {
        this.model=model;
        this.fuelType=fuelType;
    }
    public void drive(double km) {
        if (km>0) mileage+=km;
    }
    @Override
    public String toString() {
        return "type: " + getVehicleType() + ", model: " + model + ", fuel: " + fuelType + ", mileage: " + mileage;
    }
    abstract public String getVehicleType();

}
