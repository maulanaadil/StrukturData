package com.LatihanStrukturData.BinarySearchTree;

public class InsertNode {

    class Node {
        int id;
        Object data;
        Node right, left;

        Node(int id, Object data){
            this.id = id;
            this.data = data;
        }
    }

    Node root = null;

    public void insert(int id, Object data){
        Node newest = new Node(id,data);

        if (root == null){
            root = newest;
        } else {
            insert(root, newest);
        }
    }

    private void insert(Node subroot, Node newest){
        if (newest.id < subroot.id){
            if (subroot.left == null) subroot.left = newest;
            else insert(subroot.left, newest);
        } else {
            if (subroot.right == null) subroot.right = newest;
            else insert(subroot.right, newest);
        }
    }

    public void print(){
        preorder(root);
    }

    private void preorder(Node subroot){
        if (subroot != null){
            System.out.println(subroot.id);
            preorder(subroot.left);
            preorder(subroot.right);
        }
    }

    public static void main(String[] args) {
        InsertNode in = new InsertNode();
        in.insert(89,89);
        in.insert(60,60);
        in.insert(91,91);
        in.insert(57,57);
        in.insert(63,63);
        in.insert(100,100);
        in.insert(10,10);
        in.print();
    }
}
