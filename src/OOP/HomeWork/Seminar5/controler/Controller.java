package OOP.HomeWork.Seminar5.controler;

import OOP.HomeWork.Seminar5.View.GroupView;
import OOP.HomeWork.Seminar5.View.StudentView;
import OOP.HomeWork.Seminar5.model.Student;
import OOP.HomeWork.Seminar5.model.StudyGroup;
import OOP.HomeWork.Seminar5.model.Teacher;
import OOP.HomeWork.Seminar5.model.Type;
import OOP.HomeWork.Seminar5.service.DataService;
import OOP.HomeWork.Seminar5.service.StudyGroupService;

import java.util.ArrayList;
import java.util.List;

public class Controller {
    private StudentView studentView = new StudentView();

    private StudyGroupService studyGroupService = new StudyGroupService();

    public void createStudent(String firstName, String secondName, String lastName, String dateBirth) {
        studyGroupService.create(firstName, secondName, lastName, dateBirth, Type.STUDENT);
    }


    public void createStudyGroup(String firstName, String secondName, String lastName, String dateBirth) {
        studyGroupService.createStudyGroup(firstName,secondName,lastName,dateBirth);
    }

    public void printStudyGroup(){
            System.out.println(studyGroupService.getStudyGroupsService());

    }

    public void printStudents() {
        for (Student student : studyGroupService.getAllStudents()) {
            System.out.println(student);
        }

    }

    public void printTeacher() {
        for (Teacher teacher : studyGroupService.getAllTeacher()) {
            System.out.println(teacher);
        }

    }
}
