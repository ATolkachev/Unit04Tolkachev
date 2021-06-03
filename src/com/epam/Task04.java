package com.epam;

import java.util.Random;

public class Task04 {
    public static void main(String[] args) {
        Random rand = new Random();
        int N = rand.nextInt(20) + 10;
        int[] array = new int[N];

        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt(100) * (rand.nextInt(100) % 2 == 0 ? -1 : 1);

            System.out.printf("[%d]", array[i]);
        }
        System.out.printf("\n");
        boolean Sorted = false;
        do {
            Sorted = true;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    Sorted = false;
                }
            }
        } while (!Sorted);

        for (int i = 0; i < array.length; i++) {
            System.out.printf("[%d]", array[i]);
        }
    }
}