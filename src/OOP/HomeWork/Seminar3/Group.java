package OOP.HomeWork.Seminar3;

public class Group {

    private String name;


    public Group(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return String.format("%s",name);
    }
}
