import Algorithms.*;

import java.util.Scanner;

/**
 * Application.java
 *
 * @author Jamie Lam
 * @version 29.10.2020
 */
public class Application {

    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(System.in);

            // Quicksort
            int[] randValues = new int[]{0, 4, 3, 5, 67, 2, 4, 56, 4, 5, 6, 4, 4, 3, 3, 2};
            Quicksort.quickSort(randValues);

            // String reversing
            System.out.println("Please enter a String to reverse: ");
            String randString = input.nextLine();
            StringReverser.reverseString(randString);
            System.out.println();

            // Palindrome
            System.out.println("Please enter a palindrome: ");
            String palindrome = input.nextLine();
            Palindrome.check(palindrome);
            System.out.println();

            // GGT
            System.out.println("GGT - Please enter the first integer: ");
            int arg1 = input.nextInt();
            System.out.println("GGT - Please enter the second integer: ");
            int arg2 = input.nextInt();
            GGT.ggt(arg1, arg2);
            System.out.println();

            // Türme von Hanoi
            System.out.println("Please enter the amount of disks for the tower of hanoi: ");
            int n = input.nextInt();
            TowerOfHanoi.hanoi(n);
            System.out.println();

            // Fibonacci
            System.out.println("Please enter an integer for the fibonacci sequence: ");
            int value = input.nextInt();
            Fibonacci.fibonacci(value);
            System.out.println();

            // Ägyptische Multiplikation
            System.out.println("Egyptian Multiplication - Please enter the first integer: ");
            int a = input.nextInt();
            System.out.println("Egyptian Multiplication - Please enter the second integer: ");
            int b = input.nextInt();
            EgyptianMultiplikation.multiply(a, b);
            System.out.println();
        } catch (Exception err) {
            err.printStackTrace();
        }

    }
}
