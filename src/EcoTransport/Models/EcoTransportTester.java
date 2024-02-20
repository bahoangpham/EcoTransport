package EcoTransport.Models;

import java.sql.SQLOutput;

public class EcoTransportTester {
    public static void main(String[] args){
        // create object of ElectricCar Subclass
        ElectricCar electricCar = new ElectricCar(50,250,"Harry","Electric Car","ABC 1234");
        System.out.println(electricCar);

        // create 2 objects of Bicycle Subclass. One of them has no gears (boolean hasGears = false)
        Bicycle bicycle1 = new Bicycle(false,2,"Peter","Bicycle","CDE 4567");
        System.out.println(bicycle1);
        Bicycle bicycle2 = new Bicycle(true,2,"Peter's sister","Bicycle","BBB 3456");
        System.out.println(bicycle2);

        ElectricScooter electricScooter = new ElectricScooter(30,28,"Nancy","Electric Scooter","XYZ 6789");
        System.out.println(electricScooter);

    }
}
