package OOP.HomeWork.Seminar6;

/**
 * (������� ���������� �����������) ��������� ���������� �� ����� �� ���������������, � ������ ������
 * ��������� �������� ����� create ��� ���������� � �������
 * @param <T>
 */
public interface UserCreate <T extends User>{
    Teacher create(String firstName, String secondName, String lastName,TeacherGroup teachers);
}
