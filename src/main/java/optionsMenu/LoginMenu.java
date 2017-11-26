package optionsMenu;

import java.util.*;

public class LoginMenu implements MenuInterface {
    public LoginMenu() {

    }

    private List<User> users = new ArrayList<>();


    public void display() {
        addToList(u1, u2, u3, u4);

        System.out.println("Witaj w naszym systemie.");
        System.out.print("Podaj login:");
        Scanner scanner = new Scanner(System.in);

        String login = scanner.nextLine().trim();

        System.out.print("Podaj hasło:");
        String password = scanner.nextLine().trim();
        verify(login, password);


    }

    private void verify(String login, String password) {
        boolean zalogowano = false;
        for (User user : users) {
            if (login.equals(user.getLogin()) && password.equals(user.getPassword())) {
                zalogowano = true;
                System.out.println("Zalogowałeś się!");
            }
        }
        if (!zalogowano)
            System.out.println("Błąd logowania");
    }


    User u1 = new User("aaaa", "a");
    User u2 = new User("aaaa", "b");
    User u3 = new User("cccc", "c");
    User u4 = new User("dddd", "d");

    public void addToList(User... userss) {
        for (User user : userss) {
            users.add(user);

        }


    }


}
