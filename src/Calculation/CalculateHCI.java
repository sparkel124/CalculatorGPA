package Calculation;

import Program.Account;
import Program.Calculator;

public class CalculateHCI {
    private double finalHCI;
    public CalculateHCI(Account account, int index, Calculator calculator) {
        double asgScore = calculator.getStudents().get(index).getHCIAsgScore();
        double midScore = calculator.getStudents().get(index).getHCIMidScore();
        double finalScore = calculator.getStudents().get(index).getHCIFinalScore();
        double finallabScore = calculator.getStudents().get(index).getHCILabFinalScore();

        finalHCI = ((14.0/100.0)*asgScore) + ((21.0/100.0)*midScore)+ ((35.0/100.0)*finalScore) + ((30.0/100.0)*finallabScore);
    }

    public double getFinalHCI() {
        return finalHCI;
    }

    public void setFinalHCI(double finalHCI) {
        this.finalHCI = finalHCI;
    }
}
