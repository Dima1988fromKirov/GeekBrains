package OOP.HomeWork.Seminar6_SOLID.model.person;

public class Teacher extends Person {
    private int id;

    public Teacher(String name, int id) {
        super(name);
        this.id = id;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return String.format("Учитель № %d %s", id, super.toString());
    }
}
