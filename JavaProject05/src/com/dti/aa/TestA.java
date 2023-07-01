package com.dti.aa;

public class TestA {
    //data member
    private int numberDti1;
    private double numberDti2;
    private String infoSau1;
    
    public TestA(int numberDti1, double numberDti2, String infoSau1){
        this.numberDti1 = numberDti1;
        this.numberDti2 = numberDti2;
        this.infoSau1 = infoSau1;
    }
   
    public TestA(){}

    public int getNumberDti1() {
        return numberDti1;
    }

    public void setNumberDti1(int numberDti1) {
        this.numberDti1 = numberDti1;
    }

    public double getNumberDti2() {
        return numberDti2;
    }

    public void setNumberDti2(double numberDti2) {
        this.numberDti2 = numberDti2;
    }

    public String getInfoSau1() {
        return infoSau1;
    }

    public void setInfoSau1(String infoSau1) {
        this.infoSau1 = infoSau1;
    }
    
}
