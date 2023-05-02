package Calculation;

import InputScore.InputScoreCalculus;
import Program.Account;
import Program.Calculate;
import Program.Calculator;

public class CalculateCalculus {
    private double finalCalculus, weightCal;
    private String gradeCal;
    public CalculateCalculus(Account account, int index, Calculator calculator)
    {
        double asgScore = calculator.getStudents().get(index).getCalAsgScore();
        double midScore = calculator.getStudents().get(index).getCalMidScore();
        double finalScore = calculator.getStudents().get(index).getCalFinalScore();

        finalCalculus = ((25.0/100.0)*asgScore) + ((35.0/100.0)*midScore) + ((40.0/100.0)*finalScore);

        if(finalCalculus >= 90 && finalCalculus <= 100)
        {
            weightCal = 4.00;
            gradeCal = "A";
        }
        else if(finalCalculus >= 85 && finalCalculus <= 89)
        {
            weightCal = 3.67;
            gradeCal = "A-";
        }
        else if(finalCalculus >= 80 && finalCalculus <= 84)
        {
            weightCal = 3.33;
            gradeCal = "B+";
        }
        else if(finalCalculus >= 75 && finalCalculus <= 79)
        {
            weightCal = 3.00;
            gradeCal = "B";
        }
        else if(finalCalculus >= 70 && finalCalculus <= 74)
        {
            weightCal = 2.50;
            gradeCal = "B-";
        }
        else if(finalCalculus >= 65 && finalCalculus <= 69)
        {
            weightCal = 2.00;
            gradeCal = "C";
        }
        else if(finalCalculus >= 50 && finalCalculus <= 64)
        {
            weightCal = 1.00;
            gradeCal = "D";
        }
        else if(finalCalculus >= 0 && finalCalculus <= 49)
        {
            weightCal = 0.00;
            gradeCal = "E";
        }
    }

    public double getFinalCalculus() {
        return finalCalculus;
    }

    public void setFinalCalculus(double finalCalculus) {
        this.finalCalculus = finalCalculus;
    }

    public double getWeightCal() {
        return weightCal;
    }

    public void setWeightCal(double weightCal) {
        this.weightCal = weightCal;
    }

    public String getGradeCal() {
        return gradeCal;
    }

    public void setGradeCal(String gradeCal) {
        this.gradeCal = gradeCal;
    }
}


