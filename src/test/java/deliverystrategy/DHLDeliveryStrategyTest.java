package deliverystrategy;

import flowerstore.CactusFlower;
import flowerstore.Item;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class DHLDeliveryStrategyTest {

    private DHLDeliveryStrategy dhl;
    private CactusFlower cactusFlower;
    private ArrayList<Item> items;
    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        dhl = new DHLDeliveryStrategy();
        cactusFlower = new CactusFlower();
        cactusFlower.setPrice(34.4);
        items.add(cactusFlower);
    }

    @org.junit.jupiter.api.Test
    void deliver() {
        assertTrue(dhl.deliver(items).equals("Purchase: [cactus 34.4; ] will be delivered by DHL"));
    }
}