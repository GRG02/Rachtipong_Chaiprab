package com.dti.cc;
//interface class เอาไป new ไม่ได้
public interface TestG {
    //กรณี data ต้องเป็น static final เท่านั้น
    //final คือ ค่าที่ห้ามเปลี่ยน ดังนั้นต้องกำหนดค่าให้
    public static final int SCORE_WOW = 25;
    //กรณี method ต้องเป็น abstract method เท่านั้น
    public abstract void showHi();
    public abstract void showHum();
}
