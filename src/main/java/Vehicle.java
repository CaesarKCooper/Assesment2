public abstract class Vehicle extends Product {

    int qty;
    double price;
    Engine engine;
    int speed;
    final double tax = .15;


    public Vehicle(String name, double price) {
        this.name = name;
        this.price = price;
    }


    public double totalBeforeTax(Vehicle vehicle) {

        return 0;
    }

    public double calcTax(Vehicle vehicle) {

        return 0;
    }

    public abstract void totalAfterTax(Vehicle vehicle);
}


