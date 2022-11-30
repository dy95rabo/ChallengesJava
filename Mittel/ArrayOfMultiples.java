
import java.util.Arrays;
import java.util.stream.IntStream;

public class ArrayOfMultiples {
    /**
     * Array of Multiples
     * 
     * Create a function that takes two numbers as arguments (num, length) and
     * returns an array of multiples of num until the array length reaches length.
     * Examples
     * 
     * arrayOfMultiples(7, 5) ➞ [7, 14, 21, 28, 35]
     * 
     * arrayOfMultiples(12, 10) ➞ [12, 24, 36, 48, 60, 72, 84, 96, 108, 120]
     * 
     * arrayOfMultiples(17, 6) ➞ [17, 34, 51, 68, 85, 102]
     * 
     * Notes
     * 
     * Notice that num is also included in the returned array.
     * 
     * @param num
     * @param length
     * @return
     */
    public static int[] arrayOfMultiples(int num, int length) {
        // Write your code here!

    }

    public static void main(String[] args) {
        int[] numbers = new int[] { 7, 12, 17, 630, 140, 7, 11 };
        int[] lengths = new int[] { 5, 10, 7, 14, 3, 8, 21 };
        int[][] solutions = new int[][] {
                { 7, 14, 21, 28, 35 },
                { 12, 24, 36, 48, 60, 72, 84, 96, 108, 120 },
                { 17, 34, 51, 68, 85, 102, 119 },
                { 630, 1260, 1890, 2520, 3150, 3780, 4410, 5040, 5670, 6300, 6930, 7560, 8190, 8820 },
                { 140, 280, 420 },
                { 7, 14, 21, 28, 35, 42, 49, 56 },
                { 11, 22, 33, 44, 55, 66, 77, 88, 99, 110, 121, 132, 143, 154, 165, 176, 187, 198, 209, 220, 231 }
        };

        for (int i = 0; i < solutions.length; i++) {
            System.out.println("Your solution was: \t\t"
                    + IntStream.of(arrayOfMultiples(numbers[i], lengths[i])).boxed().toList());
            System.out.println("The expected solution is: \t" + IntStream.of(solutions[i]).boxed().toList() + "\t\t");
            System.out.print("Test " + (i + 1) + " was: \t\t\t");
            System.out.println(Arrays.equals(arrayOfMultiples(numbers[i], lengths[i]), solutions[i]) + "\n");
        }
    }

}
