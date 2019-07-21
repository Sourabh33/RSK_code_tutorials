package com.rsktutorials.bst;

import com.rsktutorials.printcode.BinaryTreePrinter;

public class BST {

    Node rootNode;

    BST(){
        rootNode = null;
    }


    public void insert(int value) {
        rootNode = insert(value, rootNode);
    }

    private Node insert(int value, Node node) {
        if(node == null){
            node = new Node(value);
        } else if(value <= node.data){
            node.leftNode = insert(value, node.leftNode);
        } else { // value > node.data
            node.rightNode = insert(value, node.rightNode);
        }
        return node;
    }

    public void printBst(){
        BinaryTreePrinter.print(this.rootNode);
    }
}
