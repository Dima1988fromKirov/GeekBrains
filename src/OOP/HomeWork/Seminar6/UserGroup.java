package OOP.HomeWork.Seminar6;

import java.util.List;

public class UserGroup {
    private List<User> users;

    public UserGroup(List<User> users) {
        this.users = users;
    }


    public List<User> getUsers() {
        return users;
    }

    public void addUsers(User user){
        users.add(user);
    }

    @Override
    public String toString() {
        return "UserGroup{" +
                "students=" + users +
                '}';
    }
}
