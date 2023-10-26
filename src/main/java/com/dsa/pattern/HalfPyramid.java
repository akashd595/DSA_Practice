package com.dsa.pattern;

public class HalfPyramid {
//    *
//    **
//    ***
//    ****
//    *****
    public static void main(String[] args) {
        int n=5;
//    *
//    **
//    ***
//    ****
//    *****
//        for( int i = 1; i <= n; i++ ){
//            for( int j = 1; j <= n ; j++ ){
//                if( i == j || j <= i ){
//                    System.out.print("*");
//                }
//            }
//            System.out.println();
//        }
        for( int i = 1; i <= n; i++ ){
            for( int j = 1; j <= i ; j++ ){
                System.out.print("*");
            }
            System.out.println();
        }

//           *
//          **
//         ***
//        ****
        System.out.println();System.out.println();System.out.println();System.out.println();
        for( int i = 1; i <= n; i++){
            for( int j = 1; j <= n; j++){

                if( j > (n - i) ){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
