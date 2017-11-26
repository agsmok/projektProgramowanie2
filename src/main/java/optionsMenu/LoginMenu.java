package optionsMenu;

import optionsMenu.MenuInterface;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LoginMenu implements MenuInterface {
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
        for (User user : users) {
            if (login.equals(user.getLogin()) && password.equals(user.getPassword())) {
                System.out.println("Zalogowałeś się!");
                break;
            } else

                System.out.println("Błąd logowania");
            break;
        }
    }


    User u1 = new User("aaaa", "a");
    User u2 = new User("bbbb", "b");
    User u3 = new User("cccc", "c");
    User u4 = new User("dddd", "d");

    public void addToList(User... userss) {
        for (User user : userss) {
            users.add(user);

        }


    }


}
