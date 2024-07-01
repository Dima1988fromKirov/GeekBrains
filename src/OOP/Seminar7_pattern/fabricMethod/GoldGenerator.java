package OOP.Seminar7_pattern.fabricMethod;

public class GoldGenerator implements ItemGenerator {
    @Override
    public IGameItem createItem() {
        return new GoldChest();
    }
}
