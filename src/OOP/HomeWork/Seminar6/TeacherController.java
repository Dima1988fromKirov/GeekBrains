package OOP.HomeWork.Seminar6;

import java.util.ArrayList;

public class TeacherController  {

    TeacherView<Teacher> teacherView = new TeacherView<Teacher>();
    TeacherGroup teachers = new TeacherGroup(new ArrayList<>());


    CreateTeacher create = new CreateTeacher();
    //UserCreate createStudent = new CreateStudent();

    EditFirstName editFirstName = new EditFirstName();
    EditSecondName editSecondName = new EditSecondName();




    /**
     * Создание нового учителя
     */

    public void create(String firstName, String secondName, String lastName) {
        teachers.addTeacher(create.create(firstName, secondName, lastName, teachers));
    }

    public void editFirstName(int id, String firstName) {
        editFirstName.editFirstName(id, firstName, teachers);
    }

    public void editSecondName(int id, String secondName) {
        editSecondName.editSecondName(id,secondName, teachers);
    }


    /**
     * Вывод списка учетилей
     */
    void printTeachersList() {
        teacherView.showTeachers(teachers.getTeachersList());
    }

//    /**
//     * Сортировка
//     */
//
//    public void sort() {
//        TeacherGroupService teacherGroupService = new TeacherGroupService(teachers);
//        teacherGroupService.sortTeacherGroup();
//    }
}
