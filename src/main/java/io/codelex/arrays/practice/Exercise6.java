package io.codelex.arrays.practice;

import java.util.Arrays;
import java.util.Random;

public class Exercise6 {
    public static void main(String[] args) {
        int size = 10;
        int[] array1 = new int[size];
        int[] array2 = new int[size];

        Random rand = new Random();

        for (int i = 0; i < size; i++) {
            array1[i] = rand.nextInt(100) + 1;
        }

        System.arraycopy(array1, 0, array2, 0, size);
        array1[size - 1] = -7;

        System.out.println(Arrays.toString(array1));
        System.out.println(Arrays.toString(array2));
    }
}
