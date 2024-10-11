package com.enalto.eda.averageusingarrays;

public class ArrayAverage {
    public static void main(String[] args) {

        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};

        int length = array.length;
        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        double average = (double) sum / length;
        System.out.println("Sum of the elements is: " + sum);
        System.out.println("Length of the array is: " + length);
        System.out.println("Average of the elements is " + average);
    }
}
