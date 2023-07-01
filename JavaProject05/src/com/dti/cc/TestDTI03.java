package com.dti.cc;

public class TestDTI03 implements TestG, TestH {

    @Override
    public void showHi() {
        System.out.println("Hi...");
    }

    @Override
    public void showHum() {
        System.out.println("Hum...");
    }

    @Override
    public void showHui() {
        System.out.println("Hui...");
    }
    
    
}
