package Exception;

public class DataLastNameException extends DataException{
    private String name;

    public DataLastNameException(String message, String name) {
        super(message);
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
