package OOP.Seminar3;

import java.util.Iterator;
import java.util.List;

public class StudentGroup implements Iterable<Student> {
    private List<Student> studentList;
    private int numberGroup;
    private static int count;

    {
        count++;
    }

    public int numberStudentGroup(List<Student> studentList) {
        return studentList.size();
    }

    public StudentGroup(List<Student> studentList) {
        this.studentList = studentList;
    }

    public StudentGroup(int numberGroup, List<Student> studentList) {
        this.studentList = studentList;
        this.numberGroup = numberGroup;
    }

    public List<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(List<Student> studentList) {
        this.studentList = studentList;
    }


    public void addStudent(Student student) {
        studentList.add(student);
    }

    @Override
    public Iterator<Student> iterator() {
        return new StudentGroupIterator(this);
    }

    @Override
    public String toString() {
        return String.format("Группа № %d  Количество студентов %d", numberGroup,  numberStudentGroup(studentList));
    }
}
