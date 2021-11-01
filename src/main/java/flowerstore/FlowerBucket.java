package flowerstore;

import java.util.ArrayList;

public class FlowerBucket extends Item{
    ArrayList<Item> items = new ArrayList<Item>();

    void addFlowers(Item flower) {
        items.add(flower);
    }

    @Override
    public double getPrice() {
        int totalPrice = 0;
        for (Item item : this.items) {
            totalPrice += + item.getPrice();
        }
        return totalPrice;
    }

    @Override
    public String getDescription() {
        String descr = "";
        for (Item item : this.items) {
            descr += item.getDescription();
        }
        return "Bucket:" + descr + "; total: " + Double.toString(this.getPrice());
    }
}
