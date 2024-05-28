package Exception;

public class DataNameException extends DataException{
    private String name;

    public String getName() {
        return name;
    }

    public DataNameException(String message, String name)  {
        super(message);
        this.name = name;
    }
}
