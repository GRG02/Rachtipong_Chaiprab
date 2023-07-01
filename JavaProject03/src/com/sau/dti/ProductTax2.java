package com.sau.dti;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ProductTax2 {

    public static double calProductTax(double productPrice) {
//        double productTax;
//        productTax = productPrice * 7 / 100;
//        return (productTax);
        return productPrice * 7 / 100;
    }
    
    public static double showProductTax(double productTax){
        System.out.print("Tax pay of product " + productTax + " Bath\n");
        System.out.println("---------------------------");
        return productTax;
    }

    public static void main(String[] args) throws IOException {
        String productName;
        double productPrice, productTax;

        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("---------------------------");
        System.out.println("     Calculate Tax");
        System.out.println("---------------------------");

        System.out.print("Input product name : ");
        productName = buffer.readLine();
        System.out.print("Input product price : ");
        productPrice = Double.parseDouble(buffer.readLine());
        System.out.println("---------------------------");
        productTax = calProductTax(productPrice);
        showProductTax(productTax);
    }
}
