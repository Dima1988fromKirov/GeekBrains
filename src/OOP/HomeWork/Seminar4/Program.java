package OOP.HomeWork.Seminar4;

import java.util.ArrayList;
import java.util.List;

/**
 * � ������� ����� ������������� � ����������� ���������� ������������ �� ��������;
 * � ������� ����� ���������� � ����������� ���������� ������������ �� ��������;
 * � ������� ����� ����������������� � ����������� ����������� ��������, ��������������
 * ����������� ������� � ����������� ������ ��������, ��������� � �������.
 */
public class Program {

    public static void main(String[] args) {
        TeacherController teacherController = new TeacherController();
        teacherController.create("��������", "�������", "����������");
        teacherController.create("�������", "�����", "��������");
        teacherController.create("�������", "�������", "����������");
        teacherController.create("�������", "�����", "�����������");
        teacherController.create("������", "�������", "������������");
        teacherController.create("��������", "�����", "��������");

        teacherController.printTeachersList();

        teacherController.EditFirstName(0,"�������");
        teacherController.EditSecondName(0,"���������");

        System.out.println();

        teacherController.sort();

        System.out.println();








    }
}
