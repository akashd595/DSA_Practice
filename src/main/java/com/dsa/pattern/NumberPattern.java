package com.dsa.pattern;

public class NumberPattern {

    public static void main(String[] args) {
        int n = 5;
        //    1
        //    12
        //    123
        //    1234
        //    12345
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print(j);
            }
            System.out.println();
        }
        System.out.println();System.out.println();System.out.println();
//        12345
//        1234
//        123
//        12
//        1
        for(int i = n; i >= 1; i--){
            for(int j = 1; j <= i; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
