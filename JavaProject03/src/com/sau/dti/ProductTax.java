package com.sau.dti;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ProductTax {

    public static void main(String[] args) throws IOException {
        System.out.println("---------------------------");
        System.out.println("     Calculate Tax");
        System.out.println("---------------------------");

        String productName;
        double productPrice, productTax;

        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Input product name : ");
        productName = buffer.readLine();
        System.out.print("Input product price : ");
        productPrice = Double.parseDouble(buffer.readLine());
        System.out.println("---------------------------");

        productTax = productPrice * 7 / 100;

        System.out.print("ราคาภาษีคือ " + productTax + " บาท\n");
    }
}
