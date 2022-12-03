package src.main.java.Einfach;

public class BasicCalculator {
    /**
     * Basic Calculator
     * 
     * Create a function that takes two numbers and a mathematical operator + - / *
     * and will perform a calculation with the given numbers.
     * Examples
     * 
     * calculator(2, '+', 2) ➞ 4
     * 
     * calculator(2, '*', 2) ➞ 4
     * 
     * calculator(4, '/', 2) ➞ 2
     * 
     * Notes
     * 
     * If the input tries to divide by 0, return 0.
     */
    public static int calculator(int n1, char operator, int n2) {
        // Write your code here!











        
        
    }

    // public static void main(String[] args) {
    //     int[][] numbers = new int[][] { { 2, 2 }, { 10, 7 }, { 2, 16 }, { 2, 2 }, { 15, 26 }, { 2, 2 }, { 2, 0 } };
    //     char[] symbols = new char[] { '/', '-', '*', '-', '+', '+', '/' };
    //     int[] solutions = new int[] { 1, 3, 32, 0, 41, 4, 0 };

    //     for (int i = 0; i < solutions.length; i++) {
    //         System.out.println("Your solution was: \t\t" + calculator(numbers[i][0], symbols[i], numbers[i][1]));
    //         System.out.println("The expected solution is: \t" + solutions[i] + "\t\t");
    //         System.out.print("Test " + (i + 1) + " was: \t\t\t");
    //         System.out.println((calculator(numbers[i][0], symbols[i], numbers[i][1]) == solutions[i])+"\n");
    //     }

    // }



    public static int calculatorExample(int n1, char operator, int n2) {
        // advanced example code using ? operator
         return operator == '+' ? n1 + n2 : operator == '-' ? n1 - n2 : operator == '*' ? n1 * n2 : n2 == 0 ? 0 : n1 / n2;
    }
}
