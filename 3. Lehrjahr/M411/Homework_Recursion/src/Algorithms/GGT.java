package Algorithms;

/**
 * GGT.java
 *
 * @author Jamie Lam
 * @version 29.10.2020
 */
public class GGT {

    public static void ggt(int arg1, int arg2) {
        int ggt = recursion(arg1, arg2);
        System.out.printf("GGT of %d and %d is %d", arg1, arg2, ggt);
    }

    private static int recursion(int arg1, int arg2) {
        if (arg2 != 0) {
            return recursion(arg2, arg1 % arg2);
        } else {
            return arg1;
        }
    }
}
