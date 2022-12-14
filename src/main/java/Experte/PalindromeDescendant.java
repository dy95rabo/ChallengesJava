package main.java.Experte;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class PalindromeDescendant {
    /**
     * Palindrome Descendant
     * 
     * A number may not be a palindrome, but its descendant can be. A number's
     * direct child is created by summing each pair of adjacent digits to create the
     * digits of the next number.
     * 
     * For instance, 123312 is not a palindrome, but its next child 363 is, where: 3
     * = 1 + 2; 6 = 3 + 3; 3 = 1 + 2.
     * 
     * Create a function that returns true if the number itself is a palindrome or
     * any of its descendants down to the first 2 digit number (a 1-digit number is
     * trivially a palindrome).
     * Examples
     * 
     * palindromedescendant(11211230) ➞ true
     * 11211230 ➞ 2333 ➞ 56 ➞ 11
     * 
     * palindromeDescendant(13001120) ➞ true
     * 13001120 ➞ 4022 ➞ 44
     * 
     * palindromeDescendant(23336014) ➞ true
     * 23336014 ➞ 5665
     * 
     * palindromeDescendant(11) ➞ true
     * Number itself is a palindrome.
     * 
     * Notes
     * 
     * Numbers will always have an even number of digits.
     */
    public static boolean palindromeDescendant(int num) {
        // ToDo

        // !This challenge is not phrased correctly

        return isPalindrom(num) || (num > 99 && palindromeDescendant(nextChildNumber(num)));
    }

    private static int nextChildNumber(int num) {
        return joinDigits(newDigits(getDigits(num)));
    }

    private static int[] newDigits(int[] digits) {
        int[] newDigits = new int[digits.length / 2];
        for (int i = 0; i < newDigits.length; i++) {
            newDigits[i] = digits[2 * i] + digits[2 * i + 1];
        }
        return newDigits;
    }

    private static int joinDigits(int[] digits) {
        return Integer.parseInt(IntStream.of(digits).mapToObj(String::valueOf).collect(Collectors.joining()));
    }

    private static int[] getDigits(int num) {
        return Arrays.stream(Integer.toString(num).split("")).mapToInt(Integer::parseInt).toArray();
    }

    private static boolean isPalindrom(int num) {
        return num == reverseNum(num);
    }

    private static int reverseNum(int num) {
        return Integer.parseInt(new StringBuilder(Integer.toString(num)).reverse().toString());
    }

    public static void main(String[] args) {
        palindromeDescendant(9735);
    }
}
