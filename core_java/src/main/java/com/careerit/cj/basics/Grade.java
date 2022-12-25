package com.careerit.cj.basics;

import java.util.Scanner;

public class Grade {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter marks");
        int score= sc.nextInt();
        if (score >=0 && score<40){
            System.out.println("D");
        } else if (score>=40 && score<60 ) {
            System.out.println("C");
        } else if (score>=60 && score<80) {
            System.out.println("B");

        } else if (score>=80 && score<=100) {
            System.out.println("A");
        }else{
            System.out.println("enter valid score");
        }

        }

    }

