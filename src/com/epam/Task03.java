package com.epam;

import java.util.Random;

public class Task03 {
    public static void main(String[] args) {
        Random rand = new Random();
        int N = rand.nextInt(100) + 10;
        int[] array = new int[N];
        int positive = 0, negative = 0, zero = 0;

        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt(100) * (rand.nextInt(100) % 2 == 0 ? -1 : 1);

            System.out.printf("[%d]", array[i]);
            if (array[i] > 0) {
                positive++;
            } else {
                if (array[i] == 0) {
                    zero++;
                } else {
                    negative++;
                }
            }
        }
        System.out.printf("\nTotal: %d", N);
        System.out.printf("\nPositive: %d", positive);
        System.out.printf("\nNegative: %d", negative);
        System.out.printf("\nZero: %d", zero);
    }
}