package com.sample;

import java.util.Scanner;
import java.lang.Math;

public class evenorodd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        System.out.println("Enter a name : ");
//        float num = input.nextFloat();
//        if (num%2 == 0){
//            System.out.println(num + "is even");
//        }
//        else {
//            System.out.println(num + "is odd");
//        }

//        String name = input.next();
//        System.out.println("Hello " + name);

//        float p = input.nextFloat();
//        float r = input.nextFloat();
//        int t = input.nextInt();
//        float si = (p*r*t)/100;
//        float A = p * (1 + r * t);
//        System.out.println("Simple Interest is " + si);
//        System.out.println("Final amount is " + A);

//        int a = input.nextInt();
//        int b = input.nextInt();
//
//        int sum = a + b;
//
//        int sub;
//        if (a > b) {
//            sub = a - b;
//        } else {
//            sub = b - a;
//        }
//
//        int mul = a * b;
//        int div = a / b;
//        int rem = a % b;
//        System.out.println("Sum " + sum + ", Sub " + sub + ", mul " + mul + ", div " + div + ", rem " + rem);
//        float s = input.nextFloat();
////        int l = input.nextInt();
////        if (l > s){System.out.println(l + " is large");}
////        else {System.out.println(s + " is large");}
//        float dollar = (float) (s/61.06);
//        System.out.println(dollar);

//        int n = input.nextInt();
//
//        int first = 0;
//        int second = 1;
//
//        for(int x = 1; x <= n; x++){
//            if (x <= 2){ System.out.println(x-1);}
//            else {
//            int temp = first + second;
//            System.out.println(temp);
//            first = second;
//            second = temp;}
//        }
//        int str = 407;
//        StringBuilder nstr = new StringBuilder();
//        char ch;
//        for(int i=0; i<str.length(); i++){
////            ch = str.charAt(i);
////            System.out.println(ch);
//            nstr.insert(0, ch);
//            System.out.println(nstr);
//        }
//        if (str.equals(nstr.toString())){
//            System.out.println(str + " is Palindrome");
//        }
//        else {
//            System.out.println(str + " is Not palindrome");
//        }

        int n = 407, last, temp, sum = 0;
        String s = String.valueOf(n);
        int _len = s.length();
        System.out.println(_len);
        temp = n;
        while (temp > 0) {
            last = temp % 10;
            sum = sum + (int) Math.pow(last, _len);
            temp = temp / 10;
            System.out.println(sum + "," + temp + "," + last);
        }
        if (sum == n) {
            System.out.println(sum + " is Armstrong");
        } else {
            System.out.println(sum + " is Not Armstrong");
        }
    }
}
