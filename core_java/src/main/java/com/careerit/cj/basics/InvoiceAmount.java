package com.careerit.cj.basics;

import java.util.Scanner;

public class InvoiceAmount {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the bill amount : ");
        float bill = sc.nextFloat();
        float disc = 0;
        if (bill >= 5000)
        {
            disc = bill * 0.2f;
        }
        float total = bill - disc;
        System.out.println("pay:" + total);
    }
}