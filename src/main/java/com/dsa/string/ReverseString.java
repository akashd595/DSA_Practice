package com.dsa.string;

public class ReverseString {
//    Write a function that reverses a string. The input string is given as an array of characters s.
//    You must do this by modifying the input array in-place with O(1) extra memory.

    //    Example 1:
//    Input: s = ["h","e","l","l","o"]
//    Output: ["o","l","l","e","h"]
//    Example 2:
//
//    Input: s = ["H","a","n","n","a","h"]
//    Output: ["h","a","n","n","a","H"]
    public static void main(String[] args) {
        String[] strArr = {"h","e"};
        reversedString(strArr);
    }
    public static String[] reversedString(String[] strArr){

        int left=0, right = strArr.length-1;
        String temp = "";
        for( String str : strArr ){
            System.out.print(str);
        }
        System.out.println();
        while( left < right ){
            temp = strArr[left];
            strArr[left] = strArr[right];
            strArr[right] = temp;

            left++;
            right--;
        }
        System.out.println("revered");
        for( String str : strArr ){
            System.out.print(str);
        }
        return null;
    }
}
