import java.util.Map;

public class Menu {

    private  static  Menu instance = null;

    public static Menu getInstance() {
        if (instance==null){
            instance=new Menu();
        }
        return instance;
    }

    public  enum MenuOptions{
LOGIN_MENU, MAIN_MENU, CURRENCY_MENU

    }

    Map<MenuOptions,Menu > allOptions;
}
