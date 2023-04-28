package Calculation;

import InputScore.InputScoreCalculus;
import Program.Account;
import Program.Calculate;
import Program.Calculator;

public class CalculateCalculus {
    private double finalCalculus;
    public CalculateCalculus(Account account, int index, Calculator calculator)
    {
        double asgScore = calculator.getStudents().get(index).getCalAsgScore();
        double midScore = calculator.getStudents().get(index).getCalMidScore();
        double finalScore = calculator.getStudents().get(index).getCalFinalScore();


        finalCalculus = ((25.0/100.0)*asgScore) + ((35.0/100.0)*midScore) + ((40.0/100.0)*finalScore);
    }

    public double getFinalCalculus() {
        return finalCalculus;
    }

    public void setFinalCalculus(double finalCalculus) {
        this.finalCalculus = finalCalculus;
    }

}


