package com.sau.dti;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

public class FahToCel {
    public static void showProgramName(){
        System.out.println("----------------------------");
        System.out.println("   Calculate Celsius");
        System.out.println("----------------------------");
    }
    
    public static double inputFahrenheit() throws IOException{
        double fahrenheit;
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Input Fahrenheit : ");
        fahrenheit = Double.parseDouble(buffer.readLine());
        System.out.println("----------------------------");
        return fahrenheit;
    }
    
    public static double calCtoF(double fahrenheit){
        double celsius = (fahrenheit - 32) * 5/ 9;
        return celsius;
    }
    
    public static void showCelsius(double celsius){
        DecimalFormat df = new DecimalFormat ("0.00");
        System.out.println("Celsius is : "+ df.format(celsius));
        System.out.println("----------------------------");
    }
    
    public static void main(String[] args) throws IOException {
        showProgramName();
        double fahrenheit = inputFahrenheit();
        double celsius = calCtoF(fahrenheit);
        showCelsius(celsius);
    }
}
