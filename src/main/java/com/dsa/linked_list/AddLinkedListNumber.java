package com.dsa.linked_list;

import java.util.LinkedList;

public class AddLinkedListNumber {
    public static void main(String[] args) {
        LinkedList<Integer> list1 = new LinkedList<Integer>();
        list1.add(2);
        list1.add(4);
        list1.add(3);
        LinkedList<Integer> list2 = new LinkedList<Integer>();
        list2.add(5);
        list2.add(6);
        list2.add(4);


        LinkedList<Integer> list3 = new LinkedList<Integer>();
        list3.add(9);
        list3.add(9);
        list3.add(9);
        list3.add(9);
        list3.add(9);
        list3.add(9);
        list3.add(9);
        LinkedList<Integer> list4 = new LinkedList<Integer>();
        list4.add(9);
        list4.add(9);
        list4.add(9);
        list4.add(9);

        LinkedList<Integer> list5 = new LinkedList<Integer>();
        list5.add(0);
        LinkedList<Integer> list6 = new LinkedList<Integer>();
        list6.add(0);

        addTwoNumbers(list5, list6);
    }
    public static LinkedList<Integer> addTwoNumbers(LinkedList<Integer> l1, LinkedList<Integer> l2) {
        LinkedList<Integer> resultLL = new LinkedList<Integer>();

        int val1 = 0;
        int val2 = 0;
        for(int i= l1.size()-1; i>=0; i--){
            val1 = (val1 * 10) + l1.get(i);
        }
        for(int i= l2.size()-1; i>=0; i--){
            val2 = (val2 * 10) + l2.get(i);
        }
        int result = val1 + val2;

        while(result > 0){
            int resLL = result % 10 ;
            result /= 10;
            resultLL.add(resLL);
        }
        if(resultLL.isEmpty()){
            resultLL.add(0);
        }
        System.out.println(resultLL);
        return resultLL;
    }
}
