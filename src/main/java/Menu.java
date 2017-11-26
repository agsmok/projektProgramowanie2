import optionsMenu.LoginMenu;
import optionsMenu.MenuInterface;

import java.util.HashMap;
import java.util.Map;

public class Menu {

    private static Menu instance = null;
    Map<MenuOptions, MenuInterface> allOptions = new HashMap<>();


    public static Menu getInstance() {
        if (instance == null) {
            instance = new Menu();
        }
        return instance;
    }

    public enum MenuOptions {
        LOGIN_MENU, MAIN_MENU, CURRENCY_MENU

    }

    private Menu() {
        allOptions.put(MenuOptions.LOGIN_MENU, new LoginMenu());
    }


    public void showMenu(MenuOptions menuOptions) {
        allOptions.get(menuOptions).display();

    }
}

