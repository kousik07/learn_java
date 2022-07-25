package com.sample;

import java.util.Arrays;

public class RowandcolSearch {
    public static void main(String[] args) {
        int[][] kou = {
                {12,15,23,35},
                {13,16,25,37},
                {19,20,27}
        };
        System.out.println(Arrays.toString(search(kou,37)));
    }

    static int[] search(int[][] arr, int tar) {
        int row = 0;
        int col = arr.length - 1;
        while (row < arr.length && col >= 0) {
            if (arr[row][col] == tar) {
                return new int[]{row,col};
            } else if (arr[row][col] > tar) {
                col--;
            } else if (arr[row][col] < tar) {
                row++;
            }
        }
        return new int []{-1,-1};
    }
}
