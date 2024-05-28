package OOP.HomeWork.Seminar5.service;

import OOP.HomeWork.Seminar5.model.Student;
import OOP.HomeWork.Seminar5.model.Teacher;
import OOP.HomeWork.Seminar5.model.Type;
import OOP.HomeWork.Seminar5.model.User;

import java.util.ArrayList;
import java.util.List;

public class DataService {
    private List<User> userList = new ArrayList<>();


    public int getId(Type type) {
        int id = 0;
        for (User user: userList){
            if (user instanceof Teacher && type == Type.TEACHER)
                id = ((Teacher) user).getIdTeacher();

            if (user instanceof Student && type == Type.STUDENT)
                id = ((Student) user).getIdStudent();

        }

        return ++id;
    }

    public List<User> getUserList() {
        return userList;
    }

    /**
     * Создание учителя или студента
     */
    public void create(String firstName, String secondName, String lastName, String dateBirth, Type type) {
        int id = getId(type);

        if (Type.STUDENT == type) {
            Student student = new Student(firstName, secondName, lastName, dateBirth, id);
            userList.add(student);
        }

        if (Type.TEACHER == type){
            Teacher teacher = new Teacher(firstName, secondName, lastName, dateBirth, id);
            userList.add(teacher);
        }
    }

    public List<Student> getAllStudents(){
        List<Student> students = new ArrayList<>();
        for (User user : userList){
            if (user instanceof Student){
                students.add((Student) user);
            }
        }
        return students;
    }

    public List<Teacher> getAllTeacher(){
        List<Teacher> teachers = new ArrayList<>();
        for (User user : userList){
            if (user instanceof Teacher){
                teachers.add((Teacher) user);
            }
        }
        return teachers;
    }




}
