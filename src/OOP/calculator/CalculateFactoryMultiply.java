package OOP.calculator;

public class CalculateFactoryMultiply implements ÑalculateFactory{
    @Override
    public Calculate createCalculate() {
        return new CalculateMultiply();
    }
}
