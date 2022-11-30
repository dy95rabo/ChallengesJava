package Challenges.SehrEinfach;

public class ConvertMinutesToSeconds {
    /**
     * Convert Minutes into Seconds
     * 
     * Write a function that takes an integer minutes and converts it to seconds.
     * Examples
     * 
     * convert(5) ➞ 300
     * 
     * convert(3) ➞ 180
     * 
     * convert(2) ➞ 120
     * 
     * Notes
     * 
     * Don't forget to return the result.
     */
    public static int convert(int minutes) {
        // Write your code here!
        
    }

    public static void main(String[] args) {
        int[] minutes = new int[] { 6, 4, 8, 60 };
        int[] solutions = new int[] { 360, 240, 480, 3600 };

        for (int i = 0; i < solutions.length; i++) {

            System.out.println("Your solution was: \t\t" + convert(minutes[i]));
            System.out.println("The expected solution is: \t" + solutions[i] + "\t\t");
            System.out.print("Test " + (i + 1) + " was: \t\t\t");
            System.out.println((convert(minutes[i]) == solutions[i])+"\n");
        }

    }

}
