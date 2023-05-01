package Calculation;

import Program.Account;
import Program.Calculator;

public class CalculateHCI {
    private double finalHCI, weightHCI;
    private String gradeHCI;
    public CalculateHCI(Account account, int index, Calculator calculator) {
        double asgScore = calculator.getStudents().get(index).getHCIAsgScore();
        double midScore = calculator.getStudents().get(index).getHCIMidScore();
        double finalScore = calculator.getStudents().get(index).getHCIFinalScore();
        double finallabScore = calculator.getStudents().get(index).getHCILabFinalScore();

        finalHCI = ((14.0/100.0)*asgScore) + ((21.0/100.0)*midScore)+ ((35.0/100.0)*finalScore) + ((30.0/100.0)*finallabScore);

        if(finalHCI >= 90 && finalHCI <= 100)
        {
            weightHCI = 4.00;
            gradeHCI = "A";
        }
        else if(finalHCI >= 85 && finalHCI <= 89)
        {
            weightHCI = 3.67;
            gradeHCI = "A-";
        }
        else if(finalHCI >= 80 && finalHCI <= 84)
        {
            weightHCI = 3.33;
            gradeHCI = "B+";
        }
        else if(finalHCI >= 75 && finalHCI <= 79)
        {
            weightHCI = 3.00;
            gradeHCI = "B";
        }
        else if(finalHCI >= 70 && finalHCI <= 74)
        {
            weightHCI = 2.50;
            gradeHCI = "B-";
        }
        else if(finalHCI >= 65 && finalHCI <= 69)
        {
            weightHCI = 2.00;
            gradeHCI = "C";
        }
        else if(finalHCI >= 50 && finalHCI <= 64)
        {
            weightHCI = 1.00;
            gradeHCI = "D";
        }
        else if(finalHCI >= 0 && finalHCI <= 49)
        {
            weightHCI = 0.00;
            gradeHCI = "E";
        }
    }

    public double getFinalHCI() {
        return finalHCI;
    }

    public void setFinalHCI(double finalHCI) {
        this.finalHCI = finalHCI;
    }

    public double getWeightHCI() {
        return weightHCI;
    }

    public void setWeightHCI(double weightHCI) {
        this.weightHCI = weightHCI;
    }

    public String getGradeHCI() {
        return gradeHCI;
    }

    public void setGradeHCI(String gradeHCI) {
        this.gradeHCI = gradeHCI;
    }
}
