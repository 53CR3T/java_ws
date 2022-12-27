package com.careerit.cj.basics;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Guess {
    public static void main(String[] args) {
        int i,num = ThreadLocalRandom.current().nextInt(1,7);
        Scanner sc =new Scanner(System.in);
        for (i=0;i<3;i++)
        {
            System.out.println("guess the number");
            int guess = sc.nextInt();

            if (guess==num)
            {
                System.out.println("yayyy");
                break;
            }
            else
            {
            System.out.println("better l2uck next time");
            }
        }
        System.out.println("no more tries");
        System.out.println(" the number generated is "+ num);
    }
}
