package main.java.Experte;

import java.util.LinkedList;

public class AscendingConsecutiveNumbers {
    /**
     * 
     * Ascending Consecutive Numbers
     * 
     * Write a function that returns true if a string consists of
     * ascending AND consecutive numbers.
     * Examples
     * 
     * ascending("232425") ➞ true
     * // Consecutive numbers 23, 24, 25
     * 
     * ascending("2324256") ➞ false
     * // No matter how this string is divided, the numbers are not consecutive.
     * 
     * ascending("444445") ➞ true
     * // Consecutive numbers 444 and 445.
     * 
     * Notes
     * 
     * A number can consist of any number of digits, so long as the numbers are
     * adjacent to each other, and the string has at least two of them.
     * 
     */

    public static boolean ascending(String str) {
		//ToDo




















        
    }
    
    
}

// for (int i = 1; i <= str.length()/2; i++) {
//     long num1 = Integer.parseInt(str.substring(0, i));
//     String tmp = "";
//     while (tmp.length()<str.length()) {
//         tmp+=Long.toString(num1);
//         num1++;
//     }
//     if(str.equals(tmp)){
//         return true;
//     }
// }
// return false;