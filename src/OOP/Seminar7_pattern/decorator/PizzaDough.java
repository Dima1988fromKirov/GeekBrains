package OOP.Seminar7_pattern.decorator;

/**
 * ConcreteComponent
 * ��������� ��������� ������� (�� ��� �� ����� ������ ��� ���������), � ������ ������� ����� ��� �����
 */
public class PizzaDough implements Pizza {
    @Override
    public int getCost() {
        return 150;
    }

    @Override
    public String getDescription() {
        return "����� ��� �����";
    }
}
