package optionsMenu;

import java.util.ArrayList;
import java.util.List;

public class LoginMenu implements MenuInterface {
    private List<User> users;


    public void display() {


    }


    User u1 = new User("aaaa", "a");
    User u2 = new User("bbbb", "b");
    User u3 = new User("cccc", "c");
    User u4 = new User("dddd", "d");

    public void addToList(User u1, User u2, User u3, User u4) {

            users.add(u1);
            users.add(u2);
            users.add(u3);
            users.add(u4);


    }

    public void showList() {
        for (User user :
                users) {
            System.out.println(user.getLogin() + user.getPassword());
        }
    }
}
