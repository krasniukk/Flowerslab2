package flowerstore;

public abstract class Item {

    public double price;

    public double getPrice() {
        return this.price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public abstract String getDescription();

    @Override
    public String toString() {
        return this.getDescription();
    }
}
