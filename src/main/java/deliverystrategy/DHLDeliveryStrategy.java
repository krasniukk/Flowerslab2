package deliverystrategy;

import flowerstore.CactusFlower;
import flowerstore.Item;

import java.util.ArrayList;

public class DHLDeliveryStrategy extends Delivery{
    @Override
    public String deliver(ArrayList<Item> items) {
        System.out.println(this.getParselDescription(items) + "will be delivered by DHL");
        return this.getParselDescription(items) + "will be delivered by DHL";
    }

    public static void main(String[] args) {
        DHLDeliveryStrategy dhl;
        CactusFlower cactusFlower;
        ArrayList<Item> items1 = new ArrayList<Item>();
        dhl = new DHLDeliveryStrategy();
        cactusFlower = new CactusFlower();
        cactusFlower.setPrice(34.4);
        items1.add(cactusFlower);
        System.out.println(dhl.deliver(items1));
    }
}
