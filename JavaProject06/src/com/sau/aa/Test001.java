package com.sau.aa;

public class Test001 {
    //data, property, filed, attribute
    public int numA;
    public String infoA;
    
    //public Test001(){ } //empty constructor ไม่จำเป็นต้องสร้าง
    //constructor
    public Test001(){
        System.out.println("SAU...");
    }
    
    public Test001(int numA, String infoA){
        this.numA = numA;
        this.infoA = infoA;
    }
    
    //method, function
    public void showWow(){
        System.out.println("Wow Wow Wow");
    }
    
    public void showWow(String data){
        System.out.println("Wow Wow Wow" + data);
    }
    
    public int calNum(int x){
        System.out.println("Hi...");
        return numA * x;
    }
}
