package OOP.HomeWork.Seminar5.model;

public abstract class User {
    private String firstName;
    private String secondName;
    private String lastName;
    private String dateBirth;

    public User(String firstName, String secondName, String lastName, String dateBirth) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.lastName = lastName;
        this.dateBirth = dateBirth;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getDateBirth() {
        return dateBirth;
    }

    @Override
    public String toString() {
        return String.format("ФИО [%s %s %s] Дата рождения - %s",secondName, firstName ,lastName, dateBirth);
    }
}
