package test.java.Mittel;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import main.java.Mittel.MedianOfMergedArray;

public class MedianOfMergedArrayTest {
    @Test
    public void testFindMedianSortedArrays() {
        double expectedSolution = 2.0;
        int[] nums1 = new int[]{1,2,3};
        int[] nums2 = new int[]{1,3};
        double actualSolution = MedianOfMergedArray.findMedianSortedArrays(nums1, nums2);
        assertEquals(expectedSolution, actualSolution,0.02);
    }
}
