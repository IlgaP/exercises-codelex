package io.codelex.arrays.practice;

public class Exercise5 {

    // Write a Java program to find the index of an array element.
    public static void main(String[] args) {
        int[] myArray = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};

        System.out.println("Index position of 36 is: " + findIndex(myArray, 36));
        System.out.println("Index position of 29 is: " + findIndex(myArray, 29));
    }

    public static int findIndex(int[] arr, int numberToFind) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == numberToFind) {
                return i;
            }
        }
        return -1;
    }
}
