package ch.bbw.pr.service;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

/**
 * RandomValues
 * 
 * @author Peter Rutschmann
 * @version 26.02.2020
 *
 */
public class RandomValues {

	public ArrayList<Integer> generateIntegerValues(int count
			, int maximum, int minimum, Integer seed){
		ArrayList<Integer> values = new ArrayList<Integer>();

		//**********************************
		//Hier den richtigen Code einbauen
		for(int i=minimum; i<count; i++) {
			values.add(i*2);
		}

		Collections.shuffle(values);
		
		return values; 
	}
	
	public ArrayList<Integer> reverseSortOrder(ArrayList<Integer> input){
		ArrayList<Integer> output = new ArrayList<>(input);

		//**********************************
		//Hier den richtigen Code ergänzen
		Collections.reverse(output);
		return output;
	}
	
	public ArrayList<Integer> nearlySorted(ArrayList<Integer> input){
		ArrayList<Integer> output = new ArrayList<>(input);

		//**********************************
		//Hier den richtigen Code ergänzen

		Collections.sort(output);

		for(int i = 0; i < 5; i++) {
			Collections.swap(output, (int) (Math.random()) * output.size(), (int) (Math.random()) * output.size());
		}

		return output;
	}
}
