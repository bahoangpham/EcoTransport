package EcoTransport.Models;

public class ElectricCar extends Vehicle{
    private double batteryCapacity; // in kWh
    private double range;   // in kilometers

    public ElectricCar(double batteryCapacity, double range, String ownerName, String vehicleType, String registrationNumber){
        super(ownerName, vehicleType, registrationNumber);
        this.batteryCapacity = batteryCapacity;
        this.range = range;

            }

    @Override
    public String toString() {
        return super.toString() + "\nIt has battery capacity " + batteryCapacity + " kWh and range " + range + " km.";
    }
}
