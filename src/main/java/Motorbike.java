public class Motorbike extends Vehicle implements IDriveable{

    public Motorbike(String name, double price) {
        super(name, price);
    }

    @Override
    public void totalAfterTax(Vehicle vehicle) {

    }

    @Override
    public int milesPerHour() {
        return 0;
    }
}
