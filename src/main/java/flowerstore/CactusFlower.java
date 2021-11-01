package flowerstore;

import flowerstore.Item;

public class CactusFlower extends Item {

    @Override
    public String getDescription() {
        return "cactus " + Double.toString(this.price);
    }
}
