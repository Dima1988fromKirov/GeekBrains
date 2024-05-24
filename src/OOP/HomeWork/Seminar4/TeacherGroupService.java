package OOP.HomeWork.Seminar4;

import OOP.Seminar3.Student;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TeacherGroupService {
    private TeacherGroup teacherGroup;

    public TeacherGroupService(TeacherGroup teacherGroup) {
        this.teacherGroup = teacherGroup;
    }

    public void sortTeacherGroup(){
        List<Teacher> teachers = new ArrayList<>(teacherGroup.getTeachersList());
        teachers.sort(new UserComparator<Teacher>());

        for (Teacher teacher: teachers){
            System.out.println(teacher);
        }
    }
}
