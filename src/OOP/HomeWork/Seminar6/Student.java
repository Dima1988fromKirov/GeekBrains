package OOP.HomeWork.Seminar6;

public class Student extends User{
    private final int id;
    public Student(int id, String firstName, String secondName, String lastName) {
        super(firstName, secondName, lastName);
        this.id = id;
    }

    @Override
    public int compareTo(User o) {
        return super.compareTo(o);
    }


    @Override
    public String toString() {
        return String.format("Студент - %d [%s]", id, super.toString());
    }
}
