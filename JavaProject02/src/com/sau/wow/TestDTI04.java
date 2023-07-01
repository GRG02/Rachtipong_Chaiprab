package com.sau.wow;

import java.util.Scanner;

//เขียนโปรแกรมคำนวณค่า Commission โดยป้อนยอดขาย
//ยอดขายเกิน 5,000 ให้ค่าคอม 10% ของยอดขาย
//ถ้าไม่เกินให้ 5% ของยอดขายและแสดงผล
public class TestDTI04 {

    public static void main(String[] args) {
        float sale, commission;

        Scanner obob = new Scanner(System.in);
        System.out.print("ป้อนยอดขาย : ");
        sale = obob.nextFloat();
        System.out.println("++++++++++++++++++");
        commission = sale > 5000 ? sale*10/100 : sale* 5/100;
        System.out.println("ค่าคอมฯ เป็นเงิน : " + commission + " บาท");
        System.out.println("ทั้งหมดเป็นเงิน " + (sale + commission) + " บาท" );

    }
}
