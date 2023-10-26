package com.dsa.integer;

import java.util.ArrayList;

public class SingleElementInArray {
    public static void main(String[] args) {
        int[] nums = {5};
        singleNumberInArray(nums);
    }
    //Brute Force
    public static Integer singleNumberInArray(int[] nums){
        ArrayList<Integer> numsDump = new ArrayList<>();
        int singleDigit = 0;
        if(nums.length > 1){
            for( int i = 0; i < nums.length; i++){
                if(numsDump.contains(nums[i])){

                    numsDump.remove((Integer) nums[i]);
                }else{

                    numsDump.add(nums[i]);
                }
            }
            singleDigit = numsDump.get(0);
        }else{
            singleDigit = nums[0];
        }

        System.out.println(singleDigit);
        return singleDigit;
    }
    //XOR operator
    public int singleNumber(int[] nums) {
        int ans = nums[0];
        for ( int i=1; i<nums.length; i++){
            ans = ans ^ nums[i];
        }
        return ans;
    }
}
