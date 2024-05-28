package OOP.HomeWork.Seminar5.model;

public class Student extends User{
    private int idStudent;

    public Student(String firstName, String secondName, String lastName, String dateBirth, int idStudent) {
        super(firstName, secondName, lastName, dateBirth);
        this.idStudent = idStudent;
    }

    public int getIdStudent() {
        return idStudent;
    }

    @Override
    public String toString() {
        return String.format("Студент id# %d / ", idStudent) + super.toString();
    }
}
