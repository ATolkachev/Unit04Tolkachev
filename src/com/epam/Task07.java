package com.epam;

import java.util.Random;

public class Task07 {
    public static void main(String[] args) {
        Random rand = new Random();
        int N = rand.nextInt(20);
        int[][] array = new int[N][N];

        for (int k = 0; k < N; k++) {
            for (int i = 0; i < N; i++) {
                array[k][i] = rand.nextInt(20) * (rand.nextInt(10) % 2 == 0 ? -1 : 1);

                System.out.printf("[%3d]", array[k][i]);

            }
            System.out.printf("\n");
        }
        System.out.printf("\n");
        for (int i = 0; i < N; i++) {
            System.out.printf("[%3d]", array[i][i]);
        }
    }
}