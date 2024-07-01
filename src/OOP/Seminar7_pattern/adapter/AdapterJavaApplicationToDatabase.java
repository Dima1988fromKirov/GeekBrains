package OOP.Seminar7_pattern.adapter;

public class AdapterJavaApplicationToDatabase extends JavaApplication implements Database {
    @Override
    public void insert() {
        saveObject();
    }

    @Override
    public void update() {
        updateObject();

    }

    @Override
    public void select() {
        loadObject();

    }

    @Override
    public void remove() {
        deleteObject();

    }
}
