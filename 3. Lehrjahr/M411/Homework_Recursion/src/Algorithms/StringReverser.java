package Algorithms;

/**
 * StringReverser.java
 *
 * @author Jamie Lam
 * @version 29.10.2020
 */
public class StringReverser {

    public static void reverseString(String str) {
        String reversed = recursion(str);
        System.out.printf("The reversed string is: %s", reversed);
    }

    private static String recursion(String str) {
        if (str.isEmpty()) {
            return str;
        }

        return recursion(str.substring(1)) + str.charAt(0);
    }
}
