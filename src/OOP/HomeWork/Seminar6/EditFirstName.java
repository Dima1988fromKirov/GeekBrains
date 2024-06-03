package OOP.HomeWork.Seminar6;
    /**
     * ����� �������������� ����� �������
     */
public class EditFirstName implements UserEditFirstName {
    @Override
    public void editFirstName(int id, String FirstName, TeacherGroup teachers) {
        boolean listNoName = true;
        for (Teacher teacher : teachers.getTeachersList()) {
            if (teacher.getTeacherId() == id) {
                teacher.setFirstName(FirstName);
                listNoName = false;
            }
        }

        if (listNoName){
            System.out.println("������ ������� ��� � ������");
        }
    }
}
