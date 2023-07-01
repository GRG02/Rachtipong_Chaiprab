package com.sau.wow;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TestDTI02 {

    public static void main(String[] args) throws IOException{
        String stu_name;
        int stu_quiz;
        double stu_midterm, stu_final;

        //InputStreamReader input = new InputStreamReader (System.in);
        //BufferedReader buffer = new BufferedReader (input);
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("ป้อนชื่อ : ");
        stu_name = buffer.readLine();
        System.out.print("ป้อนคะแนนเก็บ : ");
        stu_quiz = Integer.parseInt(buffer.readLine()) ;
        System.out.print("ป้อนคะแนนกลางภาค : ");
        stu_midterm = Double.parseDouble( buffer.readLine());
        System.out.print("ป้อนคะแนนปลายภาค : ");
        stu_final = Double.parseDouble(buffer.readLine()) ;
        System.out.println("--------------------------------");
        System.out.println("คะแนนรวมคือ : " + (stu_quiz + stu_midterm + stu_final));
        
    }
}
