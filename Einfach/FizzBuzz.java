

public class FizzBuzz {

    /**
     * FizzBuzz Interview Question
     * 
     * Create a function that takes a number as an argument and returns "Fizz",
     * "Buzz" or "FizzBuzz".
     * 
     * If the number is a multiple of 3 the output should be "Fizz".
     * If the number given is a multiple of 5, the output should be "Buzz".
     * If the number given is a multiple of both 3 and 5, the output should be
     * "FizzBuzz".
     * If the number is not a multiple of either 3 or 5, the number should be output
     * on its own as shown in the examples below.
     * The output should always be a string even if it is not a multiple of 3 or 5.
     * 
     * Examples
     * 
     * fizzBuzz(3) ➞ "Fizz"
     * 
     * fizzBuzz(5) ➞ "Buzz"
     * 
     * fizzBuzz(15) ➞ "FizzBuzz"
     * 
     * fizzBuzz(4) ➞ "4"
     * 
     * Notes
     * 
     * Try to be precise with how you spell things and where you put the capital
     * letters
     */

    public static String fizzBuzz(int n) {
        // advanced example code using ? operator
        // return (n % 3 == 0 ? "Fizz" : "") + (n % 5 == 0 ? "Buzz" : "") + (n % 3 != 0 && n % 5 != 0 ? Integer.toString(n) : "");
       
        // Write your code here!


    }

    public static void main(String[] args) {
        int[] numbers = new int[] { 3, 5, 15, 10, 98 };
        String[] solutions = new String[] { "Fizz", "Buzz", "FizzBuzz", "Buzz", "98" };

        for (int i = 0; i < solutions.length; i++) {
            System.out.println("Your solution was: \t\t" + fizzBuzz(numbers[i]));
            System.out.println("The expected solution is: \t" + solutions[i] + "\t\t");
            System.out.print("Test " + (i + 1) + " was: \t\t\t");
            System.out.println((fizzBuzz(numbers[i]).equals(solutions[i]))+"\n");

        }

    }
}
