package OOP.calculator;

public class Operation {
    public int perform(String action, int number1, int number2) {
        int result = 0;


        switch (action) {
            case "*":
                �alculateFactory multiply = new CalculateFactoryMultiply();
                result = multiply.createCalculate().calculations(number1,number2);
                break;
            case "+":
                �alculateFactory amount = new CalculateFactoryAmount();
                result = amount.createCalculate().calculations(number1,number2);
                break;
            case "/":
                �alculateFactory division = new CalculateFactoryDivision();
                result = division.createCalculate().calculations(number1,number2);
                break;
            default:
                System.out.println("��� �� ����� �� ���");
        }

        return result;
    }
}
