package com.epam;

import java.util.Random;

public class Task01 {

    public static void main(String[] args) {

        int count = 0;
        int[] array = new int[10];
        int[] result = new int[10];

        Random rand = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt(100);
            System.out.printf("[%d]", array[i]);
        }
        System.out.println();

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                result[count] = array[i];
                count++;
            }
        }

        if (count == 0) {
            System.out.println("Массив не содержит чётных чисел.");
        } else {
            for (int j = 0; j < count; j++) {
                System.out.printf("[%d]", result[j]);
            }
        }
    }
}