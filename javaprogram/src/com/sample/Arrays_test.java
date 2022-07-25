package com.sample;

import java.util.Arrays;

public class Arrays_test {
    public static void main(String[] args) {
        int target = 23;
        int[][] num = {
                {1, 2, 3, 4},
                {34, 45, 23, 543},
                {2, 4, 45}
        };

        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num[i].length; j++)
                if (num[i][j] == target) {
                    int[] arr = {i, j};
                    System.out.println(Arrays.toString(arr));

                }

        }


    }
}

