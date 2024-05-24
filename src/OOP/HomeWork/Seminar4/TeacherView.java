package OOP.HomeWork.Seminar4;

import java.util.ArrayList;
import java.util.List;

public class TeacherView<T extends User> {
    private List<T> list;

    public void showTeachers(List<T> teachers) {
        for (T members : teachers) {
            System.out.println(members);
        }
    }
}
