package com.enalto.eda.averageusingarrays;

import java.util.Scanner;

public class averagefromuserinputs {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter array size: ");
        int size = scanner.nextInt();

        int[] array = new int[size];
        System.out.println("Enter array values");

        for (int i = 0; i < array.length; i++) {
            var value = scanner.nextInt();
            array[i] = value;
        }

        int lenght = array.length;
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }

        double average = (double) sum / lenght;
        System.out.println("Length of the array is: " + lenght);
        System.out.println("Sum of the elements is: " + sum);
        System.out.println("Average of the elements is " + average);

    }
}
