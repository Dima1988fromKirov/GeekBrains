package OOP.HomeWork.Seminar6;

public class EditSecondName implements UserEditSecondName {
    @Override
    public void editSecondName(int id, String secondName, TeacherGroup teachers) {
        boolean listNoName = true;
        for (Teacher teacher : teachers.getTeachersList()) {
            if (teacher.getTeacherId() == id) {
                teacher.setSecondName(secondName);
                listNoName = false;
            }
        }

        if (listNoName){
            System.out.println("Такого учителя нет в списке");
        }

    }
}
