package ch.bbw.pr.service;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Insertionsort
 * @author Peter Rutschmann
 * @version 26.02.2020
 */
public class InsertionSort {
	
	public ArrayList<Integer[]> sort(Integer[] arr){
		ArrayList<Integer[]> list = new ArrayList<Integer[]>();

		for(int i = 1; i < arr.length; i++) {
			for(int j = i; j > 0 && arr[j] < arr[j - 1]; j--) {
				swap(arr, j - 1, j);
			}
		}

		list.add(Arrays.copyOf(arr, arr.length));
		return list;
	}

	private static void swap(Integer[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
}
