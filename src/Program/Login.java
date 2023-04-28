package Program;

import LoginFrame.WelcomeLoginGUI;

import java.util.ArrayList;

public class Login {
    public void LoginMenu(ArrayList<Account> account){

        WelcomeLoginGUI welcomeLoginGUI = new WelcomeLoginGUI();
        welcomeLoginGUI.welcomeLogin(account);

    }
}
