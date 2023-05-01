package Calculation;

import Program.Account;
import Program.Calculator;

public class CalculateCB {
    private double finalCB, weightCB;
    private String gradeCB;
    public CalculateCB(Account account, int index, Calculator calculator) {
        double asgScore = calculator.getStudents().get(index).getCBAsgScore();
        double midScore = calculator.getStudents().get(index).getCBMidScore();
        double finalScore = calculator.getStudents().get(index).getCBFinalScore();

        finalCB = ((50.0/100.0)*asgScore) + ((20.0/100.0)*midScore) + ((30.0/100.0)*finalScore);

        if(finalCB >= 90 && finalCB <= 100)
        {
            weightCB = 4.00;
            gradeCB = "A";
        }
        else if(finalCB >= 85 && finalCB <= 89)
        {
            weightCB = 3.67;
            gradeCB = "A-";
        }
        else if(finalCB >= 80 && finalCB <= 84)
        {
            weightCB = 3.33;
            gradeCB = "B+";
        }
        else if(finalCB >= 75 && finalCB <= 79)
        {
            weightCB = 3.00;
            gradeCB = "B";
        }
        else if(finalCB >= 70 && finalCB <= 74)
        {
            weightCB = 2.50;
            gradeCB = "B-";
        }
        else if(finalCB >= 65 && finalCB <= 69)
        {
            weightCB = 2.00;
            gradeCB = "C";
        }
        else if(finalCB >= 50 && finalCB <= 64)
        {
            weightCB = 1.00;
            gradeCB = "D";
        }
        else if(finalCB >= 0 && finalCB <= 49)
        {
            weightCB = 0.00;
            gradeCB = "E";
        }
    }

    public double getFinalCB() {
        return finalCB;
    }

    public void setFinalCB(double finalCB) {
        this.finalCB = finalCB;
    }

    public double getWeightCB() {
        return weightCB;
    }

    public void setWeightCB(double weightCB) {
        this.weightCB = weightCB;
    }

    public String getGradeCB() {
        return gradeCB;
    }

    public void setGradeCB(String gradeCB) {
        this.gradeCB = gradeCB;
    }
}
