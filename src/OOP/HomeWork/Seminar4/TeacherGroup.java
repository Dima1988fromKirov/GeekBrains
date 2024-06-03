package OOP.HomeWork.Seminar4;

import java.util.List;

public class TeacherGroup {
    private List<Teacher> teachers;

    public TeacherGroup(List<Teacher> teachers) {
        this.teachers = teachers;
    }

    public List<Teacher> getTeachersList() {
        return teachers;
    }

    public void addTeacher(Teacher teacher){
        teachers.add(teacher);
    }
}
