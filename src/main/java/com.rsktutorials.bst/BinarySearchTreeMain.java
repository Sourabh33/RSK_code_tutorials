package com.rsktutorials.bst;

public class BinarySearchTreeMain {
    public static void main(String[] args) {
        System.out.println("**********Binary Search Tree Program***********");

        BST bst = new BST();
        // 15, 10, 20, 8, 12, 17, 25
        bst.insert(15);
        bst.insert(10);
        bst.insert(20);
        bst.insert(8);
        bst.insert(12);
        bst.insert(17);
        bst.insert(25);

        bst.printBst();

    }
}
