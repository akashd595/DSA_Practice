package com.dsa.arrays;

public class FindMedianOfTwoSortedArrays {
    public static void main(String[] args) {
        int[] num1 = {1,2,3,4};
        int[] num2 = {5,6};
        findMedianSortedArrays(num1, num2);
    }
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {

        double median;
        int[] mergedArray = new int[nums1.length + nums2.length];
        int mergeArrayLength = nums1.length + nums2.length;
        int i = 0, j= 0, z=0;

        while(  z < mergeArrayLength){

            if( ( i < nums1.length) && ( j < nums2.length) && nums1[i] < nums2[j] ){
                mergedArray[z] = nums1[i];
                i++;
            }else if(  j == nums2.length ){
                mergedArray[z] = nums1[i];
                i++;
            }else if(  i == nums1.length ){
                mergedArray[z] = nums2[j];
                j++;
            }else{
                mergedArray[z] = nums2[j];
                j++;
            }
            z++;
        }
        if( ( nums1.length + nums2.length ) % 2 == 0 ){
            median = mergedArray[mergeArrayLength / 2] + mergedArray[ ( mergeArrayLength / 2 ) - 1 ];
            median = median / 2;
        }else{
            median = mergedArray[ mergeArrayLength / 2  ];
        }
        System.out.println("median "+median);

        return median;
    }
}