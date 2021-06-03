package com.epam;

import java.util.Random;

public class Task10 {
    public static void main(String[] args) {
        Random rand = new Random();
        int N = rand.nextInt(10)+10;
        int[][] array = new int[N][N];

        for (int k = 0; k < N; k++) {
            for (int i = 0; i < N; i++) {
                if ((i == 0 || i == N - 1) || (k == 0 || k == N - 1)) {
                    array[k][i] = 1;
                }

                System.out.printf("[%d]", array[k][i]);

            }
            System.out.printf("\n");
        }
    }
}