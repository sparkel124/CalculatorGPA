package Program;

import Calculation.*;

public class Calculate {
    private double totalSC = -1;
    private double totalDS =-1;
    private double totalOOP = -1;
    private double totalCB = -1;
    private double totalCal = -1;
    private double totalHCI = -1;
    private double GPA;

    public Calculate(Account account, int index, Calculator calculator)
    {
        CalculateCalculus calculateCalculus = new CalculateCalculus(account, index, calculator);
        CalculateCB calculateCB = new CalculateCB(account, index, calculator);
        CalculateDS calculateDS = new CalculateDS(account, index, calculator);
        CalculateHCI calculateHCI = new CalculateHCI(account, index, calculator);
        CalculateOOP calculateOOP= new CalculateOOP(account, index, calculator);
        CalculateSC calculateSC = new CalculateSC(account, index, calculator);
        CalculateGPA calculateGPA = new CalculateGPA(account, index, calculator);

        totalCal = calculateCalculus.getFinalCalculus();
        totalCB = calculateCB.getFinalCB();
        totalDS = calculateDS.getFinalDS();
        totalHCI = calculateHCI.getFinalHCI();
        totalOOP = calculateOOP.getFinalOOP();
        totalSC = calculateSC.getFinalSC();

        if(totalCal!=-1 && totalCB!=-1 && totalDS!=-1 && totalHCI!=-1 && totalOOP!=-1 && totalSC!=-1)
        {
            GPA = calculateGPA.getGPA();
        }
    }


    public double getTotalSC() {
        return totalSC;
    }

    public void setTotalSC(double totalSC) {
        this.totalSC = totalSC;
    }

    public double getTotalDS() {
        return totalDS;
    }

    public void setTotalDS(double totalDS) {
        this.totalDS = totalDS;
    }

    public double getTotalOOP() {
        return totalOOP;
    }

    public void setTotalOOP(double totalOOP) {
        this.totalOOP = totalOOP;
    }

    public double getTotalCB() {
        return totalCB;
    }

    public void setTotalCB(double totalCB) {
        this.totalCB = totalCB;
    }

    public double getTotalCal() {
        return totalCal;
    }

    public void setTotalCal(double totalCal) {
        this.totalCal = totalCal;
    }

    public double getTotalHCI() {
        return totalHCI;
    }

    public void setTotalHCI(double totalHCI) {
        this.totalHCI = totalHCI;
    }

    public double getGPA() {
        return GPA;
    }

    public void setGPA(double GPA) {
        this.GPA = GPA;
    }
}
