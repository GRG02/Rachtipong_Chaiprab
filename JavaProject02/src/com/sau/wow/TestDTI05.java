package com.sau.wow;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TestDTI05 {

    public static void main(String[] args) throws IOException {
        int sale, commission;

        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("ป้อนยอดขาย : ");
        sale = Integer.parseInt(buffer.readLine());
        System.out.println("++++++++++++++++++");
        commission = sale > 5000 ? sale * 10 / 100 : sale * 5 / 100;
        System.out.println("ค่าคอมฯ เป็นเงิน : " + commission + " บาท");
        System.out.println("ทั้งหมดเป็นเงิน " + (sale + commission) + " บาท");
    
    }
}
