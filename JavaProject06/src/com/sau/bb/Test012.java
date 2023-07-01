package com.sau.bb;

public class Test012 {
    //final คือ ค่าคงที่
    
    //static คือ data ระดับคลาส คือ สามารถเข้าถึงได้ด้วยชื่อคลาส
    //data ที่เป็น static ทุก object จะใช้ data นี้ร่วมกัน
    
    //ไม่มี static คือ data ระดับ object เข้าถึงได้ด้วย object
    public int dataA = 20;
    public static int dataB = 30;
    public final int DATA_C = 50;
    public static final int DATA_D = 60;
    
    public void metA(){
        System.out.println("AAAAA");
    }
    
    public static void metB(){
        System.out.println("BBBBB");
    }
}
