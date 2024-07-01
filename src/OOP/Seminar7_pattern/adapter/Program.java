package OOP.Seminar7_pattern.adapter;

public class Program {
    public static void main(String[] args) {
        Database database = new AdapterJavaApplicationToDatabase();

        database.insert();
        database.remove();
        database.update();
        database.select();
    }
}
