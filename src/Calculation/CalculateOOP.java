package Calculation;

import Program.Account;
import Program.Calculator;

public class CalculateOOP {
    private double finalOOP;
    public CalculateOOP(Account account, int index, Calculator calculator) {
        double asgScore = calculator.getStudents().get(index).getOOPAsgScore();
        double midScore = calculator.getStudents().get(index).getOOPMidScore();
        double finalScore = calculator.getStudents().get(index).getOOPFinalScore();

        finalOOP = ((20.0/100.0)*asgScore) + ((30.0/100.0)*midScore) + ((50.0/100.0)*finalScore);
    }

    public double getFinalOOP() {
        return finalOOP;
    }

    public void setFinalOOP(double finalOOP) {
        this.finalOOP = finalOOP;
    }
}
