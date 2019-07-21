package com.rsktutorials.bst;

import com.rsktutorials.printcode.PrintableNode;

public class Node implements PrintableNode{
   int data;
   Node leftNode, rightNode;

   Node(int data){
       this.data = data;
   }

    @Override
    public PrintableNode getLeft() {
        return this.leftNode;
    }

    @Override
    public PrintableNode getRight() {
        return this.rightNode;
    }

    @Override
    public String getText() {
        return String.valueOf(this.data);
    }
}
