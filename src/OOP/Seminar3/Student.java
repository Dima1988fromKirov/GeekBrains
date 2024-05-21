package OOP.Seminar3;

public class Student implements Comparable<Student> {
    private int studentId;
    private String firstName;
    private String secondName;
    private String lastName;

    public Student(int studentId, String firstName, String secondName, String lastName) {
        this.studentId = studentId;
        this.firstName = firstName;
        this.secondName = secondName;
        this.lastName = lastName;
    }

    //region Геттеры и Сеттеры
    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    //endregion


    @Override
    public String toString() {
        return String.format("Студ %d %s %s %s", studentId, firstName, secondName, lastName);
    }

    @Override
    public int compareTo(Student o) {
        if (studentId > o.getStudentId())
            return 1;
        if (studentId < o.getStudentId())
            return -1;
        return 0;
    }
}
