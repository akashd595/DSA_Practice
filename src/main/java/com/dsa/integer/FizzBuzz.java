package com.dsa.integer;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {
    public static void main(String[] args) {
        String arr[] = {"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15"};
        arr = fizzBuzz(arr);
        for(String output : arr){
            System.out.print(output+" ");
        }
        System.out.println();
        fizzBuzzList(15);
    }
    public static String[] fizzBuzz(String[] arr){

        for( int i = 0; i < arr.length; i++ ){
            if( ( i + 1 ) % 3 == 0 && ( i + 1 ) % 5 == 0 ){
                arr[i] = "FizzBuzz";
            }else if( ( i + 1 ) % 3 == 0  ){
                arr[i] = "Fizz";
            }else if( ( i + 1 ) % 5 == 0  ){
                arr[i] = "Buzz";
            }
        }

        return arr;
    }
    public static List<String> fizzBuzzList(int n) {
        List<String> fizzList = new ArrayList<>();
        for( int i = 1 ; i <= n; i++){
            if( ( i ) % 3 == 0 && ( i ) % 5 == 0 ){
                fizzList.add("FizzBuzz");
            }else if( ( i  ) % 3 == 0  ){
                fizzList.add("Fizz");
            }else if( ( i  ) % 5 == 0  ){
                fizzList.add("Buzz");
            }else{
                fizzList.add(""+i+"");
            }
        }
        System.out.println(fizzList);
        return fizzList;
    }
}
