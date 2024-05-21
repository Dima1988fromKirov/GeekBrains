package OOP.Seminar3;

import OOP.Seminar3.Student;
import OOP.Seminar3.StudentGroup;
import OOP.Seminar3.StudentGroupService;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Student> list1 = new ArrayList<>();
        List<Student> list2 = new ArrayList<>();
        List<Student> list3 = new ArrayList<>();
        List<Student> list4 = new ArrayList<>();

        StudentGroup studentGroup1 = new StudentGroup(1,list1);
        studentGroup1.addStudent(new Student(5, "Карасева", "София", "Ильинична"));
        studentGroup1.addStudent(new Student(3, "Румянцева", "Полина", "Ильинична"));
        studentGroup1.addStudent(new Student(1, "Елисеева", "Полина", "Ивановна"));
        studentGroup1.addStudent(new Student(4, "Антонов", "Тимофей", "Кириллович"));

        StudentGroup studentGroup2 = new StudentGroup(2,list2);
        studentGroup2.addStudent(new Student(2, "Карасева", "София", "Ильинична"));
        studentGroup2.addStudent(new Student(3, "Румянцева", "Полина", "Ильинична"));
        studentGroup2.addStudent(new Student(1, "Елисеева", "Полина", "Ивановна"));


        StudentGroup studentGroup3 = new StudentGroup(3,list3);
        studentGroup3.addStudent(new Student(2, "Карасева", "София", "Ильинична"));
        studentGroup3.addStudent(new Student(3, "Румянцева", "Полина", "Ильинична"));
        studentGroup3.addStudent(new Student(5, "Елисеева", "Полина", "Ивановна"));
        studentGroup3.addStudent(new Student(1, "Елисеева", "Полина", "Ивановна"));
        studentGroup3.addStudent(new Student(4, "Антонов", "Тимофей", "Кириллович"));

        StudentGroup studentGroup4 = new StudentGroup(4,list4);
        studentGroup4.addStudent(new Student(2, "Карасева", "София", "Ильинична"));
        studentGroup4.addStudent(new Student(1, "Румянцева", "Полина", "Ильинична"));

        System.out.println(studentGroup1);
        System.out.println(studentGroup2);
        System.out.println(studentGroup3);
        System.out.println(studentGroup4 );











    }
}