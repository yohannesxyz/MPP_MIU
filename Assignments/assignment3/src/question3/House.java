package question3;


public class House extends Property {
    private double lotSize;

    public House(Address address, double lotSize) {
        super(address);
        this.lotSize = lotSize;
    }

    @Override
    public double computeRent() {
        return 0.1 * lotSize;
    }
}
