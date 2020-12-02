package ch.bbw.jl.verschleiern;

/**
 * Algorithm
 * Bietet Algorithmen an
 * @author Peter Rutschmann
 * @version 29.08.2019
 */
public class Algorithm {
	static public String disguise(String input) {
		return input;
	}

	/**
	 * Reverses the String
	 * @param input
	 * @return result
	 */
	public static String reverseString(String input) {
		String result = "";
		for(int i = input.length() - 1; i >= 0; i--) {
			result = result + input.charAt(i);
		}
		return result;
	}

	/**
	 * Capitalizes the String.
	 *
	 * @param input
	 * @return result
	 */
	public static String capitalizeString(String input) {
		String result = "";
		for(int i = 0; i <= input.length() - 1; i++) {
			result = result + Character.toUpperCase(input.charAt(i));
		}
		return result;
	}

}
