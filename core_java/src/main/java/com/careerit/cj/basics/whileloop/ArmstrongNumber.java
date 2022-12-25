package com.careerit.cj.basics.whileloop;

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number");
        int num= sc.nextInt();
        int temp=num;
        int r,sum=0;
        while (num>0){
            r=num%10;
            sum=(r*r*r)+sum;
            num=num/10;
        }
        if (sum==temp){
            System.out.println("armstrong number");
        }
        else {
            System.out.println("not an armstrong number");}
    }
}
