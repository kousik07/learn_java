package com.sample;

import java.sql.SQLOutput;
import java.util.Scanner;

public class kousi {
    public static void main(String[] args) {


        int a = 0;
        int b = 1;
        int temp = 0;
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
//        if (n == 1) ;
//        {
//            System.out.println(a);
//        }
//        if (n == 2) ;
//        {
//            System.out.println(a);
//            System.out.println(b);
//        }

        {
            for (int x = 0; x <= n - 1; x++) {
                if (x <= 1) {
                    System.out.println(x);
                } else {
                    temp = a + b;
                    System.out.println(temp);
                    a = b;
                    b = temp;


                }
            }
        }
    }
}