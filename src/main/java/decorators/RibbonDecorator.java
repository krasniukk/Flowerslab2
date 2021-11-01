package decorators;

import flowerstore.Item;

public class RibbonDecorator extends ItemDecorator{
    private Item item;


    public RibbonDecorator(Item item) {
        this.item = item;
    }

    public double getPrice() {
        return item.getPrice() + 40;
    }

    @Override
    public String getDescription() {
        return super.getDescription();
    }

}
