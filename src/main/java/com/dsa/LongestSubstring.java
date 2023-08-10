package com.dsa;

public class LongestSubstring {
    public static void main(String[] args) {
        System.out.println("abcabcabb "+lon("abcabcabb"));
        System.out.println(" "+lon(" "));
        System.out.println("abcd "+lon("abcd"));
    }
    public static int lon(String str){

        int longest = 1;
        int newPosition = 0;
        boolean counter = false;
        if("".equals(str) ){
            return 0;
        }if(" ".equals(str)){
            return longest;
        }
        for(int i=0; i<=str.length()-1; i++){

            newPosition = i;
            for( int j=i+1; j<=str.length()-1; j++ ){
                if( str.charAt(i) == str.charAt(j) ){
                    counter = true;
                    if(longest < (j-newPosition)){
                        longest = j-newPosition;
                    }
                    newPosition = j;
                }
            }
        }
        if( ( str.length() > 1 ) && ( longest == 1 ) && counter ){
            longest = str.length();
        }

        return longest;
    }
}
