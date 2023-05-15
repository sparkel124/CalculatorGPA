package Program;

import ChooseSubject.SubjectGUI;
import InputScore.InputScoreCB;
import InputScore.InputScoreCalculus;
import LoginFrame.WelcomeLoginGUI;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        calculator.addAccount(new Student("Ghoran", "2602190412"));
        calculator.addAccount(new Student("Grace", "2602189940"));
        calculator.addAccount(new Student("Justin", "2602189606"));
        calculator.addAccount(new Student("Evangeline", "2602189581"));
        calculator.addAccount(new Student("Ryan", "2602189650"));
        calculator.addAccount(new Student("Hans", "2602198932"));
        calculator.addAccount(new Student("Kezia", "2602191522"));
        calculator.addAccount(new Student("Yoga", "2602190425"));
        calculator.addAccount(new Student("Jason", "2602190450"));
        calculator.addAccount(new Student("Karina", "2602189625"));
        calculator.addAccount(new Student("Abdhy", "2602189557"));
        calculator.addAccount(new Student("Ruth", "2602189644"));
        calculator.addAccount(new Student("Mika", "2602189663"));
        calculator.addAccount(new Student("Aryo", "2602189846"));
        calculator.addAccount(new Student("Jacky", "2602190431"));
        calculator.addAccount(new Student("Bella", "2602190980"));
        calculator.addAccount(new Student("Dustin", "2602189575"));
        calculator.addAccount(new Student("Jennifer", "2602190463"));
        calculator.addAccount(new Student("Joel", "2602189612"));
        calculator.addAccount(new Student("Stephen", "2602189695"));
        calculator.addAccount(new Student("Athalia", "2602189562"));
        calculator.addAccount(new Student("Delvin", "2602189871"));
        calculator.addAccount(new Student("Gladys", "2602189594"));
        calculator.addAccount(new Student("Marvel", "2602189884"));
        calculator.addAccount(new Student("Tristan", "2602189700"));
        calculator.addAccount(new Student("Ziven", "2602190476"));
        calculator.addAccount(new Student("Jesslyn", "2602201265"));
        calculator.addAccount(new Student("Marlene", "2602189631"));
        calculator.addAccount(new Student("Matthew", "2602198945"));
        calculator.addAccount(new Student("Shamgar", "2602189676"));
        calculator.addAccount(new Student("Daniel", "2602189865"));
        calculator.addAccount(new Student("Ferren", "2602190406"));
        calculator.addAccount(new Student("Ichsan", "2602191245"));
        calculator.addAccount(new Student("Jackys", "2602190444"));
        calculator.addAccount(new Student("Stefanie", "2602189682"));

//        new InputScoreCalculus();
//        new InputScoreCB();
        Login login = new Login();
        login.LoginMenu(calculator.getStudents(), calculator);
    }
}