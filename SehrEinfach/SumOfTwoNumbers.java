

public class SumOfTwoNumbers {
    /**
     * Return the Sum of Two Numbers
     * 
     * Create a method that takes two integers as arguments and returns their sum.
     * Examples
     * 
     * SumOfTwoNumbers(3, 2) ➞ 5
     * 
     * SumOfTwoNumbers(-3, -6) ➞ -9
     * 
     * SumOfTwoNumbers(7, 3) ➞ 10
     * 
     * Notes
     * 
     * Don't forget to return the result.
     * If you get stuck on a challenge, find help in the Resources tab.
     * If you're really stuck, unlock solutions in the Solutions tab.
     */
    public static int sum(int a, int b) {
        // Write your code here!
        



        
    }

    public static void main(String[] args) {
        int[][] numbers = new int[][] { { 3, 2 }, { -3, -6 }, { 7, 3 } };
        int[] solutions = new int[] { 5, -9, 10 };

        for (int i = 0; i < solutions.length; i++) {

            System.out.println("Your solution was: \t\t" + sum(numbers[i][0],numbers[i][1]));
            System.out.println("The expected solution is: \t" + solutions[i] + "\t\t");
            System.out.print("Test " + (i + 1) + " was: \t\t\t");
            System.out.println((sum(numbers[i][0],numbers[i][1]) == solutions[i])+"\n");
        }

    }

}