package optionsMenu;


import javax.management.relation.Role;
import java.util.Scanner;

public class LoginMenu implements MenuInterface {

    public void display() {
        System.out.println("Zaloguj: ");


    }

    public void selectMainMenuOption() {
        System.out.println("Wybierz jedną z opcji: ");
        System.out.println("0 - logwanie jako admin");
        System.out.println("1 - logowanie jako użytkownik");
        Scanner scanner = new Scanner(System.in);

        switch (scanner.nextLine()){
            case "0":

            case "1":
        }

    }

    public void listOfPerson(){

    }
}
