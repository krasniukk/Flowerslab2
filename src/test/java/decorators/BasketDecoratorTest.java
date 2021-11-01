package decorators;

import flowerstore.RomashkaFlower;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BasketDecoratorTest {

    private RomashkaFlower romashkaFlower;
    private BasketDecorator basketDecorator;
    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        romashkaFlower = new RomashkaFlower();
        romashkaFlower.setPrice(34.4);
        basketDecorator = new BasketDecorator(romashkaFlower);
    }

    @org.junit.jupiter.api.Test
    void getPrice() {
        assertEquals(38.4, basketDecorator.getPrice());
    }


    @org.junit.jupiter.api.Test
    void getDescription() {
        assertTrue(basketDecorator.getDescription().equals("romashka 34.4"));
    }
}