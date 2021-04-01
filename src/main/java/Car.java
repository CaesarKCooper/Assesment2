public class Car extends Vehicle implements IDriveable{


    public Car(String name, double price) {
        super(name, price);
    }

    public void totalAfterTax(Vehicle vehicle){


    }


    @Override
    public int milesPerHour() {
        return 0;
    }


}
