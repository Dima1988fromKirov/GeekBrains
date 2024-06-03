package Test.LSP;

/**
 * ������ ���������� ������� ��� ������� �������� ����� �������� (��� ��������������� ������� ��������, �� �� ������ ������ �����
 * ���� �������)
 * � ������ ������� � ��� ������� ������� ������� ��������� �� ���� ������ �� ���������
 */
public class Program {
    public static void main(String[] args) {
        Quadrangle quadrangle1 = new Rectangle(5,3);
        System.out.println(quadrangle1.are());

        Quadrangle quadrangle2 = new Square(9);
        System.out.println(quadrangle2.are());

        printArea(quadrangle1);
    }

    /**
     * � ����� ����� ���������� ��� ������� ��� � �������������, ��� ��� ��� � ��� ���������� ����� ����������� �������
     */
    static void printArea(Quadrangle quadrangle){
        System.out.println(quadrangle.are());
    }
}
