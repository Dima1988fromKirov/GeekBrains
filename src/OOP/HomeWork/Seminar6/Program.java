package OOP.HomeWork.Seminar6;

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
        teacherController.create("1","2","3");
        teacherController.create("1e","2e","3e");
        teacherController.create("1rr","2rr","3rr");
        teacherController.editFirstName(2,"�������");
        teacherController.editSecondName(2,"�������2");
        teacherController.printTeachersList();



//        teacherController.printTeachersList();
//
//        teacherController.EditFirstName(0,"�������");
//        teacherController.EditSecondName(0,"���������");
//
//        System.out.println();
//
//        teacherController.sort();

        System.out.println();








    }
}
