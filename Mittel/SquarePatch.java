import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class SquarePatch {

    /**
     * Perfect Square Patch
     * 
     * Create a function that takes an integer and outputs an n x n square solely
     * consisting of the integer n.
     * Examples
     * 
     * squarePatch(3) ➞ [
     * [3, 3, 3],
     * [3, 3, 3],
     * [3, 3, 3]
     * ]
     * 
     * squarePatch(5) ➞ [
     * [5, 5, 5, 5, 5],
     * [5, 5, 5, 5, 5],
     * [5, 5, 5, 5, 5],
     * [5, 5, 5, 5, 5],
     * [5, 5, 5, 5, 5]
     * ]
     * 
     * squarePatch(1) ➞ [
     * [1]
     * ]
     * 
     * squarePatch(0) ➞ []
     * 
     * Notes
     * 
     * n >= 0.
     * If n = 0, return an empty array.
     */
    public static int[][] squarePatch(int n) {
        // Write your code here!
       
        




    }




    public static void main(String[] args) {
        int[] numbers = new int[] { 3, 2, 4, 6, 5, 0 };
        int[][][] solutions = new int[][][] {
                {
                        { 3, 3, 3 },
                        { 3, 3, 3 },
                        { 3, 3, 3 }
                },
                {
                        { 2, 2 },
                        { 2, 2 }
                },
                {
                        { 4, 4, 4, 4 },
                        { 4, 4, 4, 4 },
                        { 4, 4, 4, 4 },
                        { 4, 4, 4, 4 }
                },
                {
                        { 6, 6, 6, 6, 6, 6 },
                        { 6, 6, 6, 6, 6, 6 },
                        { 6, 6, 6, 6, 6, 6 },
                        { 6, 6, 6, 6, 6, 6 },
                        { 6, 6, 6, 6, 6, 6 },
                        { 6, 6, 6, 6, 6, 6 }
                },
                {
                        { 5, 5, 5, 5, 5 },
                        { 5, 5, 5, 5, 5 },
                        { 5, 5, 5, 5, 5 },
                        { 5, 5, 5, 5, 5 },
                        { 5, 5, 5, 5, 5 }
                },
                {}

        };

        for (int i = 0; i < solutions.length; i++) {
            List<List> listSquarePatch = new ArrayList<>();
            List<List> listSolution = new ArrayList<>();
            int[][] squarePatch = squarePatch(numbers[i]);
            for (int j = 0; j < solutions[i].length; j++) {
                listSquarePatch.add(IntStream.of(squarePatch[j]).boxed().toList());
                listSolution.add(IntStream.of(solutions[i][j]).boxed().toList());
            }

            System.out.println("Your solution was: \n[");
            listSquarePatch.forEach(x-> System.out.println("   "+x));
            System.out.println("]");
            System.out.println("The expected solution is: \n[");
            listSolution.forEach(x-> System.out.println("   "+x));
            System.out.println("]");
            


            boolean check = true;
            for (int j = 0; j < solutions[i].length; j++) {
                if(!Arrays.equals(solutions[i][j], squarePatch[j])){
                    check = false;
                    break;
                }
            }
            System.out.println("Test " + (i + 1) + " was: \t" + check);
            System.out.println("_".repeat(70));
        }
    }

}