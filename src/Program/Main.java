package Program;

import ChooseSubject.SubjectGUI;
import LoginFrame.WelcomeLoginGUI;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        calculator.addAccount(new Account("kezia", "2602191522"));

        Login login = new Login();
        login.LoginMenu(calculator.getAccount());
    }
}