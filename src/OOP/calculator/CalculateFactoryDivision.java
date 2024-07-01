package OOP.calculator;

public class CalculateFactoryDivision implements ÑalculateFactory {
    @Override
    public Calculate createCalculate() {
        return new CalculateDivision();
    }
}
