package Exception;

public class DataSecondNameException extends DataException{
    private String name;

    public DataSecondNameException(String message, String name) {
        super(message);
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
