package Exception;

public class DataSexException extends DataException{
    private Character x;
    public DataSexException(String message) {
        super(message);
    }

    public Character getX() {
        return x;
    }

    public DataSexException(String message, Character x) {
        super(message);
        this.x = x;
    }
}
