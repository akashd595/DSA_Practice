package com.dsa;

import java.sql.Array;
import java.util.ArrayList;

public class August01 {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(32);
        arr.add(120);
        arr.add(32);
        arr.add(72);
        System.out.println("Actual array "+arr);
        callBackMethod(arr);
    }
    public static void callBackMethod(ArrayList<Integer> arr){
        ArrayList<Integer> resultArray = new ArrayList<>();
        int index = 0;
        resultArray.add(arr.get(0));
        for(int i=0; i<arr.size()-1; i++){
//            System.out.println("arr.get(i) "+arr.get(i)+" arr.get(i+1) "+arr.get(i+1));
            if( resultArray.get(i) <= arr.get(i+1) ){
                int tempValue = findFactorials(arr.get(i+1),resultArray.get(i));
                resultArray.add(tempValue);
            }else{

                System.out.println("Strickly not posible ");
                resultArray.clear();
                return;
            }
        }
        System.out.println("result Array "+resultArray);

    }
    public static Integer findFactorials(Integer num, Integer prevNum) {
        boolean flag = true;
        int index = 2;
        int returnBalue = 0;
        while( flag ){//1-2-4-16

            if( num % index == 0 ){

                int temp = num;
                temp = temp / 2;
                if( temp <= prevNum ) {
                    flag = false;
                    returnBalue = num;
                }
                num = temp;//4
            } else if (index > num) {
                flag = false;
                returnBalue = num;
            }
            index++;

        }
        return returnBalue;
    }
}
