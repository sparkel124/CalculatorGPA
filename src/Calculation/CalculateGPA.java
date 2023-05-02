package Calculation;

import Program.Account;
import Program.Calculator;

public class CalculateGPA {
    private double GPA;
    private double weightCal, weightCB, weightDS, weightHCI, weightOOP, weightSC;
    public CalculateGPA(Account account, int index, Calculator calculator)
    {
        CalculateCalculus calculateCalculus = new CalculateCalculus(account, index, calculator);
        CalculateCB calculateCB = new CalculateCB(account, index, calculator);
        CalculateDS calculateDS = new CalculateDS(account, index, calculator);
        CalculateHCI calculateHCI = new CalculateHCI(account, index, calculator);
        CalculateOOP calculateOOP= new CalculateOOP(account, index, calculator);
        CalculateSC calculateSC = new CalculateSC(account, index, calculator);

        weightCal = calculateCalculus.getWeightCal();
        weightCB = calculateCB.getWeightCB();
        weightDS = calculateDS.getWeightDS();
        weightHCI = calculateHCI.getWeightHCI();
        weightOOP = calculateOOP.getWeightOOP();
        weightSC = calculateSC.getWeightSC();

        GPA = ((4*weightCal) + (2*weightCB) + (6*weightDS) + (3*weightHCI) + (2*weightOOP) + (3*weightSC)) /20;
    }

    public double getGPA() {
        return GPA;
    }

    public void setGPA(double GPA) {
        this.GPA = GPA;
    }
}
