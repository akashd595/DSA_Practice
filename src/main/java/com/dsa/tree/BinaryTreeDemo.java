package com.dsa.tree;

public class BinaryTreeDemo {
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
            System.out.println("newNode location "+side+" and index is at "+idx+" and data is "+nodes[idx]);
            if(nodes[idx] == -1){
                return null;
            }
            Node newNode = new Node(nodes[idx]);
            newNode.left = buildTree(nodes, " left");
            newNode.right = buildTree(nodes, " right");

            return newNode;
        }
    }

    public static void main(String[] args) {
        int[] node = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(node, "root");
        System.out.println(root.data);

    }
}
