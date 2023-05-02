package Program;

import LoginFrame.WelcomeLoginGUI;

import java.util.ArrayList;

public class Login {
    public void LoginMenu(ArrayList<Student> students, Calculator calculator){

        WelcomeLoginGUI welcomeLoginGUI = new WelcomeLoginGUI();
        welcomeLoginGUI.welcomeLogin(students, calculator);

    }
}
