package Calculation;

import Program.Account;
import Program.Calculator;

public class CalculateSC {
    private double finalSC, weightSC;
    private String gradeSC;
    public CalculateSC(Account account, int index, Calculator calculator) {
        double asgScore = calculator.getStudents().get(index).getSCAsgScore();
        double midScore = calculator.getStudents().get(index).getSCMidScore();
        double finalScore = calculator.getStudents().get(index).getSCFinalScore();
        double finallabScore = calculator.getStudents().get(index).getSCLabFinalScore();

        finalSC = ((14.0/100.0)*asgScore) + ((21.0/100.0)*midScore) + ((35.0/100.0)*finalScore) + ((30.0/100.0)*finallabScore);

        if(finalSC >= 90 && finalSC <= 100)
        {
            weightSC = 4.00;
            gradeSC = "A";
        }
        else if(finalSC >= 85 && finalSC <= 89)
        {
            weightSC = 3.67;
            gradeSC = "A-";
        }
        else if(finalSC >= 80 && finalSC <= 84)
        {
            weightSC = 3.33;
            gradeSC = "B+";
        }
        else if(finalSC >= 75 && finalSC <= 79)
        {
            weightSC = 3.00;
            gradeSC = "B";
        }
        else if(finalSC >= 70 && finalSC <= 74)
        {
            weightSC = 2.50;
            gradeSC = "B-";
        }
        else if(finalSC >= 65 && finalSC <= 69)
        {
            weightSC = 2.00;
            gradeSC = "C";
        }
        else if(finalSC >= 50 && finalSC <= 64)
        {
            weightSC = 1.00;
            gradeSC = "D";
        }
        else if(finalSC >= 0 && finalSC <= 49)
        {
            weightSC = 0.00;
            gradeSC = "E";
        }
    
    }

    public double getFinalSC() {
        return finalSC;
    }

    public void setFinalSC(double finalSC) {
        this.finalSC = finalSC;
    }

    public double getWeightSC() {
        return weightSC;
    }

    public void setWeightSC(double weightSC) {
        this.weightSC = weightSC;
    }

    public String getGradeSC() {
        return gradeSC;
    }

    public void setGradeSC(String gradeSC) {
        this.gradeSC = gradeSC;
    }
}
