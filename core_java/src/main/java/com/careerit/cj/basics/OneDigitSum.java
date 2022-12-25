package com.careerit.cj.basics;

import java.util.Scanner;

public class OneDigitSum {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number");
        int num= sc.nextInt();
        int r;
        while (num>9){
            num=(num/10)+(num%10);
        }
        System.out.println("sum of the number is:  "+ num);
    }
}

