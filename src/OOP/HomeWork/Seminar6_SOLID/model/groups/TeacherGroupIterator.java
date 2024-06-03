package OOP.HomeWork.Seminar6_SOLID.model.groups;

import OOP.HomeWork.Seminar6_SOLID.model.person.Teacher;

import java.util.Iterator;
import java.util.List;

public class TeacherGroupIterator implements Iterator<Teacher> {
    private List<Teacher> teacherList;
    private int count;


    public TeacherGroupIterator(GroupTeacher groupTeacher) {
        this.teacherList = groupTeacher.getTeachersGroup();
        count = 0;
    }

    @Override
    public boolean hasNext() {
        return count < teacherList.size();
    }

    @Override
    public Teacher next() {
        if (hasNext())
            return teacherList.get(count++);
        return null;
    }

    @Override
    public void remove() {
        teacherList.remove(count);
    }
}
