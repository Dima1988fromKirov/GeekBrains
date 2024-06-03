package OOP.HomeWork.Seminar6_SOLID.model.groups;

import OOP.HomeWork.Seminar6_SOLID.model.person.Teacher;
import OOP.HomeWork.Seminar6_SOLID.view.ShowGroup;

import java.util.Iterator;
import java.util.List;

public class GroupTeacher implements Iterable<Teacher>, ShowGroup {
    private List<Teacher> teachersGroup;

    public GroupTeacher(List<Teacher> teachersGroup) {
        this.teachersGroup = teachersGroup;
    }

    public List<Teacher> getTeachersGroup() {
        return teachersGroup;
    }

    public void addTeacher(Teacher teacher){
        teachersGroup.add(teacher);
    }

    @Override
    public String toString() {

        return "Группа учетилей:\n" + teachersGroup ;
    }

    @Override
    public Iterator<Teacher> iterator() {
        return new TeacherGroupIterator(this);
    }

    @Override
    public void showGroup() {
        System.out.println("Группа учетилей");
        for (Teacher teacher: teachersGroup){
            System.out.println(teacher);
        }
    }
}
