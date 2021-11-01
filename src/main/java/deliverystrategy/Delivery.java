package deliverystrategy;

import flowerstore.Item;

import java.util.ArrayList;

public abstract class Delivery {
    public String getParselDescription(ArrayList<Item> items) {
        String parsel = "Purchase: [";
        for (Item item : items) {
            parsel += item.toString() + "; ";
        }
        return parsel + "] ";
    }

    public abstract String deliver(ArrayList<Item> items);
}
