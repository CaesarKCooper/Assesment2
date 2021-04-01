public class Motorbike extends Vehicle{


    public Motorbike(String name, double price) {
        super(name, price);
    }

    @Override
    public void totalAfterTax(Vehicle vehicle) {

    }


    @Override
    public String toString() {
        return name + " : " + price;
    }
}
