package OOP.Seminar7_pattern.fabricMethod;

public class DiamondGenerator implements ItemGenerator{
    @Override
    public IGameItem createItem() {
        return new DiamondChest();
    }
}
