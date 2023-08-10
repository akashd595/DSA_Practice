package com.dsa;

public class LinkListExample {
    static Node head;
    class Node{
        int val;
        Node next;

        public Node(int val) {
            this.val = val;
            this.next = null;
        }
    }

    //add-first
    public void addFirst(int val){
        Node newNode = new Node(val);
        if( head == null ){
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    //addLast
    public void addLast(int val){
        Node newNode = new Node(val);
        if( head == null ){
            head = newNode;
            return;
        }
        Node currNode = head;
        while(currNode.next!=null){
            currNode = currNode.next;
        }
        currNode.next = newNode;
    }
    //print-List
    public void printList(){
        if(head == null){
            System.out.println("Empty list");
            return;
        }
        Node currNode = head;
        while (currNode != null){
            System.out.print(currNode.val+"=>");
            currNode = currNode.next;
        }
        System.out.println("Null");
    }


    public static void main(String[] args) {
        LinkListExample list = new LinkListExample();
        LinkListExample list2 = new LinkListExample();

        list.addFirst(2);
        list.addFirst(4);
        list.addFirst(3);
        list.printList();

    }

}
