package Program;

import ChooseSubject.SubjectGUI;
import InputScore.InputScoreCB;
import InputScore.InputScoreCalculus;
import LoginFrame.WelcomeLoginGUI;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        calculator.addAccount(new Account("ghoran", "2602190412"));
        calculator.addAccount(new Account("grace", "2602189940"));
        calculator.addAccount(new Account("justin", "2602189606"));
        calculator.addAccount(new Account("kezia", "2602191522"));
        calculator.addAccount(new Account("ryan", "2602189650"));
        calculator.addAccount(new Account("evangeline", "2602189581"));
        calculator.addAccount(new Account("hans", "2602190425"));
        calculator.addAccount(new Account("yoga", "2602190425"));
        calculator.addAccount(new Account("jason", "2602190450"));
        calculator.addAccount(new Account("karina", "2602189625"));
        calculator.addAccount(new Account("abdhy", "2602189557"));
        calculator.addAccount(new Account("ruth", "2602189644"));
        calculator.addAccount(new Account("mika", "2602189663"));
        calculator.addAccount(new Account("aryo", "2602189847"));
        calculator.addAccount(new Account("jacky", "2602190431"));
        calculator.addAccount(new Account("bella", "2602190980"));
        calculator.addAccount(new Account("dustin", "2602189575"));
        calculator.addAccount(new Account("jennifer", "2602190463"));
        calculator.addAccount(new Account("joel", "2602189612"));
        calculator.addAccount(new Account("stephen", "2602189695"));
        calculator.addAccount(new Account("athalia", "2602189562"));
        calculator.addAccount(new Account("delvin", "2602189871"));
        calculator.addAccount(new Account("gladys", "2602189594"));
        calculator.addAccount(new Account("marvel", "2602189884"));
        calculator.addAccount(new Account("tristan", "2602189700"));
        calculator.addAccount(new Account("ziven", "2602190476"));
        calculator.addAccount(new Account("jesslyn", "2602201265"));
        calculator.addAccount(new Account("marlene", "2602189631"));
        calculator.addAccount(new Account("matthew", "2602198945"));
        calculator.addAccount(new Account("shamgar", "2602189676"));
        calculator.addAccount(new Account("daniel", "2602189865"));
        calculator.addAccount(new Account("ferren", "2602190406"));
        calculator.addAccount(new Account("ichsan", "2602191245"));
        calculator.addAccount(new Account("jackys", "2602190444"));
        calculator.addAccount(new Account("stefanie", "2602189682"));

//        new InputScoreCalculus();
//        new InputScoreCB();
        Login login = new Login();
        login.LoginMenu(calculator.getAccount());
    }
}