package OOP.Seminar7_pattern.decorator;

public class ProgramTest {
    public static void main(String[] args) {

        Pizza mix = new CheeseDecorator(new MushroomDecorator(new PizzaDough()));
        showPizza(mix);
    }

    static void showPizza(Pizza pizza){
        System.out.println(pizza.getDescription());
        System.out.println(pizza.getCost());
    }

}
