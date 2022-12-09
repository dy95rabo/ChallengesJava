package main.java.Experte;

import java.util.LinkedList;

public class BellNumber {
    /**
     * 
     * Bell Number
     * 
     * The Bell number is the number of ways an array of n items can be partitioned
     * into non-empty subarrays. See the resources section for an in-depth
     * explanation.
     * 
     * Create a function that takes a number n and returns the corresponding Bell
     * number.
     * Examples
     * 
     * bell(1) ➞ 1
     * sampleArr = [1]
     * possiblePartitions = [[[1]]]
     * 
     * bell(2) ➞ 2
     * sampleArr = [1, 2]
     * possiblePartitions = [[[1, 2]], [[1], [2]]]
     * 
     * bell(3) ➞ 5
     * sampleArr = [1, 2, 3]
     * possiblePartitions = [[[1, 2, 3]], [[1, 2], [3]], [[1], [2, 3]], [[1, 3],
     * [2]], [[1], [2], [3]]]
     * 
     * Notes
     * 
     * N/A
     * 
     */

    public static int bell(int n) {
        // ToDo
        LinkedList<Integer> topRow = new LinkedList<>();
        topRow.add(1);
        for (int i = 0; i < n-1; i++) {
            LinkedList<Integer> bottomRow = new LinkedList<>();
            bottomRow.add(topRow.getLast());
            for (int j = 0; j < topRow.size(); j++) {
                bottomRow.add(bottomRow.get(j)+topRow.get(j));
            }
            topRow = bottomRow;
        }
        return topRow.getLast();
    }

}
