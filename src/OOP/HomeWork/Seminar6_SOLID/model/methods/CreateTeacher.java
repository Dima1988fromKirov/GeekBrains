package OOP.HomeWork.Seminar6_SOLID.model.methods;

import OOP.HomeWork.Seminar6_SOLID.model.groups.GroupTeacher;
import OOP.HomeWork.Seminar6_SOLID.model.person.Teacher;

public class CreateTeacher extends Create{
    GroupTeacher groupTeacher;

    public CreateTeacher(String name, GroupTeacher teacherGroup) {
        super(name);
        this.groupTeacher = teacherGroup;
    }

    @Override
    public void create(String name) {
        int maxId = 0;
        if (!groupTeacher.getTeachersGroup().isEmpty())
            maxId = groupTeacher.getTeachersGroup().get(groupTeacher.getTeachersGroup().size() - 1).getId() + 1;

        groupTeacher.addTeacher(new Teacher(name, maxId));
    }
}
