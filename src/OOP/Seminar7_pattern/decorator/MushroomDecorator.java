package OOP.Seminar7_pattern.decorator;

public class MushroomDecorator extends PizzaDecorator{

    public MushroomDecorator(Pizza pizza) {
        super(pizza);
    }

    @Override
    public int getCost() {
        return pizza.getCost() + 35;
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + " + грибы";
    }
}
