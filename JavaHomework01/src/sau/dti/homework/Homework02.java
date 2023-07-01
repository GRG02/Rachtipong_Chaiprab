package sau.dti.homework;

import java.util.Scanner;

public class Homework02 {
    public static void Header(){
        System.out.println("======================");
        System.out.println("      โปรแกรมคิดคำนวณค่าไฟฟ้า");
        System.out.println("======================");
    }
    
    public static double homeData(){
        Scanner scan = new Scanner(System.in);
        System.out.print("ป้อนเลขที่บ้าน : ");
        String homeNum = scan.next();
        System.out.print("ป้อนชื่อเจ้าของบ้าน : ");
        String homeName = scan.next();
        System.out.print("ป้อนจำนวนหน่วยไฟฟ้าที่ใช้ : ");
        double unitElectric = scan.nextDouble();
        return unitElectric;
    }
    
    public static double electricPrice(double unitElectric){
        double payElectric;
        if(unitElectric <= 30){
            payElectric = unitElectric * 6.50;
        }
        else if(30 < unitElectric && unitElectric <= 50){
            payElectric = (30 * 6.50) + ((unitElectric - 30) * 7.50) ;
        }
        else{
            payElectric = (30 * 6.50) + (20 * 7.50) + ((unitElectric - 50) * 8.50);
        }
        return payElectric;
    }
    
    public static void showElecPrice(double payElectric){
        System.out.printf("ค่าไฟคิดเป็นเงิน : " + payElectric + " บาท\n");
    }
    
    public static void main(String[] args) {
        Header();
        double unitElectric = homeData();
        double payElectric = electricPrice(unitElectric);
        System.out.println("======================");
        showElecPrice(payElectric);
        System.out.println("======================");
    }
}
