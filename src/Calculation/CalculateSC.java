package Calculation;

import Program.Account;
import Program.Calculator;

public class CalculateSC {
    private double finalSC;
    public CalculateSC(Account account, int index, Calculator calculator) {
        double asgScore = calculator.getStudents().get(index).getSCAsgScore();
        double midScore = calculator.getStudents().get(index).getSCMidScore();
        double finalScore = calculator.getStudents().get(index).getSCFinalScore();
        double finallabScore = calculator.getStudents().get(index).getSCLabFinalScore();

        finalSC = ((14.0/100.0)*asgScore) + ((21.0/100.0)*midScore) + ((35.0/100.0)*finalScore) + ((30.0/100.0)*finallabScore);
    }

    public double getFinalSC() {
        return finalSC;
    }

    public void setFinalSC(double finalSC) {
        this.finalSC = finalSC;
    }
}
