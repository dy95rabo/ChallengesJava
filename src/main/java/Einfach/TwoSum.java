package main.java.Einfach;

import java.util.HashMap;

public class TwoSum {
    

    public static int[] twoSum(int[] arr, int target){
        HashMap<Integer,Integer> differenceIndex = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            int difference = target-arr[i];
            Integer index = differenceIndex.get(arr[i]);
            if (index != null) {
                return new int[]{index, i};
            }else{
                differenceIndex.put(difference, i);
            }
        }
        return new int[0];
    }

    public static void main(String[] args) {
        twoSum(new int[]{2,7,11,15}, 9);
    }
    // public static int[] twoSum(int[] arr, int target){
    //     for (int i = 0; i < arr.length-1; i++) {
    //         for (int j = i+1; j < arr.length; j++) {
    //             if(arr[i]+arr[j]==target){
    //                 return new int[]{i,j};
    //             }
    //         }
    //     }
    //     return new int[0];
    // }
}
