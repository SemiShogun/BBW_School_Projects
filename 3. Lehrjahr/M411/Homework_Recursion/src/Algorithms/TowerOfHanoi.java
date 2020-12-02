package Algorithms;

/**
 * TowerOfHanoi.java
 *
 * @author Jamie Lam
 * @version 29.10.2020
 */
public class TowerOfHanoi {

    // n symbolises the number of disks.
    public static void hanoi(int n) {
        recursion(n, 'A', 'C', 'B');
    }

    private static void recursion(int n, char from_rod, char to_rod, char aux_rod) {
        if (n == 1) {
            System.out.println("Moved disk 1 from rod " + from_rod + " to rod " + to_rod);
            return;
        }
        recursion(n - 1, from_rod, aux_rod, to_rod);
        System.out.println("Moved disk " + n + " from rod " + from_rod + " to rod " + to_rod);
        recursion(n - 1, aux_rod, to_rod, from_rod);
    }

}
