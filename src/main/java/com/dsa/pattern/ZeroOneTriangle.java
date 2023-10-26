package com.dsa.pattern;

public class ZeroOneTriangle {
    public static void main(String[] args) {
//        1
//        0 1
//        1 0 1
//        0 1 0 1
//        1 0 1 0 1
        int n=5, counter=1;
        for ( int i = 1; i <= n ; i++){
            if( i % 2 == 0){
                counter = 0;
            }else{
                counter = 1;
            }
            for ( int j = 1; j <= i; j++){
                System.out.print(counter + " ");
                if(counter == 1){
                    counter = 0;
                }else counter = 1;
            } System.out.println();
        }
    }
}
