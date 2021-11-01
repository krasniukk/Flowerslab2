package decorators;

import flowerstore.RomashkaFlower;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PaperDecoratorTest {

    private RomashkaFlower romashkaFlower;
    private PaperDecorator paperDecorator;
    @BeforeEach
    void setUp() {
        romashkaFlower = new RomashkaFlower();
        romashkaFlower.setPrice(34.4);
        paperDecorator = new PaperDecorator(romashkaFlower);
    }

    @Test
    void getPrice() {
        assertEquals(47.4, paperDecorator.getPrice());
    }

    @Test
    void getDescription() {
        assertTrue(paperDecorator.getDescription().equals("romashka 34.4"));
    }
}