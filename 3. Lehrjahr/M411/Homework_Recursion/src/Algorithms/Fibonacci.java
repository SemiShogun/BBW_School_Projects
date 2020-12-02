package Algorithms;

/**
 * Fibonacci.java
 *
 * @author Jamie Lam
 * @version 29.10.2020
 */
public class Fibonacci {

    public static void fibonacci(int value) {
        value = recursion(value);
        System.out.printf("The Fibonacci sequence is %d", value);
    }

    private static int recursion(int i) {
        if (i <= 2) {
            return 1;
        }
        return recursion(i - 1) + recursion(i - 2);
    }

}
