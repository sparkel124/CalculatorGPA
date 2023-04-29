package Calculation;

import Program.Account;
import Program.Calculator;

public class CalculateDS {
    private double finalDS;
    public CalculateDS(Account account, int index, Calculator calculator) {
        double asgScore = calculator.getStudents().get(index).getDSAsgScore();
        double midScore = calculator.getStudents().get(index).getDSMidScore();
        double midlabScore = calculator.getStudents().get(index).getDSLabMidScore();
        double finalScore = calculator.getStudents().get(index).getDSFinalScore();
        double finallabScore = calculator.getStudents().get(index).getDSLabFinalScore();

        finalDS = ((16.0/100.0)*asgScore) + ((24.0/100.0)*midScore) + ((8.0/100.0)*midlabScore) + ((40.0/100.0)*finalScore) + ((12.0/100.0)*finallabScore);
    }

    public double getFinalDS() {
        return finalDS;
    }

    public void setFinalDS(double finalDS) {
        this.finalDS = finalDS;
    }
}
