package decorators;

import flowerstore.RomashkaFlower;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RibbonDecoratorTest {

    private RomashkaFlower romashkaFlower;
    private RibbonDecorator ribbonDecorator;
    @BeforeEach
    void setUp() {
        romashkaFlower = new RomashkaFlower();
        romashkaFlower.setPrice(34.4);
        ribbonDecorator = new RibbonDecorator(romashkaFlower);
    }

    @Test
    void getPrice() {
        assertEquals(74.4, ribbonDecorator.getPrice());
    }

    @Test
    void getDescription() {
        assertTrue(ribbonDecorator.getDescription().equals("romashka 34.4"));
    }
}