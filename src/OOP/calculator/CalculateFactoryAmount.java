package OOP.calculator;

public class CalculateFactoryAmount implements ÑalculateFactory {
    @Override
    public Calculate createCalculate() {
        return new CalculateAmount();
    }
}
