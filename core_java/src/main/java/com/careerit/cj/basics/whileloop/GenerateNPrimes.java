package com.careerit.cj.basics.whileloop;

import java.util.Scanner;

public class GenerateNPrimes
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 'from' value");
        int N = sc.nextInt();
        System.out.println("Enter the 'to' value");
        int O = sc.nextInt();
        int i = N;
        int count = 0;
        while(i>=N && i<=O) {
            if(isPrime(i)) {
                System.out.println((i + "   "));
                count++;
                System.out.println((count + "   "));
            }
            if(count == 100)
            {
                break;
            }
            i++;
        }
    }
    private static boolean isPrime(int num)
    {
        if ((num<2)||num%2==0 &&num !=2)
        {
            return false;
        }

        for (int i=2; i<= num/2;i++)
        {
            if (num % i == 0)
            {
                return false;
            }
        }
        return true;
    }
}
