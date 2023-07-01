package sau.dti.homework;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Homework01 {

    public static int[] inputValue() throws IOException {
        int i;
        int[] value = new int[5];
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        for (i = 0; i < 5; i++) {
            System.out.format("Enter value no. %d : ", i + 1);
            value[i] = Integer.parseInt(buffer.readLine());
        }
        return value;
    }

    public static double AvgCal(int[] value) {
        int i, sum = 0;
        for (i = 0; i < 5; i++) {
            sum += value[i];
        }
        double length = value.length;
        double Avg = sum / length;
        System.out.println("ค่าเฉลี่ยของค่าเหล่านี้คือ : "+Avg);
        return Avg;
    }
    
    public static void SDCal(double Avg, int[] value){
        int i;
        for (i = 0; i < 5; i++){
            value[i] += Math.pow(value[i] - Avg, 2);
        }
        int sum = 0;
        for (i = 0; i < 5; i++) {
            sum += value[i];
        }
        double length = value.length, SD = Math.sqrt(sum / length);
        System.out.format("ส่วนเบี่ยงเบนมาตรฐานของค่าเหล่านี้คือ : %.2f\n", SD);
    }

    public static void main(String[] args) throws IOException {
        System.out.println("-----------------------------");
        int[] value = inputValue();
        System.out.println("-----------------------------");
        double Avg = AvgCal(value);
        System.out.println("-----------------------------");
        SDCal(Avg, value);
        System.out.println("-----------------------------");
    }
}