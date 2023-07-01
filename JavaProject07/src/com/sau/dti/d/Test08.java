package com.sau.dti.d;
//Inheretance

//Polymorphism พฤติกรรมเดียวกัน แต่วิธีต่างกัน ต้องใช้ Inheretance
public class Test08 extends Test07 {
    //data
    public int cc;

    //method
    public void metHi(){
        System.out.println("Hi...");
    }
    
    @Override
    public void metWow(){
        System.out.println("Wow Wow Wow...");
    }
}
