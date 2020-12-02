package Algorithms;

/**
 * Palindrome.java
 *
 * @author Jamie Lam
 * @version 29.10.2020
 */
public class Palindrome {

    public static void check(String str) {
        boolean isPalindrome = recursion(str);

        if (isPalindrome) {
            System.out.printf("%s is a palindrome", str);
        } else {
            System.out.printf("%s is not a palindrome", str);
        }
    }

    private static boolean recursion(String str) {
        if (str.length() == 0 || str.length() == 1)
            return true;
        if (str.charAt(0) == str.charAt(str.length() - 1))
            return recursion(str.substring(1, str.length() - 1));

        return false;
    }

}
