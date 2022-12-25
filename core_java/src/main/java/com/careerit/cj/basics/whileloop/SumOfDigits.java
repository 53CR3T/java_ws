package com.careerit.cj.basics.whileloop;

import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();
        int r;
        int sum=0;
        while (num>0){
            r=num%10;
            sum=sum+r;
            num=num/10;
        }
        System.out.println("sum is " +sum);
    }
}
