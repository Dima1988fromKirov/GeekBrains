package Exception;

import java.util.Arrays;

/**
 * �������� ����������,
 * ������� ����� ����������� � ������������ ��������� ������ � ������������ �������,
 * ����������� ��������:
 * <p>
 * input:
 * String (������� / ��� / �������� )
 * date - dd.mm.yyyy (������������)
 * ����� ����������� ����� ��� �������������� - (�������������)
 * ������ ��������� f ��� m. - (���)
 * <p>
 * ���������� ������ ��������� ��������� ������ �� ����������.
 * ���� ���������� �� ��������� � ���������, ������� ��� ������,
 * ���������� ��� � �������� ������������ ���������, ��� �� ���� ������ � ������ ������, ��� ���������.
 * <p>
 * ���������� ������ ���������� ���������� ���������� �������� � �������� �� ��� ��������� ���������.
 * ���� ������� ������ �� ���������, ����� ������� ����������, ��������������� ���� ��������.
 * ����� ������������ ���������� ���� java � ������� ����.
 * ���������� ������ ���� ��������� ����������, ������������ �������� ��������� � �����������, ��� ������ �������.
 * <p>
 * ���� �� ������� � ���������� �����, ������ ��������� ���� � ���������, ������ �������,
 * � ���� � ���� ������ ������ ���������� ���������� ������, ����
 * <p>
 * <�������> <���> <��������> <������������> <�������������><���>
 * <p>
 * - ������������ ������ ���������� � ���� � ��� �� ����, � ��������� ������.
 * <p>
 * - �� �������� ������� ���������� � ������.
 * <p>
 * ��� ������������� �������� � �������-������� � ����,
 * ���������� ������ ���� ��������� ����������, ������������ ������ ������� ��������� ������.
 */
public class Program {
    public static void main(String[] args) {
        String fio = "�������� ����6��� ����������";
        try {
            task(fio);
        } catch (DataNameException e) {
            System.out.printf("����������: ���  �� ������ ���� ����� ��� ������ 3� �������� � � ��� [%s]", e.getName());
        } catch (DataSecondNameException e) {
            System.out.printf("����������: ������� �� ������ ���� ����� ��� ������ 3� �������� � � ��� [%s]", e.getName());
        } catch (DataLastNameException e) {
            System.out.printf("����������: �������� �� ������ ���� ����� ��� ������ 3� �������� � � ��� [%s]", e.getName());
        } catch (DataCharException e) {
            System.out.println("����������: ��� ������ ��������� ������ ��������� �����");
        }


    }

    static void task(String s) throws DataNameException, DataSecondNameException, DataLastNameException, DataCharException {
        String[] str = s.split(" ");
        String[] invalid = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "0", "/", "*", "-", "+", "<", ">", "?", "|", "[", "]"};


        String firstName = str[1];
        String secondName = str[0];
        String lastName = str[2];


        if (firstName == null || firstName.length() < 3)
            throw new DataNameException("����������� ���", firstName);
        if (secondName == null || secondName.length() < 3)
            throw new DataSecondNameException("����������� �������", secondName);
        if (lastName == null || lastName.length() < 3)
            throw new DataSecondNameException("����������� ��������", lastName);
        for (String st : invalid) {
            if (secondName.contains(st) || firstName.contains(st) || lastName.contains(st))
                throw new DataCharException("������������ �������");
        }

        System.out.printf("��� - %s\n������� - %s\n�������� - %s", str[0], str[1], str[2]);

    }
}


