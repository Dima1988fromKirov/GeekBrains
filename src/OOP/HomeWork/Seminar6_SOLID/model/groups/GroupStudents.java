package OOP.HomeWork.Seminar6_SOLID.model.groups;

import OOP.HomeWork.Seminar6_SOLID.model.methods.Sort;
import OOP.HomeWork.Seminar6_SOLID.model.person.Student;
import OOP.HomeWork.Seminar6_SOLID.view.ShowGroup;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class GroupStudents implements Iterable<Student>, ShowGroup, Sort {
    private List<Student> studentsGroup ;


    public GroupStudents(List<Student> studentsGroup) {
        this.studentsGroup = studentsGroup;

    }

    public List<Student> getStudentsGroup() {
        return studentsGroup;
    }

    public void addStudent(Student student){
        studentsGroup.add(student);
    }

    @Override
    public Iterator<Student> iterator() {
        return new StudentGroupIterator(this);
    }

    @Override
    public String toString() {

        return "Группа студентов:\n" + studentsGroup ;
    }

    @Override
    public void showGroup() {
        System.out.println("Группа студентов");
        for (Student student: studentsGroup){
            System.out.println(student);
        }
    }

    @Override
    public void sort() {
        Collections.sort(studentsGroup);
    }
}
