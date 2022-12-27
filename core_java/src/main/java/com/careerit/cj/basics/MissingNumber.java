package com.careerit.cj.basics;

import java.util.Arrays;

public class MissingNumber {
    public int missingnumber(int[] sender, int[]receiver) {
//        Arrays.sort(sender);
//        Arrays.sort(receiver);
//        for (int i = 0; i < sender.length - 1; i++) {
//            if (sender[i] != receiver[i]) {
//                return sender[i];
//            }
//        }
//            return sender[sender.length - 1];
        int sum1=0;
        for (int num:sender){
            sum1 += num;
        }
        int sum2=0;
        for (int num:receiver){
            sum2 += num;
        }
        return sum1-sum2;
    }
}