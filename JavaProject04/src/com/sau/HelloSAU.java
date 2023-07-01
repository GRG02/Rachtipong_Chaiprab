package com.sau;

public class HelloSAU {
    int x;
    private int y=50;

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
    
    //overloading method
    public void showHi(){
    
    }
    
    public void showHi(int x, double y){
    
    }
    
    public void showHi(double z, int m){
    
    }
    
    //overloading constructor
    public HelloSAU(){
        System.out.println("AAA");
    }
    public HelloSAU(int x){
        System.out.println("BBB"+ x);
    }
    public HelloSAU(double y){
        System.out.println("CCC"+ y);
    }
}
