package OOP.calculator;

public class CalculateFactoryDivision implements �alculateFactory {
    @Override
    public Calculate createCalculate() {
        return new CalculateDivision();
    }
}
