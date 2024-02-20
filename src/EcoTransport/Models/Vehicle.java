package EcoTransport.Models;

public class Vehicle {
    private String ownerName;
    private String vehicleType;
    private String registrationNumber;

    public Vehicle(String ownerName, String vehicleType, String registrationNumber){
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
        this.registrationNumber = registrationNumber;
    }

    public String getOwnerName(){
        return ownerName;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setOwnerName(String ownerName){
        this.ownerName = ownerName;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public String toString(){
        return getOwnerName() + " owns the vehicle_" + getVehicleType() + " and the registration number_: " + getRegistrationNumber();
    }
}
