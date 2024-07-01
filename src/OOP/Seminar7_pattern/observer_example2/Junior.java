package OOP.Seminar7_pattern.observer_example2;

import java.util.Random;

public class Junior implements Observer{
    String name;

    public Junior(String name) {
        this.name = name;
    }

    @Override
    public void receiveOffer(String nameCompany, int salary) {
        if (new Random().nextBoolean()){
            System.out.println(String.format("������� %s: ��� ����� ��� ������! (��������, ��������) = %s, %d%n", name, nameCompany, salary));
        }
        else{
            System.out.println(String.format("������� %s: � ���� ���� ������ �������! (��������, ��������) = %s, %d%n", name, nameCompany, salary));
        }
    }
}
