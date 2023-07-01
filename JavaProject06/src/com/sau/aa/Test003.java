package com.sau.aa;

public class Test003 extends Test002 {
    public Test003(int valueA){
        super(valueA);
    }
    
    @Override
    public void show1(){
        System.out.println("1111");
    }
    
    @Override
    public void show1(String a){
        System.out.println(a);
    }
    
    @Override
    public void show2(){
        System.out.println("2222");
    }
}
