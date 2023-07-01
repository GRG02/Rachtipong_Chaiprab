package com.sau.aa;

public abstract class Test002 {
    //data
    public int valueA;
    
    public Test002(int valueA){
        this.valueA = valueA;
    }
    
    //method
    public void showHey(){
        System.out.println("Hey....");
    }
    
    //abstract method
    public abstract void show1();
    public abstract void show1(String a);
    public abstract void show2();
}
