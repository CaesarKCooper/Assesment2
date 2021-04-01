public class Car extends Vehicle implements IDriveable{


    public Car(String name, double price, int speed) {
        super(name, price);
        this.speed = speed;
    }

    public void totalAfterTax(Vehicle vehicle){

        double beforeTax = vehicle.price * TAX;
        double afterTax = vehicle.price + beforeTax;

        System.out.println(afterTax);

    }


    @Override
    public int milesPerHour() {

        return getSpeed();

    }

    @Override
    public String toString() {
        return name + " : " + price;
    }
}

