package com.dsa;

import java.util.ArrayList;

public class AugustMonth {
    public static void main(String[] args) {

        System.out.println( repeatedString("abcbcefgg") );
    }
    public static ArrayList<Character> repeatedString(String str){
        int index = 0;
        ArrayList<Character> oneTime = new ArrayList<>();
        ArrayList<Character> repeatedCharacters = new ArrayList<>();
        while( index++ < str.length()-1 ){

            if( oneTime.contains(str.charAt(index) ) ){
                System.out.println("repeated character "+str.charAt(index));
              repeatedCharacters.add(str.charAt(index));
            }else{
                oneTime.add(str.charAt(index));
            }
        }
        return repeatedCharacters;
    }
    public static ListNode insertFirst(int val){
        ListNode l1 = null;
        for(int i=0; i<3; i++){
            System.out.println(i);
            l1 = new ListNode(val);
        }
        return l1;

    }
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        return null;
    }
}
class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
