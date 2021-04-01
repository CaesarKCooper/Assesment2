import java.util.ArrayList;
import java.util.Arrays;

public class VehicleApp {


    public static void printVehicleNamesAndPrices(Vehicle[] arrayOfVehicles){
        System.out.println(Arrays.toString(arrayOfVehicles));

    }

    public static void getSpeedOFDriveableVehicles(ArrayList<IDriveable> driveable){

    }
    public static void getSpeedOfDrivableVehiclesBySpeed(ArrayList<IDriveable> driveable){


    }


    public static void main(String[] args) {

        Engine carEngine = new Engine();
        Engine truckEngine = new Engine();
        Engine bikeEngine = new Engine();

        Car car = new Car("Honda", 50.0);
        Truck truck = new Truck("GM", 100.0);
        Motorbike motorbike = new Motorbike("Suzuki", 75.0);

        Vehicle[] vehicles = {car, truck, motorbike};

        ArrayList<IDriveable> driveables = new ArrayList<>();
        driveables.add(car);
        driveables.add(truck);
        driveables.add(motorbike);

        printVehicleNamesAndPrices(vehicles);

    }




}
