package Exception;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

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
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("���� ������ - 1\n���������� ������ - 0");
            int menu = scanner.nextInt();

            switch (menu) {
                case 1 -> {
                    program();
                    System.out.println("������ ������� ���������");
                }
                case 0 -> {
                    System.out.println("���������� ������");
                    return;

                }
            }


        }
    }

    static void program() {
        try {
            task();
        } catch (DataNameException e) {
            System.out.printf("����������: ���  �� ������ ���� ����� ��� ������ 3� �������� � � ��� [%s]", e.getName());
        } catch (DataSecondNameException e) {
            System.out.printf("����������: ������� �� ������ ���� ����� ��� ������ 3� �������� � � ��� [%s]", e.getName());
        } catch (DataLastNameException e) {
            System.out.printf("����������: �������� �� ������ ���� ����� ��� ������ 3� �������� � � ��� [%s]", e.getName());
        } catch (DataCharException e) {
            System.out.println("����������: ��� ������ ��������� ������ ��������� �����");
        } catch (ParseException e) {
            System.out.println("����������: ������� ������� ����");
        } catch (NumberFormatException e) {
            System.out.println("����������: �������� ����� ��������");
        } catch (DataGenderException e) {
            System.out.println("����������: ������� ������ ���");
        } catch (IndexOutOfBoundsException e) {
            System.out.println("����������: ��������� �� ��� ����");
        } catch (DataExtraException e) {
            System.out.println("������������ ������ ������");
        }
    }



    static void task() throws DataNameException, DataSecondNameException, DataLastNameException,
            DataCharException, ParseException, NumberFormatException, DataGenderException, DataExtraException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("������� �������");
        String s = scanner.nextLine();

        String[] str = s.split(" ");
        String[] invalid = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "0", "/", "*", "-", "+", "<", ">", "?", "|", "[", "]"};
        SimpleDateFormat format = new SimpleDateFormat("dd.MM.yyyy");


        String firstName = str[1];
        String secondName = str[0];
        String lastName = str[2];
        Date date = format.parse(str[3]);
        Long number = Long.parseLong(str[4]);
        Character gender = str[5].charAt(0);


        if (firstName == null || firstName.length() < 3)
            throw new DataNameException("����������� ���", firstName);
        if (secondName == null || secondName.length() < 3)
            throw new DataSecondNameException("����������� �������", secondName);
        if (lastName == null || lastName.length() < 3)
            throw new DataSecondNameException("����������� ��������", lastName);
        for (String st : invalid) {
            if (secondName.contains(st) || firstName.contains(st) || lastName.contains(st))
                throw new DataCharException("������������ ������� � ���");
        }
        if (!str[5].equals("m") && !str[5].equals("f"))
            throw new DataGenderException("������������ ������� � ���");

        if (str.length > 6)
            throw new DataExtraException("���� ������ ������");

        try (FileWriter writer = new FileWriter(secondName + ".txt", true)) {
            writer.write("<���> " + secondName + " ");
            writer.write(firstName + " ");
            writer.write(lastName + " ");
            writer.write("<���� ��������> " + date);
            writer.write(" <����� ��������> " + number + " ");
            writer.write("<���> " + gender + "\n");
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }


    }
}


