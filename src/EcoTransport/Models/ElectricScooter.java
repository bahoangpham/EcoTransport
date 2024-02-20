package EcoTransport.Models;

public class ElectricScooter extends Vehicle{
    private double maxSpeed; // in km/h
    private double weightCapacity; // in kg

    public ElectricScooter(double maxSpeed, double weightCapacity, String ownerName, String vehicleType, String registrationNumber){
        super(ownerName, vehicleType, registrationNumber);
        this.maxSpeed = maxSpeed;
        this.weightCapacity = weightCapacity;
    }

    @Override
    public String toString(){
        return super.toString() + "\nIt has max speed " + maxSpeed + " km/h and weight capacity " + weightCapacity + " kg.";
    }
}
