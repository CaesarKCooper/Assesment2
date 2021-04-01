public class Truck extends Vehicle implements IDriveable{

    final double TAX = .20;

    public Truck(String name, double price, int speed) {
        super(name, price);
        this.speed = speed;
    }


    public void totalAfterTax(Vehicle vehicle){

        double beforeTax = vehicle.price * TAX;
        double afterTax = vehicle.price + beforeTax;

        System.out.println(afterTax);
    }

    public int milesPerHour(){

        return getSpeed();
    }

    @Override
    public String toString() {
        return name + " : " + price;
    }
}
