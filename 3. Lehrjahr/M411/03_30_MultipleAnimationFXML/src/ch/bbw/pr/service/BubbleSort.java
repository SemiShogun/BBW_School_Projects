package ch.bbw.pr.service;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Bubblesort
 * @author Peter Rutschmann
 * @version 26.02.2020
 */
public class BubbleSort {

	public ArrayList<Integer[]> sort(Integer[] arr) {
		ArrayList<Integer[]> list = new ArrayList<Integer[]>();
		list.add(Arrays.copyOf(arr, arr.length));

		boolean sorted = false;
		while (!sorted) {
			sorted = true;
			for (int i = 1; i < arr.length; i++) {
				if(arr[i] < arr[i - 1]) {
					swap(arr, i - 1, i);
					sorted = false;
					list.add(Arrays.copyOf(arr, arr.length));
				}
			}
		}


		return list;
	}

	private static void swap(Integer[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
}
