package Program;

import ChooseSubject.SubjectGUI;
import LoginFrame.WelcomeLoginGUI;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        calculator.addAccount(new Account("kezia", "2602191522"));

        // new WelcomeLoginGUI();
        new SubjectGUI();
    }
}