package main.java.Mittel;

public class MedianOfMergedArray {
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] mergedNums = new int[nums1.length + nums2.length];
        int i = 0, p1 = 0, p2 = 0;
        while (p1<nums1.length&&p2<nums2.length) {
            if(nums1[p1]<nums2[p2]){
                mergedNums[i++]=nums1[p1++];
            }else{
                mergedNums[i++]=nums2[p2++];
            }
        }
        while (p1<nums1.length) {
            mergedNums[i++]=nums1[p1++];
        }
        while (p2<nums2.length) {
            mergedNums[i++]=nums2[p2++];
        }
        if (mergedNums.length%2==0) {
            return (mergedNums[mergedNums.length/2]+mergedNums[mergedNums.length/2-1])/2.0;
        } else {
            return mergedNums[mergedNums.length/2];
        }
    }
}
