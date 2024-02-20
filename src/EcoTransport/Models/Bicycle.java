package EcoTransport.Models;

public class Bicycle extends Vehicle{
    private boolean hasGears;
    private int gearCount;

    public Bicycle(boolean hasGears, int gearCount, String ownerName, String vehicleType, String registrationNumber){
        super(ownerName, vehicleType, registrationNumber);
        this.hasGears = hasGears;
        this.gearCount = gearCount;
    }

    @Override
    public String toString(){
        // in case a bicycle doest not have gears
        if(!hasGears){
            gearCount = 0;
        }
        return super.toString() + "\nIt has gear?_ " + hasGears + " and has " + gearCount + " gear";
    }
}
