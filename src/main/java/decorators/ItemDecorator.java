package decorators;

import flowerstore.Item;

public abstract class ItemDecorator extends Item {
    Item item;

    @Override
    public String getDescription() {
        return item.getDescription();
    }
}
