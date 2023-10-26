package com.dsa.pattern.advance;

public class butterfly {
    public static void main(String[] args) {
        butterflyPattern(5);
    }
//    *      *
//    **    **
//    ***  ***
//    ********
//    ********
//    ***  ***
//    **    **
//    *      *
    public static void butterflyPattern(int num){
        for(int i = 1; i <= num; i++){
//            int forLimit = i ;
            for (int j = 1; j <= num; j++){
                if( j <= i){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            for(int j = num ; j >= 1; j--){
                if( j <= i){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        for(int i = num; i >= 1; i--){
//            int forLimit = i ;
            for (int j = 1; j <= num; j++){
                if( j <= i){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            for(int j = num ; j >= 1; j--){
                if( j <= i){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
