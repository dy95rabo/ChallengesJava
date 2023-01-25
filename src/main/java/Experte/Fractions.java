package main.java.Experte;

public class Fractions {
    /*
     * Repeating Decimals to Fractions
     * 
     * Performing division on a fraction often results in an infinitely repeating
     * decimal.
     * 
     * 1/3=.3333333... 1/7=.142857142857...
     * 
     * Create a function that takes a decimal in string form with the repeating part
     * in parentheses and returns the equivalent fraction in string form and in
     * lowest terms.
     * Examples
     * 
     * fractions("0.(6)") ➞ "2/3"
     * 
     * fractions("1.(1)") ➞ "10/9"
     * 
     * fractions("3.(142857)") ➞ "22/7"
     * 
     * fractions("0.19(2367)") ➞ "5343/27775"
     * 
     * fractions("0.1097(3)") ➞ "823/7500"
     * 
     * Notes
     * 
     * N/A
     */
    public static String fractions(String d) {
        int digitCountAfterDecimal = d.indexOf("(") - 1 - d.indexOf(".");
        int digitCountInRepeatingDecimal = d.substring(d.indexOf("(") + 1, d.indexOf(")")).length();
        long numerator = Long.parseLong(d.replaceAll("[.()]", ""))
                - Long.parseLong(d.substring(0, d.indexOf("(")).replaceAll("[.]", ""));
        long denominator = (pow(10,digitCountAfterDecimal + digitCountInRepeatingDecimal)
                - pow(10,digitCountAfterDecimal));
        long gcd = gcd(denominator, numerator);
        return numerator / gcd + "/" + denominator / gcd;
    }

    private static long gcd(long a, long b) {
        return (b == 0) ? a : gcd(b, a % b);
    }

    private static long pow(int base, int exponent) {
        long sol = 1;
        for (int i = 0; i < exponent; i++) {
            sol *= base;
        }
        return sol;
    }

}
