package Calculation;

import Program.Account;
import Program.Calculator;

public class CalculateCB {
    private double finalCB;
    public CalculateCB(Account account, int index, Calculator calculator) {
        double asgScore = calculator.getStudents().get(index).getCBAsgScore();
        double midScore = calculator.getStudents().get(index).getCBMidScore();
        double finalScore = calculator.getStudents().get(index).getCBFinalScore();

        finalCB = ((50.0/100.0)*asgScore) + ((20.0/100.0)*midScore) + ((30.0/100.0)*finalScore);
    }

    public double getFinalCB() {
        return finalCB;
    }

    public void setFinalCB(double finalCB) {
        this.finalCB = finalCB;
    }
}
