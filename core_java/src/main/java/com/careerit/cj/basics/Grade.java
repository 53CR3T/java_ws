package com.careerit.cj.basics;

import java.util.Scanner;

public class Grade {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter marks");
        int score= sc.nextInt();
        switch(score) {
            case 30:
                System.out.println("fail");
                break;
            case 20:
                System.out.println("pass");
                break;
            default:
                System.out.println("code sarigga ledhu");
        }

        }

    }

