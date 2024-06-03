package OOP.HomeWork.Seminar6;

/**
 * Single Responsibility (������� ������������ ���������������)
 * �������� ����� create �� TeacherController � ��������� �����
 */
public class CreateTeacher implements UserCreate {




    @Override
    public Teacher create(String firstName, String secondName, String lastName,TeacherGroup teachers) {
        int maxId = 0;
        if (!teachers.getTeachersList().isEmpty())
            maxId = teachers.getTeachersList().get(teachers.getTeachersList().size() - 1).getTeacherId() + 1;

        return new Teacher(maxId, firstName, secondName, lastName);

    }


}
