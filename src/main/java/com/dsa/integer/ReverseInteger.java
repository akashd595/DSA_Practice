package com.dsa.integer;

public class ReverseInteger {
    public static void main(String[] args) {
        System.out.println(reverse(-2147483412));
        System.out.println(reverse(2147483647));
        System.out.println(reverse(2147483647));
    }
    public static int reverse(int x) {
        System.out.println(x);
        boolean isNeg = false;
        int reverseInt = 0;
        if(x < 0){
            isNeg = true;
            x = x * (-1);
        }
//        if( x > 999999999  ){
//            System.out.println("greater");
//            return 0;
//        }
        while( x > 0 ){
            System.out.println(x);
            System.out.println(reverseInt);
            reverseInt = reverseInt * 10 + x % 10;
            x = x / 10;

        }
        if( isNeg ){
            reverseInt = reverseInt * (-1);
        }

//2147483648
        if( reverseInt > 2147483647 || reverseInt < -2147483647){
            return 0;
        }
        //2147483647
        //-2147483648
        return 0;
    }
}
