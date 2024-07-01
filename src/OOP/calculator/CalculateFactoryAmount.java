package OOP.calculator;

public class CalculateFactoryAmount implements �alculateFactory {
    @Override
    public Calculate createCalculate() {
        return new CalculateAmount();
    }
}
