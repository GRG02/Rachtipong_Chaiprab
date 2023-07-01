package com.dti.BB;

public class TestC extends TestB {
    public int scoreB;
    public int scoreA = 99;
    
    public void showInfo(){
        System.out.println(scoreA);
        System.out.println(super.scoreA);
        showScoreA();
        super.showScoreA();
    }
    
    public TestC(){
        System.out.println("Hello...");
    }
    
    public void showScoreB(){
        System.out.println("Score B is : "+ scoreB);
    }
    
    @Override
    public void showScoreA(){
        System.out.println("SAU...");
    }
}
