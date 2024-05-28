package OOP.HomeWork.Seminar5.model;

import OOP.HomeWork.Seminar5.service.DataService;

import java.util.List;

public class StudyGroup {
    private Teacher teacher;
    private List<Student> students;
    private int id;


    public Teacher getTeacher() {
        return teacher;
    }

    public List<Student> getStudents() {
        return students;
    }

    public int getId() {
        return id;
    }

    public StudyGroup(Teacher teacher, List<Student> students) {
        this.teacher = teacher;
        this.students = students;
        id++;
    }





    @Override
    public String toString() {
        return String.format("Учебная группа %d\nПроводит обучение с преподавателем: %s\nСписок студентов: %s",getId(),getTeacher(),getStudents());
    }
}
