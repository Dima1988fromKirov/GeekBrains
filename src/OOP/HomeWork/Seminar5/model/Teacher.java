package OOP.HomeWork.Seminar5.model;

public class Teacher extends User{
    private final int idTeacher;

    public Teacher(String firstName, String secondName, String lastName, String dateBirth, int idTeacher) {
        super(firstName, secondName, lastName, dateBirth);
        this.idTeacher = idTeacher;
    }

    public int getIdTeacher() {
        return idTeacher;
    }

    @Override
    public String toString() {
        return String.format("Учитель id# %d ", idTeacher) + super.toString();
    }
}
