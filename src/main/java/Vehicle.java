public abstract class Vehicle extends Product {

    int qty;
    double price;
    Engine engine;
    int speed;
    final double TAX = .15;


    public Vehicle(String name, double price) {
        this.name = name;
        this.price = price;
    }


    public double totalBeforeTax(Vehicle vehicle) {
        System.out.println(vehicle.price);
        return 0;
    }

    public double calcTax(Vehicle vehicle) {

        return 0;
    }

    public abstract void totalAfterTax(Vehicle vehicle);


    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public double getTax() {
        return TAX;
    }

}




