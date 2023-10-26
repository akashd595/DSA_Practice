package com.dsa.tree;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTreePractice {
    public static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    static class BinaryTree{
        static int idx = -1;
        public static Node buildTree(int nodes[], String side){

            idx++;
//            System.out.println("newNode location "+side+" and index is at "+idx+" and data is "+nodes[idx]);
            if(nodes[idx] == -1){
                return null;
            }
            Node newNode = new Node(nodes[idx]);
            newNode.left = buildTree(nodes, " left");
            newNode.right = buildTree(nodes, " right");

            return newNode;
        }
    }
    public static void traverseTreePreOrder(Node root, String side){

        if(root == null){
            return;
        }
        System.out.print("-->"+root.data);

        traverseTreePreOrder(root.left, "left");
        traverseTreePreOrder(root.right, "right");
    }
    public static void traverseTreeInOrder(Node root){
        if( root == null ) {
            return;
        }
        traverseTreeInOrder(root.left);
        System.out.print(root.data+" ");
        traverseTreeInOrder(root.right);

    }
    public static void traverseTreePostOrder( Node root ) {
        if( root == null )
            return;

        traverseTreePostOrder(root.left);
        traverseTreePostOrder(root.right);
        System.out.print(root.data+" ");
    }
    public static void levelOrder( Node root ) {
        if( root == null ){
            System.out.println("Empty Tree cannot be traverse");
            return;
        }
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        queue.add(null);

        while( !queue.isEmpty() ){
            Node currNode = queue.remove();
            if( currNode == null ){
                System.out.println();
                if(queue.isEmpty()){
                    break;
                }else{
                    queue.add(null);
                }
            }else{
                System.out.print(currNode.data+" ");
                if( currNode.left != null ){
                    queue.add(currNode.left);
                }
                if( currNode.right != null ){
                    queue.add(currNode.right);
                }
            }
        }

    }

    public static void main(String[] args) {
        int[] node = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(node, "root");
        System.out.println();
        System.out.println("preorder");
        traverseTreePreOrder(root, "root");
        System.out.println();
        System.out.println("inorder");
        traverseTreeInOrder(root);
        System.out.println();
        System.out.println("postOrder");
        traverseTreePostOrder(root);
        System.out.println();
        System.out.println("LevelOrder");
        levelOrder(root);
        System.out.println();
    }
}
