package OOP.calculator;

public class CalculateFactoryMultiply implements �alculateFactory{
    @Override
    public Calculate createCalculate() {
        return new CalculateMultiply();
    }
}
