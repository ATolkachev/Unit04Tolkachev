package com.epam;

import java.util.Random;

public class Task09 {
    public static void main(String[] args) {
        Random rand = new Random();
        int N = rand.nextInt(10) + 10;
        int[][] array = new int[N][N];

        for (int k = 0; k < N; k++) {
            array[k][N - k - 1] = k+1;
            for (int i = 0; i < N; i++) {
                System.out.printf("[%3d]", array[k][i]);
            }
            System.out.printf("\n");
        }
    }
}