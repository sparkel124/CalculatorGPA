package Calculation;

import Program.Account;
import Program.Calculator;

public class CalculateDS {
    private double finalDS, weightDS;
    private String gradeDS;
    public CalculateDS(Account account, int index, Calculator calculator) {
        double asgScore = calculator.getStudents().get(index).getDSAsgScore();
        double midScore = calculator.getStudents().get(index).getDSMidScore();
        double midlabScore = calculator.getStudents().get(index).getDSLabMidScore();
        double finalScore = calculator.getStudents().get(index).getDSFinalScore();
        double finallabScore = calculator.getStudents().get(index).getDSLabFinalScore();

        finalDS = ((16.0/100.0)*asgScore) + ((24.0/100.0)*midScore) + ((8.0/100.0)*midlabScore) + ((40.0/100.0)*finalScore) + ((12.0/100.0)*finallabScore);

        if(finalDS >= 90 && finalDS <= 100)
        {
            weightDS = 4.00;
            gradeDS = "A";
        }
        else if(finalDS >= 85 && finalDS <= 89)
        {
            weightDS = 3.67;
            gradeDS = "A-";
        }
        else if(finalDS >= 80 && finalDS <= 84)
        {
            weightDS = 3.33;
            gradeDS = "B+";
        }
        else if(finalDS >= 75 && finalDS <= 79)
        {
            weightDS = 3.00;
            gradeDS = "B";
        }
        else if(finalDS >= 70 && finalDS <= 74)
        {
            weightDS = 2.50;
            gradeDS = "B-";
        }
        else if(finalDS >= 65 && finalDS <= 69)
        {
            weightDS = 2.00;
            gradeDS = "C";
        }
        else if(finalDS >= 50 && finalDS <= 64)
        {
            weightDS = 1.00;
            gradeDS = "D";
        }
        else if(finalDS >= 0 && finalDS <= 49)
        {
            weightDS = 0.00;
            gradeDS = "E";
        }
    }

    public double getFinalDS() {
        return finalDS;
    }

    public void setFinalDS(double finalDS) {
        this.finalDS = finalDS;
    }

    public double getWeightDS() {
        return weightDS;
    }

    public void setWeightDS(double weightDS) {
        this.weightDS = weightDS;
    }

    public String getGradeDS() {
        return gradeDS;
    }

    public void setGradeDS(String gradeDS) {
        this.gradeDS = gradeDS;
    }
}
