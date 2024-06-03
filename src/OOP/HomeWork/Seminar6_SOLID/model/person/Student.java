package OOP.HomeWork.Seminar6_SOLID.model.person;

public class Student extends Person implements Comparable<Student> {
    private int id;

    public Student(String name, int id) {
        super(name);
        this.id = id;
    }

    @Override
    public String toString() {
        return String.format("Студент № %d %s", id, super.toString());
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public int compareTo(Student o) {
          return this.getName().compareTo(o.getName());
    }
}
