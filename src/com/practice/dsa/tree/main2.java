package com.practice.dsa.tree;

public class main2 {

    public static void main(String[] args) {
        TreeV2 tree = new TreeV2();
        tree.insert(10);
        tree.insert(12);
        tree.insert(6);
        tree.insert(13);
        tree.insert(11);
        tree.insert(4);
        tree.insert(8);
        tree.inOrderTraversal();

        System.out.println("Min element: "+tree.getMinElement());

        System.out.println("Max depth: "+ tree.getDepth());

        System.out.println("Count of Trees for 3 nodes:"+ tree.getNumberOfTree(3));
        System.out.println("Print tree nodes for range 4--13");
        tree.printRange(4,13);
        System.out.println("Print tree nodes for range 1--15");
        tree.printRange(1,15);
        System.out.println("Print tree nodes for range 5--12");
        tree.printRange(5,12);

        System.out.println("is Tree a binary search tree :"+ tree.isBinarySearchTree());

        System.out.println("Mirror of tree");
        tree.mirror();
        tree.inOrderTraversal();
    }
}
