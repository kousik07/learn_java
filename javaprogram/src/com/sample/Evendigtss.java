package com.sample;

public class Evendigtss {
    public static void main(String[] args) {
        int[] arr={12,4,234,-2456,14};
        int ans=evendigit(arr);
        System.out.println(ans);

    }
    static int evendigit(int [] arr){
        int count =0;
        for(int i=0;i<arr.length;i++){
            int ele = arr[i];
            if(ele < 0){
                ele=ele*-1;
            }
            int k=0;
            while(ele>0){
                ele=ele/10;
                k+=1;
            }
            if(k%2==0){
                count++;
            }
        }
        return count;
    }
}

