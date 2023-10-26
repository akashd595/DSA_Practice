package com.dsa.oct17;

public class PrintFriendsNames {
    public static void main(String[] args) {
        String[] friendList = {"Mahesh","Suresh","Devesh"};
        System.out.println(displayMsg(friendList));
    }
    public static String displayMsg(String[] friendList){
        String msg = "Hi";
        for(int i=friendList.length-1; i>0; i--){
            if(i == 1){
                msg = msg + ", " + friendList[i] ;
            }else
                msg = msg + " " + friendList[i] ;
        }
        msg = msg + " and " + friendList[0];


        return msg;
    }
}
