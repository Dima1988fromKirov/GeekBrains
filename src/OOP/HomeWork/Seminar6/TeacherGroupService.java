package OOP.HomeWork.Seminar6;

import java.util.ArrayList;
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
