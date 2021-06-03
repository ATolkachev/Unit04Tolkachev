package com.epam;

import java.util.Random;

public class Task06 {
    public static void main(String[] args) {
        Random rand = new Random();
        int N = rand.nextInt(20);
        int M = rand.nextInt(20);
        int[][] array = new int[N][M];
        int count_seven = 0;

        for (int k = 0; k < N; k++) {
            for (int i = 0; i < M; i++) {
                array[k][i] = rand.nextInt(20) * (rand.nextInt(10) % 2 == 0 ? -1 : 1);

                System.out.printf("[%3d]", array[k][i]);

                if (array[k][i]==7){
                    count_seven++;
                }
            }
            System.out.printf("\n");
        }
        System.out.printf("Total seven: %d", count_seven);
    }
}