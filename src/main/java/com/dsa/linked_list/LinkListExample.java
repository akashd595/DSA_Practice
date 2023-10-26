package com.dsa.linked_list;

public class LinkListExample {
    Node head;
    Node tail;
    public LinkListExample(){
        this.head = null;
        this.tail = null;
    }
    class Node{
        int val;
        Node next;
        public Node(int val) {
            this.val = val;
            this.next = null;
        }
    }

    //add-first
    public void insertFirst(int val){
        Node newNode = new Node(val);
        if( head == null ){
            head = newNode;
            tail = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    //addLast
    public void insertLast(int val){
        Node newNode = new Node(val);
        if( head == null || tail == null){
            head = newNode;
            tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }
    //deleteFirstNode
    public void removeFirst(){
        if( head == null || tail == null){
            System.out.println("No Linked list----> No Node to remove");
            return;
        }
        head = head.next;
    }
    //deleteLastNode
    public void removeLast(){
        if( head == null || tail == null){
            System.out.println("No Linked list----> No Node to remove");
            return;
        }
        Node currNode = head;
        while( currNode.next != tail ){
            currNode = currNode.next;
        }
        currNode.next = null;
        tail = currNode;
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
    //searchingOfData
    public int searchNodeData( int searchValue ){
        if( head == null || tail == null ){
            System.out.println("Empty list");
            return -1;
        }
        int flag = -1;
        if( head.val == searchValue ){
            flag =  1;
        } else if( tail.val == searchValue ){
            flag = 1;
        } else{
            Node currNode = head.next;
            while( currNode != tail ){
                if( currNode.val == searchValue ){
                    flag = 1;
                    break;
                }
                currNode = currNode.next;
            }
        }
        return flag;
    }

    public static void main(String[] args) {
        LinkListExample list = new LinkListExample();
        LinkListExample list2 = new LinkListExample();

//        list.insertFirst(2);
//        list.insertFirst(4);
//        list.insertFirst(3);
//        list.printList();
        list2.insertFirst(2);
        list2.insertFirst(5);
        list2.insertFirst(9);
        list2.insertLast(10);
        list2.insertLast(20);
        list2.insertLast(22);
        list2.printList();
        list2.removeFirst();
        list2.printList();
        list2.removeLast();
        list2.printList();
//        System.out.println(list2.searchNodeData(5));
//        System.out.println(list2.searchNodeData(20));
        System.out.println(list2.searchNodeData(10));
        System.out.println(list2.searchNodeData(30));
    }
}
