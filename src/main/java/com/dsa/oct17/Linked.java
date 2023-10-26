package com.dsa.oct17;

class Node{
    String value;
    Node next;

    Node(){}
    Node(String value){
        this.value = value;
        this.next = null;
    }
}
public class Linked {

    Node head;
    Node tail;
    Linked(){
        head = null;
    }
    public void addNodeOnlast(String data){

        Node node =new Node(data);
        Node tempNode = head;
        if(head == null){
            head = node;
            tail = node;
        }else{
            while( tempNode.next != null ){
                tempNode = tempNode.next;
            }
            tempNode.next = node;
            tail = node;
        }
    }
    public void traverseLL(){

        if(head == null){
            System.out.println("No data in LinkedList");
        }else{
            Node node = head;
            while( node.next != null ){
                System.out.print("--> "+node.value );
                node = node.next;
            }
            System.out.println("--> "+node.value );
        }
    }
    public void printTailValue(){
        if(tail == null){
            System.out.println("Null value found ");
        }else{
            System.out.println("Tail value is "+tail.value);
        }
    }
    public void deleteLast(){
        Node temp = head;
        if(temp == null){
            System.out.println("no data found");
        }else{
            while( temp.next != tail ){
                temp = temp.next;
            }
            System.out.println(temp.value);
            temp.next = null;
            tail = temp;
        }
    }


    public static void main(String[] args) {
        Linked ll = new Linked();
//        ll.traverseLL();
        ll.addNodeOnlast("akash");
        ll.addNodeOnlast("badal");
        ll.addNodeOnlast("vivek");
        ll.addNodeOnlast("vishal");
        ll.addNodeOnlast("badal");

        ll.printTailValue();
        ll.deleteLast();
        ll.printTailValue();
    }
}
