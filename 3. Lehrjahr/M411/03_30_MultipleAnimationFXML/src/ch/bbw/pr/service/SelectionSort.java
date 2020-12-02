package ch.bbw.pr.service;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Selection
 * @author Peter Rutschmann
 * @version 26.02.2020
 *
 */
public class SelectionSort {
	
	public ArrayList<Integer[]> sort(Integer[] arr){
		ArrayList<Integer[]> list = new ArrayList<Integer[]>();

		//**********************************
		//Hier den richtigen Code ergänzen
		//
		// Bei jedem Schritt den Zustand hinzufügen
		// list.add(Arrays.copyOf(values, values.length));

		for(int i = 1; i < arr.length; i++) {
			int swapIndex = i;
			for(int j = i + 1; j < arr.length; j++) {
				if(arr[j] < arr[swapIndex]) {
					swapIndex = j;
				}
			}
			swap(arr, i, swapIndex);
		}

		list.add(Arrays.copyOf(arr, arr.length));

		return list;
	}

	public static void swap(Integer[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
}
