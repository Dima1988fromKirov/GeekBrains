package OOP.HomeWork.Seminar6_SOLID.model.methods;

import OOP.HomeWork.Seminar6_SOLID.model.groups.GroupStudents;
import OOP.HomeWork.Seminar6_SOLID.model.person.Student;

public class CreateStudent extends Create{
    GroupStudents groupStudents;

    public CreateStudent(String name, GroupStudents groupStudents) {
        super(name);
        this.groupStudents = groupStudents;
    }

    @Override
    public void create(String name) {
        int maxId = 0;
        if (!groupStudents.getStudentsGroup().isEmpty())
            maxId = groupStudents.getStudentsGroup().get(groupStudents.getStudentsGroup().size() - 1).getId() + 1;

        groupStudents.addStudent(new Student(name, maxId));
    }
}
