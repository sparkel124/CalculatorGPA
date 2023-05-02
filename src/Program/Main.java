package Program;

import ChooseSubject.SubjectGUI;
import InputScore.InputScoreCB;
import InputScore.InputScoreCalculus;
import LoginFrame.WelcomeLoginGUI;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        calculator.addAccount(new Student("ghoran", "2602190412"));
        calculator.addAccount(new Student("grace", "2602189940"));
        calculator.addAccount(new Student("justin", "2602189606"));
        calculator.addAccount(new Student("evangeline", "2602189581"));
        calculator.addAccount(new Student("ryan", "2602189650"));
        calculator.addAccount(new Student("hans", "2602190425"));
        calculator.addAccount(new Student("kezia", "2602191522"));
        calculator.addAccount(new Student("yoga", "2602190425"));
        calculator.addAccount(new Student("jason", "2602190450"));
        calculator.addAccount(new Student("karina", "2602189625"));
        calculator.addAccount(new Student("abdhy", "2602189557"));
        calculator.addAccount(new Student("ruth", "2602189644"));
        calculator.addAccount(new Student("mika", "2602189663"));
        calculator.addAccount(new Student("aryo", "2602189847"));
        calculator.addAccount(new Student("jacky", "2602190431"));
        calculator.addAccount(new Student("bella", "2602190980"));
        calculator.addAccount(new Student("dustin", "2602189575"));
        calculator.addAccount(new Student("jennifer", "2602190463"));
        calculator.addAccount(new Student("joel", "2602189612"));
        calculator.addAccount(new Student("stephen", "2602189695"));
        calculator.addAccount(new Student("athalia", "2602189562"));
        calculator.addAccount(new Student("delvin", "2602189871"));
        calculator.addAccount(new Student("gladys", "2602189594"));
        calculator.addAccount(new Student("marvel", "2602189884"));
        calculator.addAccount(new Student("tristan", "2602189700"));
        calculator.addAccount(new Student("ziven", "2602190476"));
        calculator.addAccount(new Student("jesslyn", "2602201265"));
        calculator.addAccount(new Student("marlene", "2602189631"));
        calculator.addAccount(new Student("matthew", "2602198945"));
        calculator.addAccount(new Student("shamgar", "2602189676"));
        calculator.addAccount(new Student("daniel", "2602189865"));
        calculator.addAccount(new Student("ferren", "2602190406"));
        calculator.addAccount(new Student("ichsan", "2602191245"));
        calculator.addAccount(new Student("jackys", "2602190444"));
        calculator.addAccount(new Student("stefanie", "2602189682"));

//        new InputScoreCalculus();
//        new InputScoreCB();
        Login login = new Login();
        login.LoginMenu(calculator.getStudents(), calculator);
    }
}