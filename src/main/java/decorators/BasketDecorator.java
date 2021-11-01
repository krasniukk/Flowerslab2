package decorators;

import flowerstore.Item;
import flowerstore.RomashkaFlower;

public class BasketDecorator extends ItemDecorator{

    public BasketDecorator(Item item) {
        this.item = item;
    }

    public double getPrice() {
        return item.getPrice() + 4;
    }

    @Override
    public String getDescription() {
        return super.getDescription();
    }

    public static void main(String[] args) {
        RomashkaFlower romashkaFlower = new RomashkaFlower();
        romashkaFlower.setPrice(34.4);
        BasketDecorator basketDecorator = new BasketDecorator(romashkaFlower);
        System.out.println(basketDecorator.getDescription());
    }
}
