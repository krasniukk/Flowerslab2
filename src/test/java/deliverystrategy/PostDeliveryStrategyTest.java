package deliverystrategy;

import flowerstore.CactusFlower;
import flowerstore.Item;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class PostDeliveryStrategyTest {


    private PostDeliveryStrategy post;
    private CactusFlower cactusFlower;
    private ArrayList<Item> items;

    @BeforeEach
    void setUp() {
        post = new PostDeliveryStrategy();
        cactusFlower = new CactusFlower();
        cactusFlower.setPrice(34.4);
        items.add(cactusFlower);
    }

    @Test
    void deliver() {
        assertTrue(post.deliver(items).equals("Purchase: [cactus 34.4; ] will be delivered by post"));
    }
}