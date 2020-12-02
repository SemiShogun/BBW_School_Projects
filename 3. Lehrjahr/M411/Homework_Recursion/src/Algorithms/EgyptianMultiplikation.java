package Algorithms;

/**
 * EgyptianMultiplikation.java
 *
 * @author Jamie Lam
 * @version 29.10.2020
 */
public class EgyptianMultiplikation {

    public static void multiply(int a, int b) {
        int sum = recursion(a, b);
        System.out.printf("The egyptian multiplication gave back %d", sum);
    }

    private static int recursion(int a, int b) {
        if (b == 1) {
            return a;
        } else if (b % 2 == 1) {
            return a + recursion(2 * a, b / 2);
        } else {
            return recursion(2 * a, b / 2);
        }
    }
}
