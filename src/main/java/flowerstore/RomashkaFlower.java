package flowerstore;

public class RomashkaFlower extends Item{

    @Override
    public String getDescription() {
        return "romashka " + Double.toString(price);
    }

}
