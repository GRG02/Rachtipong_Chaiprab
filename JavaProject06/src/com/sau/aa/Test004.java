package com.sau.aa;

public abstract class Test004 extends Test002{
    public Test004(int valueA){
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
}

class Test004_2 extends Test004{
    public Test004_2(int valueA) {
        super(valueA);
    }

    @Override
    public void show2(){
        System.out.println("2222");
    }
}
