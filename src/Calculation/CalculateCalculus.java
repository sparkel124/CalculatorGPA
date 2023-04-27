package Calculation;

import InputScore.InputScoreCalculus;

public class CalculateCalculus {
    InputScoreCalculus calculus = new InputScoreCalculus();
    private double finalCalculus;
    public CalculateCalculus()
    {
        double asgScore = calculus.getAsgScore();
        double midScore = calculus.getMidScore();
        double finalScore = calculus.getFinalScore();

        finalCalculus = ((25.0/100.0)*asgScore) + ((35.0/100.0)*midScore) + ((40.0/100.0)*finalScore);
    }

    public double getFinalCalculus() {
        return finalCalculus;
    }

    public void setFinalCalculus(double finalCalculus) {
        this.finalCalculus = finalCalculus;
    }

}


