package OOP.HomeWork.Seminar6;

public class User implements Comparable<User> {
    private String firstName;
    private String secondName;
    private String lastName;

    public User(String firstName, String secondName, String lastName) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.lastName = lastName;
    }

    //region Геттеры

    public String getFirstName() {
        return firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    //endregion


    @Override
    public int compareTo(User o) {
        return this.getFirstName().compareTo(o.getFirstName());
    }

    @Override
    public String toString() {
        return  firstName +" " + secondName+ " " + lastName;
    }
}
