package com.dsa;

//Given an array of integers nums and an integer target, return indices of the two numbers such that they add
// up to target.
//You may assume that each input would have exactly one solution, and you may not use the same element twice.
//You can return the answer in any order.
public class FindIndices {
    public static void main(String[] args) {

        int[] nums = {3,2,4};
        int target = 6;
        int index = 0;

        while(index < nums.length-1){
            for(int i=0; i< nums.length; i++){
                if( i != index && ( nums[i] + nums[index] == target ) ){
                    System.out.println("Position Found "+index+" and "+i);
                }
            }
            index++;
        }
        int[] arrays = twoSum(nums, target);
        System.out.println("arrays "+arrays[0]+" + "+arrays[1]);

    }
    public static int[] twoSum(int[] nums, int target) {
        int index = 0;
        int [] returnArr = new int[2];
        while(index < nums.length-1){
            for(int i=0; i< nums.length; i++){
                if( i != index && ( nums[i] + nums[index] == target ) ){
//                    System.out.println("Position Found "+index+" and "+i);
                    returnArr[0] = i;
                    returnArr[1] = index;
                    return returnArr;
                }
            }
            index++;
        }
        return returnArr;
    }
}
