package main.java.Experte;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class GenerateConsecutiveBinaryNumbers {

    /*
     * Generate All Nonconsecutive Binary Strings
     * 
     * Create a function to generate all nonconsecutive binary strings where
     * nonconsecutive is defined as a string where no consecutive ones are present,
     * and where n governs the length of each binary string.
     * Examples
     * 
     * generateNonconsecutive(1) ➞ "0 1"
     * 
     * generateNonconsecutive(2) ➞ "00 01 10"
     * 
     * generateNonconsecutive(3) ➞ "000 001 010 100 101"
     * 
     * generateNonconsecutive(4) ➞ "0000 0001 0010 0100 0101 1000 1001 1010"
     * 
     * Notes
     * 
     * N/A
     */

     public static String generate(int n) {
		return IntStream.range(0, pow(2,n)).mapToObj(x->int2Binary(x,n)).filter(s->!s.contains("11")).collect(Collectors.joining(" "));
     }

    private static int pow(int base, int exponent) {
        int sol = 1;
        for (int j = 0; j < exponent; j++) {
            sol*=base;
        }
        return sol;
    }

    private static String int2Binary(int num,int numOfDigits){
        StringBuilder sb = new StringBuilder();
        sb.append(Integer.toBinaryString(num));
        for (int i = sb.length(); i < numOfDigits; i++) {
            sb.insert(0, 0);
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(generate(10));
    }
}
