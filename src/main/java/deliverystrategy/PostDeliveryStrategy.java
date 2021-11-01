package deliverystrategy;

import flowerstore.Item;

import java.util.ArrayList;

public class PostDeliveryStrategy extends Delivery{
    @Override
    public String deliver(ArrayList<Item> items) {
        System.out.println(this.getParselDescription(items) + "will be delivered by post");
        return this.getParselDescription(items) + "will be delivered by post";
    }
}
