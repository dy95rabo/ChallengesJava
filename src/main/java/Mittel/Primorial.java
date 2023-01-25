package main.java.Mittel;

import java.util.stream.IntStream;

public class Primorial {

    /**
     * Find the Primorial
     * 
     * A Primorial is a product of the first n prime numbers (e.g. 2 x 3 x 5 = 30).
     * 2, 3, 5, 7, 11, 13 are prime numbers. If n was 3, you'd multiply 2 x 3 x 5 =
     * 30 or Primorial = 30.
     * 
     * Create a function that returns the Primorial of a number.
     * Examples
     * 
     * primorial(1) ➞ 2
     * 
     * primorial(2) ➞ 6
     * 
     * primorial(8) ➞ 9699690
     * 
     * Notes
     * 
     * N/A
     * 
     * @param n
     * @return
     */
    public static int primorial(int n) {
        return IntStream.iterate(3, i -> i + 2)
                .filter(i -> isPrime(i))
                .limit(n - 1)
                .reduce(2, (a, b) -> a * b);
    }

    private static boolean isPrime(int n) {
        return (n == 2) || IntStream.rangeClosed(2, (int) Math.sqrt(n))
                .noneMatch(i -> n % i == 0);
    }

    public static void main(String[] args) {
        IntStream.range(1, 10).forEachOrdered(x -> System.out.println(primorial(x)));
    }
    // public static void main(String[] args) {
    // int[] numbers = new int[] { 1, 2, 3, 8 };
    // int[] solutions = new int[] { 2, 6, 30, 9699690 };

    // for (int i = 0; i < solutions.length; i++) {
    // System.out.println("Your solution was: \t\t" + primorial(numbers[i]));
    // System.out.println("The expected solution is: \t" + solutions[i] + "\t\t");
    // System.out.print("Test " + (i + 1) + " was: \t\t\t");
    // System.out.println((solutions[i] == primorial(numbers[i])) + "\n");
    // }
    // }
}
