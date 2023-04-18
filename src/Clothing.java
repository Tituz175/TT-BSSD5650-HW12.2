public class Clothing implements IVisitable{
    private double price;

    Clothing(double item) {
        price = item;
    }

    public double accept(IVisitor visitor) {
        return visitor.visit(this);
    }

    public double getPrice() {
        return price;
    }
}
