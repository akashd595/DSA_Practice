package com.dsa.arrays;

public class CumulativeSum {
    //The cumulative sum of an array at index i is defined as the sum of all elements
    // of the array from index 0 to index i.
    //    Examples
    //    Initial Array: [1, 2, 3, 4]
    //    Cumulative Sum: [1, 3, 6, 10]
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        int res[] = getCumulativeSum(arr);
        for(int i : res){
            System.out.println(i);
        }
    }
    public static int[] getCumulativeSum (int[] arr) {
        int[] resultArray = new int[arr.length];

        int nextVal = 0;
        int counter = 0;
        for(int i : arr){
            nextVal += i;
            resultArray[counter++] = nextVal;
        }
        return resultArray;
    }
}
