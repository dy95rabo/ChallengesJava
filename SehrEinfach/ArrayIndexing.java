public class ArrayIndexing {

    /**
     * Array Indexing
     * 
     * Given an array and an index, return the value of the array with the given
     * index.
     * Examples
     * 
     * valueAt([1, 2, 3, 4, 5, 6], 10 / 2) ➞ 6
     * 
     * valueAt([1, 2, 3, 4, 5, 6], 8 / 2) ➞ 5
     * 
     * valueAt([1, 2, 3, 4], 6.535355314 / 2) ➞ 4
     * 
     * Notes
     * 
     * Math.floor() or casting can be helpful.
     * 
     */

    public static int valueAt(int[] arr, double index) {
        // Write your code here!

        
    }

    public static void main(String[] args) {
        int[][] numbers = new int[][] {
                { 1, 2, 3, 4, 5, 6 },
                { 1, 2, 3, 4 },
                { 1, 2 },
                { 1, 2, 3, 4, 5, 6 },
                { 1, 2, 3, 7, 9 },
                { 1, 2, 3, 4, 5, 6, 8, 10, 12, 14 },
                { 1, 2, 3, 4, 5, 7, 9, 11, 13, 15 },
                { 0, 2, 4, 6, 8, 10, 11, 13, 15, 17, 19 },
                { 1, 2, 3, 4, 5, 6 },
                { 2, 4, 6, 8, 10, 12, 14, 16, 18, 20 }
        };
        double[] index = new double[] { 10 / 2, 6.535355314 / 2, 1 / 2, 8 / 2, 9 / 2, 466.6 / 54.4, 46.6 / 5.4, 46 / 5,
                6.46654414344 / 2, 466.6 / 54.4 };
        int[] solutions = new int[] { 6, 4, 1, 5, 9, 12, 13, 17, 4, 18 };

        for (int i = 0; i < solutions.length; i++) {

            System.out.println("Your solution was: \t\t" + valueAt(numbers[i], index[i]));
            System.out.println("The expected solution is: \t" + solutions[i] + "\t\t");
            System.out.print("Test " + (i + 1) + " was: \t\t\t");
            System.out.println((valueAt(numbers[i], index[i]) == solutions[i]) + "\n");
        }

    }

}
