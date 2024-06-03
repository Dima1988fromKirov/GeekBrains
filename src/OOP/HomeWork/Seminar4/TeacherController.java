package OOP.HomeWork.Seminar4;

import java.util.ArrayList;
import java.util.List;

public class TeacherController implements UserController<User> {

    TeacherView<Teacher> teacherView = new TeacherView<Teacher>();

    TeacherGroup teachers = new TeacherGroup(new ArrayList<>());


    /**
     * �������� ������ �������
     */
    @Override
    public void create(String FirstName, String SecondName, String LastName) {
        int maxId = 0;
        if (!teachers.getTeachersList().isEmpty())
            maxId = teachers.getTeachersList().get(teachers.getTeachersList().size() - 1).getTeacherId() + 1;

        Teacher teacher = new Teacher(maxId, FirstName, SecondName, LastName);

        teachers.addTeacher(teacher);

    }

    /**
     * �������������� �������  ������� �� id
     */
    public void EditFirstName(int id, String FirstName) {
        for (Teacher teacher : teachers.getTeachersList()) {
            if (teacher.getTeacherId() == id) {
                teacher.setFirstName(FirstName);
                break;
            } else {
                System.out.println("������ ������� ���");
            }
        }
    }

    public void EditSecondName(int id, String SecondName) {
        for (Teacher teacher : teachers.getTeachersList()) {
            if (teacher.getTeacherId() == id) {
                teacher.setSecondName(SecondName);
                break;
            } else {
                System.out.println("������ ������� ���");

            }
        }
    }

    /**
     * ����� ������ ��������
     */
    void printTeachersList() {
        teacherView.showTeachers(teachers.getTeachersList());
    }

    /**
     * ����������
     */

    public void sort() {
        TeacherGroupService teacherGroupService = new TeacherGroupService(teachers);
        teacherGroupService.sortTeacherGroup();
    }
}
