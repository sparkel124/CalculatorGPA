package Program;

import Program.Account;

public class Student extends Account {
    private double SCAsgScore, DSAsgScore, OOPAsgScore, CBAsgScore, CalAsgScore, HCIAsgScore;
    private double SCMidScore, DSMidScore, OOPMidScore, CBMidScore, CalMidScore, HCIMidScore;
    private double SCFinalScore, DSFinalScore, OOPFinalScore, CBFinalScore, CalFinalScore, HCIFinalScore;
    private double DSLabMidScore, DSLabFinalScore;
    private double SCLabFinalScore, HCILabFinalScore;
    private double GPA;

    Student(String name, String password, double SCAsgScore, double DSAsgScore, double OOPAsgScore, double CBAsgScore, double calAsgScore, double HCIAsgScore, double SCMidScore, double DSMidScore, double OOPMidScore, double CBMidScore, double CalMidScore, double HCIMidScore, double SCFinalScore, double DSFinalScore, double OOPFinalScore, double CBFinalScore, double CalFinalScore, double HCIFinalScore, double DSLabMidScore, double DSLabFinalScore, double SCLabFinalScore, double HCILabFinalScore, double GPA) {
        super(name, password);
        this.SCAsgScore = SCAsgScore;
        this.DSAsgScore = DSAsgScore;
        this.OOPAsgScore = OOPAsgScore;
        this.CBAsgScore = CBAsgScore;
        this.CalAsgScore = CalAsgScore;
        this.HCIAsgScore = HCIAsgScore;
        this.SCMidScore = SCMidScore;
        this.DSMidScore = DSMidScore;
        this.OOPMidScore = OOPMidScore;
        this.CBMidScore = CBMidScore;
        this.CalMidScore = CalMidScore;
        this.HCIMidScore = HCIMidScore;
        this.SCFinalScore = SCFinalScore;
        this.DSFinalScore = DSFinalScore;
        this.OOPFinalScore = OOPFinalScore;
        this.CBFinalScore = CBFinalScore;
        this.CalFinalScore = CalFinalScore;
        this.HCIFinalScore = HCIFinalScore;
        this.DSLabMidScore = DSLabMidScore;
        this.DSLabFinalScore = DSLabFinalScore;
        this.SCLabFinalScore = SCLabFinalScore;
        this.HCILabFinalScore = HCILabFinalScore;
        this.GPA = GPA;
    }


    public double getSCAsgScore() {
        return SCAsgScore;
    }

    public void setSCAsgScore(double SCAsgScore) {
        this.SCAsgScore = SCAsgScore;
    }

    public double getDSAsgScore() {
        return DSAsgScore;
    }

    public void setDSAsgScore(double DSAsgScore) {
        this.DSAsgScore = DSAsgScore;
    }

    public double getOOPAsgScore() {
        return OOPAsgScore;
    }

    public void setOOPAsgScore(double OOPAsgScore) {
        this.OOPAsgScore = OOPAsgScore;
    }

    public double getCBAsgScore() {
        return CBAsgScore;
    }

    public void setCBAsgScore(double CBAsgScore) {
        this.CBAsgScore = CBAsgScore;
    }

    public double getCalAsgScore() {
        return CalAsgScore;
    }

    public void setCalAsgScore(double calAsgScore) {
        CalAsgScore = calAsgScore;
    }

    public double getHCIAsgScore() {
        return HCIAsgScore;
    }

    public void setHCIAsgScore(double HCIAsgScore) {
        this.HCIAsgScore = HCIAsgScore;
    }

    public double getSCMidScore() {
        return SCMidScore;
    }

    public void setSCMidScore(double SCMidScore) {
        this.SCMidScore = SCMidScore;
    }

    public double getDSMidScore() {
        return DSMidScore;
    }

    public void setDSMidScore(double DSMidScore) {
        this.DSMidScore = DSMidScore;
    }

    public double getOOPMidScore() {
        return OOPMidScore;
    }

    public void setOOPMidScore(double OOPMidScore) {
        this.OOPMidScore = OOPMidScore;
    }

    public double getCBMidScore() {
        return CBMidScore;
    }

    public void setCBMidScore(double CBMidScore) {
        this.CBMidScore = CBMidScore;
    }

    public double getCalMidScore() {
        return CalMidScore;
    }

    public void setCalMidScore(double calMidScore) {
        CalMidScore = calMidScore;
    }

    public double getHCIMidScore() {
        return HCIMidScore;
    }

    public void setHCIMidScore(double HCIMidScore) {
        this.HCIMidScore = HCIMidScore;
    }

    public double getSCFinalScore() {
        return SCFinalScore;
    }

    public void setSCFinalScore(double SCFinalScore) {
        this.SCFinalScore = SCFinalScore;
    }

    public double getDSFinalScore() {
        return DSFinalScore;
    }

    public void setDSFinalScore(double DSFinalScore) {
        this.DSFinalScore = DSFinalScore;
    }

    public double getOOPFinalScore() {
        return OOPFinalScore;
    }

    public void setOOPFinalScore(double OOPFinalScore) {
        this.OOPFinalScore = OOPFinalScore;
    }

    public double getCBFinalScore() {
        return CBFinalScore;
    }

    public void setCBFinalScore(double CBFinalScore) {
        this.CBFinalScore = CBFinalScore;
    }

    public double getCalFinalScore() {
        return CalFinalScore;
    }

    public void setCalFinalScore(double calFinalScore) {
        CalFinalScore = calFinalScore;
    }

    public double getHCIFinalScore() {
        return HCIFinalScore;
    }

    public void setHCIFinalScore(double HCIFinalScore) {
        this.HCIFinalScore = HCIFinalScore;
    }

    public double getDSLabMidScore() {
        return DSLabMidScore;
    }

    public void setDSLabMidScore(double DSLabMidScore) {
        this.DSLabMidScore = DSLabMidScore;
    }

    public double getDSLabFinalScore() {
        return DSLabFinalScore;
    }

    public void setDSLabFinalScore(double DSLabFinalScore) {
        this.DSLabFinalScore = DSLabFinalScore;
    }

    public double getSCLabFinalScore() {
        return SCLabFinalScore;
    }

    public void setSCLabFinalScore(double SCLabFinalScore) {
        this.SCLabFinalScore = SCLabFinalScore;
    }

    public double getHCILabFinalScore() {
        return HCILabFinalScore;
    }

    public void setHCILabFinalScore(double HCILabFinalScore) {
        this.HCILabFinalScore = HCILabFinalScore;
    }

    public double getGPA() {
        return GPA;
    }

    public void setGPA(double GPA) {
        this.GPA = GPA;
    }
}
