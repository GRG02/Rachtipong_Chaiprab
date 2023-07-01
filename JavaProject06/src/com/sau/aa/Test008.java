package com.sau.aa;

public abstract class Test008 implements Test005 {

    @Override
    public void metTest1() {
    }

    @Override
    public void metTest1(int x) {
    }
}
    
class Test009 extends Test008{
    @Override
    public void metTest2() {
    }

    @Override
    public void metTest3() {
    }
}