package com.epam;

import java.util.Random;
import java.util.Arrays;

public class Task02 {

    public static void main(String[] args) {
        int[] array = new int[10];
        int max, min;
        Random rand = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt(100);

            System.out.printf("[%d]", array[i]);
        }
        min = Arrays.stream(array).min().getAsInt();
        max = Arrays.stream(array).max().getAsInt();
        System.out.println("\nMin = " + min);
        System.out.println("Max = " + max);
    }
}