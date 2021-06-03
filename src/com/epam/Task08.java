package com.epam;

import java.util.Scanner;
import java.util.Random;

public class Task08 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sign;
        int k, p;

        Random rand = new Random();
        int N = rand.nextInt(10) + 10;
        int M = rand.nextInt(10) + 10;
        int[][] array = new int[N][M];

        for (int j = 0; j < N; j++) {
            for (int i = 0; i < M; i++) {
                array[j][i] = rand.nextInt(20) * (rand.nextInt(10) % 2 == 0 ? -1 : 1);

                System.out.printf("[%3d]", array[j][i]);

            }
            System.out.printf("\n");
        }
        System.out.printf("Введите k:");
        k = sc.nextInt();
        if (k >= N) {
            System.out.printf("k больше размера массива, программа сломалась");
            return;
        }
        for (int i=0;i<M;i++){
            System.out.printf("[%3d]", array[k][i]);
        }
        System.out.printf("\nВведите p:");
        p = sc.nextInt();
        if (p >= M) {
            System.out.printf("p больше размера массива, программа сломалась");
            return;
        }
        for (int i=0;i<M;i++){
            System.out.printf("[%3d]", array[i][p]);
        }

    }
}