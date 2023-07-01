package com.sau.dti;

import java.util.Scanner;

public class TaxiRent {
    public static void showAppName(){
        System.out.println("++++++++++++++++++++");
        System.out.println("      Taxi Rent Application");
        System.out.println("++++++++++++++++++++");
    }
    
    public static int inputTaxiData(){
        String r_name, r_number;
        int r_hour;
        Scanner TaxiData = new Scanner(System.in);
        System.out.print("Enter Name : ");
        r_name = TaxiData.nextLine();
        System.out.print("Enter car no. : ");
        r_number = TaxiData.nextLine();
        System.out.print("Enter rent hour : ");
        r_hour = TaxiData.nextInt();
        return r_hour;
    }
    
    public static double calTaxiRentPrice(int r_hour){
        double payRent = r_hour <= 24 ? r_hour * 25.50 : r_hour * 23.50;
        return payRent;
    }
    
    public static void showTaxiRentPrice(double payRent){
        System.out.println("++++++++++++++++++++");
        System.out.println("Rent Price is : "+payRent);
        System.out.println("++++++++++++++++++++");
    }
    
    public static void main(String[] args) {
        showAppName();
        int r_hour = inputTaxiData();
        double payRent = calTaxiRentPrice(r_hour);
        showTaxiRentPrice(payRent);
    }
}
