package OOP.Seminar7_pattern.decorator;

public class CheeseDecorator extends PizzaDecorator {
    @Override
    public int getCost() {
        return pizza.getCost() + 20;
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + " + сыр";
    }

    public CheeseDecorator(Pizza pizza) {
        super(pizza);
    }
}
