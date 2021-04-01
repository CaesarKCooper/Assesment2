import jdk.swing.interop.SwingInterOpUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class VehicleApp {


    public static void main(String[] args) {

        Engine carEngine = new Engine();
        Engine truckEngine = new Engine();
        Engine bikeEngine = new Engine();

        Car car = new Car("Honda", 50, 100);
        Truck truck = new Truck("GM", 100, 75);
        Motorbike motorbike = new Motorbike("Suzuki", 75.0);

        Vehicle[] vehicles = {car, truck, motorbike};

        ArrayList<IDriveable> driveableVehicles = new ArrayList<>();
        driveableVehicles.add(car);
        driveableVehicles.add(truck);

        printVehicleNamesAndPrices(vehicles);

        System.out.println("");

        getSpeedOFDriveableVehicles(driveableVehicles);

        System.out.println("");

        car.totalBeforeTax(car);
        car.totalAfterTax(car);

        System.out.println("");

        truck.totalBeforeTax(truck);
        truck.totalAfterTax(truck);

        CompareSpeed c = new CompareSpeed();

        Collections.sort(driveableVehicles, c);

        System.out.println("");

       sortAndPrintDrivableVehiclesBySpeed(driveableVehicles);

    }

    public static void printVehicleNamesAndPrices(Vehicle[] arrayOfVehicles) {
        System.out.println(Arrays.toString(arrayOfVehicles));

    }

    public static void getSpeedOFDriveableVehicles(ArrayList<IDriveable> driveable) {


        for (IDriveable d : driveable) {

            System.out.println(d.milesPerHour());
        }

    }

    public static void sortAndPrintDrivableVehiclesBySpeed(ArrayList<IDriveable> driveable) {

        for (IDriveable d : driveable) {
            System.out.println(d);

        }


    }
}
