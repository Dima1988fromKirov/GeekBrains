package OOP.Seminar7_pattern.observer_example2;

public interface Observer {
    /**
     * ����� �� ����������� � ������
     * @param nameCompany ��� ��������
     * @param salary ���������� �����
     */
    void receiveOffer(String nameCompany, int salary);
}
