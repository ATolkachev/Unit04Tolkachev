package com.epam;

import java.util.Random;

public class Task05 {
    public static void main(String[] args) {
        Random rand = new Random();
        int N = rand.nextInt(20) + 10;
        int[] array = new int[N];

        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt(100) * (rand.nextInt(100) % 2 == 0 ? -1 : 1);

            System.out.printf("[%d]", array[i]);
        }
        System.out.printf("\n");

        for (int i=0; i<array.length; i++) {
            int val=array[i];

            int j=i-1;

            for (; j>=0; j--) {
                if (val<array[j]) {
                    array[j+1]=array[j];
                } else {
                    break;
                }
            }
            array[j+1]=val;
        }

        for (int i = 0; i < array.length; i++) {
            System.out.printf("[%d]", array[i]);
        }
    }
}