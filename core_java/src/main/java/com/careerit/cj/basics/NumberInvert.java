package com.careerit.cj.basics;

import com.sun.source.tree.WhileLoopTree;

import java.util.Scanner;

public class NumberInvert {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();
        int temp=num;
        int r,sum=0;
        while (num>0){
            r=num%10;
            sum=(sum*10)+r;
            num=num/10;
        }
        if (sum==temp) {
            System.out.println("inverted number is: " + sum + " and is a palindrome");
        }
        else {
            System.out.println(sum+ " is not a palindrome");}
    }
}
