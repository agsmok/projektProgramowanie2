package Kantor;

import Kantor.menu.CurrencyMenu;
import Kantor.menu.LoginMenu;
import Kantor.menu.MainMenu;
import Kantor.menu.MenuInterface;

import java.util.HashMap;
import java.util.Map;

import static java.awt.SystemColor.menu;

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
        allOptions.put(MenuOptions.MAIN_MENU, new MainMenu());
        allOptions.put(MenuOptions.CURRENCY_MENU, new CurrencyMenu());
    }


    public void showMenu(MenuOptions menuOptions) {
        allOptions.get(menuOptions).display();

    }
}

