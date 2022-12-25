package com.careerit.cj.basics;

import java.util.Scanner;

public class Cab {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the number of people");
        int count= sc.nextInt();
        System.out.println("enter the cab capacity");
        int cabcap= sc.nextInt();
        int rc;
        if(count%cabcap>0)
        {
            rc=(count/cabcap)+1;
        }
        else {
             rc= count/cabcap;
        }
        System.out.println("total cabs required:" + rc);

    }
}
