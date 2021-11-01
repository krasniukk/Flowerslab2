package decorators;

import flowerstore.Item;

public class PaperDecorator extends ItemDecorator{

    public PaperDecorator(Item item) {
        this.item = item;
    }

    public double getPrice() {
        return item.getPrice() + 13;
    }

    @Override
    public String getDescription() {
        return super.getDescription();
    }
}
