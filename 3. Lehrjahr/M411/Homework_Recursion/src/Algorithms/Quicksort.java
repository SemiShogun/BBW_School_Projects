package Algorithms;

import java.util.Arrays;

/**
 * Quicksort.java
 *
 * @author Jamie Lam
 * @version 29.10.2020
 */
public class Quicksort {

    public static void quickSort(int[] arr) {
        quickSort(arr, 0, arr.length - 1);
        System.out.println("The sorted quicksort array contains: " + Arrays.toString(arr));
    }

    private static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int splitPoint = partition(arr, low, high);
            quickSort(arr, low, splitPoint);
            quickSort(arr, splitPoint + 1, high);
        }
    }

    // Hoare partition algorithm
    private static int partition(int[] arr, int low, int high) {
        int pivot = arr[low];
        int i = low - 1, j = high + 1;
        while (true) {
            do {
                i++;
            } while (arr[i] < pivot);

            do {
                j--;
            } while (arr[j] > pivot);

            if (i < j) {
                swap(arr, i, j);
            } else {
                return j;
            }
        }
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
