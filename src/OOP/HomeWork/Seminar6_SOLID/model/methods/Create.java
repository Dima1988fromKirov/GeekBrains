package OOP.HomeWork.Seminar6_SOLID.model.methods;

public abstract class Create {
    private String name;

    public Create(String name) {
        this.name = name;
    }

    public abstract void create(String name);
}
