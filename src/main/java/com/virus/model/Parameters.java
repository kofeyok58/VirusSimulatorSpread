package com.virus.model;

public class Parameters {
    private double r0=2.5;
    private  double incubation =5.0;//дней
    private  double recovery = 14.0;//дней
    private double mortality = 0.02;//2%
    private double maskEffect =0.0;
    private double vaccineRate = 0.0;// %  день



    private boolean useSEIR = true;

    public double getBeta(double N){return  r0*(1-maskEffect)/recovery;}
    public double getSigma(){return useSEIR? 1.0 / incubation : 0;}
    public double getGamma(){return 1.0 / recovery;}
    public double getMu(){return mortality/recovery;}

    public double getR0(){return r0;}
    public void  setR0(double r0){this.r0 = r0;}
    public double getIncubation(){return incubation;}
    public void setIncubation(double incubation){this.incubation = incubation;}
    public double getRecovery(){return recovery;}
    public void setRecovery(double recovery){this.recovery= recovery;}

    public double getMortality(){return mortality;}
    public void  setMortality(double mortality){this.mortality = mortality;}

    public double getMaskEffect(){return maskEffect;}
    public void  setMaskEffect(double maskEffect){this.maskEffect=maskEffect;}
    public double getVaccineRate(){return vaccineRate;}
    public void setVaccineRate(double vaccineRate){this.vaccineRate =vaccineRate;}

    public boolean isUseSEIR(){return useSEIR;}
    public void setUseSEIR(boolean useSEIR){this.useSEIR = useSEIR;}
}
