package com.sample;

import java.util.Scanner;

public class numberdigit {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a=in.nextInt();
        int num=213325;
        int count=0;
        int rem;
        while(num>0){
            rem=num%10;
            if(rem==a){
                count++;
            }
            num=num/10;
        }
        System.out.println(count);
    }
}
