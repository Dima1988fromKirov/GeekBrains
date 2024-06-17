package OOP.Seminar7_pattern.decorator;

/**
 * ConcreteComponent
 * Начальное состояние объекта (то что мы будем каждый раз расширять), в данном примере тесто для пиццы
 */
public class PizzaDough implements Pizza {
    @Override
    public int getCost() {
        return 150;
    }

    @Override
    public String getDescription() {
        return "Тесто для пиццы";
    }
}
