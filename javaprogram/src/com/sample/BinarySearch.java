package com.sample;

import java.security.spec.RSAOtherPrimeInfo;

public class BinarySearch {
    public static void main(String[] args) {
        int target=999;
        int[] arr={1,2,3,4,5,6,25,27,98};
        int ans=binarysearch(arr,target);
        System.out.println(ans);

    }
    static int binarysearch(int[] arr,int target){
        int start=0;
        int end=arr.length-1;
        while(start<=end){
           int mid=start+(end-start)/2;
           if(target<arr[mid]){
               end=mid-1;
           }
           else if(target>arr[mid]){
               start=mid+1;
           }
           else{
               return mid;
           }
        }
    return -1;
    }
}
