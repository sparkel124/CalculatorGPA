package Calculation;

import Program.Account;
import Program.Calculator;

public class CalculateOOP {
    private double finalOOP, weightOOP;
    private String gradeOOP;
    public CalculateOOP(Account account, int index, Calculator calculator) {
        double asgScore = calculator.getStudents().get(index).getOOPAsgScore();
        double midScore = calculator.getStudents().get(index).getOOPMidScore();
        double finalScore = calculator.getStudents().get(index).getOOPFinalScore();

        finalOOP = ((20.0/100.0)*asgScore) + ((30.0/100.0)*midScore) + ((50.0/100.0)*finalScore);

        if(finalOOP >= 90 && finalOOP <= 100)
        {
            weightOOP = 4.00;
            gradeOOP = "A";
        }
        else if(finalOOP >= 85 && finalOOP <= 89)
        {
            weightOOP = 3.67;
            gradeOOP = "A-";
        }
        else if(finalOOP >= 80 && finalOOP <= 84)
        {
            weightOOP = 3.33;
            gradeOOP = "B+";
        }
        else if(finalOOP >= 75 && finalOOP <= 79)
        {
            weightOOP = 3.00;
            gradeOOP = "B";
        }
        else if(finalOOP >= 70 && finalOOP <= 74)
        {
            weightOOP = 2.50;
            gradeOOP = "B-";
        }
        else if(finalOOP >= 65 && finalOOP <= 69)
        {
            weightOOP = 2.00;
            gradeOOP = "C";
        }
        else if(finalOOP >= 50 && finalOOP <= 64)
        {
            weightOOP = 1.00;
            gradeOOP = "D";
        }
        else if(finalOOP >= 0 && finalOOP <= 49)
        {
            weightOOP = 0.00;
            gradeOOP = "E";
        }
    }

    public double getFinalOOP() {
        return finalOOP;
    }

    public void setFinalOOP(double finalOOP) {
        this.finalOOP = finalOOP;
    }

    public double getWeightOOP() {
        return weightOOP;
    }

    public void setWeightOOP(double weightOOP) {
        this.weightOOP = weightOOP;
    }

    public String getGradeOOP() {
        return gradeOOP;
    }

    public void setGradeOOP(String gradeOOP) {
        this.gradeOOP = gradeOOP;
    }
}
