package com.practice.dsa.tree;

public class main {

    public static void main(String[] args) {
        Tree tree = new Tree();
        tree.insert(25);
        tree.insert(20);
        tree.insert(15);
        tree.insert(27);
        tree.insert(30);
        tree.insert(29);
        tree.insert(26);
        tree.insert(22);
        tree.insert(32);
        tree.insert(17);
//
        System.out.println("inOrderTraversal:");
        tree.inOrderTraversal();
        System.out.println();
        System.out.println("preOrderTraversal:");
        tree.preOrderTraversal();
        System.out.println();
        System.out.println("postOrderTraversal:");
        tree.postOrderTraversal();
        System.out.println();
        System.out.println();
//        System.out.println(tree.min());
//        System.out.println(tree.max());
//
//
        tree.delete(30);

        System.out.println("inOrderTraversal:");
        tree.inOrderTraversal();
        System.out.println();
        System.out.println("preOrderTraversal:");
        tree.preOrderTraversal();
        System.out.println();
        System.out.println("postOrderTraversal:");
        tree.postOrderTraversal();
        System.out.println();
        System.out.println();
    }
}
