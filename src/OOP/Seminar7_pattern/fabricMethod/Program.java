package OOP.Seminar7_pattern.fabricMethod;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Program {
    public static void main(String[] args) {
        List<ItemGenerator> generators = new ArrayList<>();
        generators.add(new GoldGenerator());
        generators.add(new DiamondGenerator());
        Random random = ThreadLocalRandom.current();
        for (int i = 0; i < 10; i++) {
            IGameItem item = generators.get(Math.abs(random.nextInt() % generators.size())).createItem();
            item.open();
        }
    }
}
