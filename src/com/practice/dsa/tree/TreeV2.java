package com.practice.dsa.tree;

public class TreeV2 {

    private TreeNodeV2 root;

    public void insert(int data) {
        root = insertRec(root, data);
    }

    private TreeNodeV2 insertRec(TreeNodeV2 root, int data) {
        if (root == null)
            return new TreeNodeV2(data);
        if (data < root.getData()) {
            root.setLeft(insertRec(root.getLeft(), data));
        } else {
            root.setRight(insertRec(root.getRight(), data));
        }
        return root;
    }

    public void inOrderTraversal() {
        inOrderTraversalRec(root);
        System.out.println();
    }

    public void inOrderTraversalRec(TreeNodeV2 root) {
        if (root == null)
            return;
        inOrderTraversalRec(root.getLeft());
        System.out.print(root.getData() + " ");
        inOrderTraversalRec(root.getRight());
    }

    public int getMinElement() {
        return getMinElementRec(root);
    }

    private int getMinElementRec(TreeNodeV2 root) {
        if (root == null) {
            return Integer.MIN_VALUE;
        }
        if (root.getLeft() == null) {
            return root.getData();
        }
        return getMinElementRec(root.getLeft());
    }

    public int getDepth() {
        return getDepthRec(root);
    }

    private int getDepthRec(TreeNodeV2 root) {
        if (root == null)
            return 0;
        if (root.getLeft() == null && root.getRight() == null)
            return 0;
        int leftDepth = 1 + getDepthRec(root.getLeft());
        int rightDepth = 1 + getDepthRec(root.getRight());

        return Math.max(leftDepth, rightDepth);
    }

    public void mirror() {
        mirrorRec(root);
    }

    private void mirrorRec(TreeNodeV2 root) {
        if (root == null)
            return ;

        mirrorRec(root.getLeft());
        mirrorRec(root.getRight());

        TreeNodeV2 tmp = root.getLeft();
        root.setLeft(root.getRight());
        root.setRight(tmp);
    }

    public int getNumberOfTree(int n) {

        if (n <= 1)
            return 1;

        int sum = 0;
        for (int i = 1; i <= n; i++) {
            int leftTreeCount = getNumberOfTree(i - 1);
            int rightTreeCount = getNumberOfTree(n - i);
            sum = sum + (leftTreeCount * rightTreeCount);
        }

        return sum;
    }

    public void printRange(int min, int max) {
        printRangeRec(root, min, max);
        System.out.println();
    }

    private void printRangeRec(TreeNodeV2 root, int min, int max) {
        if (root == null)
            return;

        if (min < root.getData()) {
            printRangeRec(root.getLeft(), min, max);
        }
        if (min <= root.getData() && root.getData() <= max) {
            System.out.print(root.getData() + " ");
        }

        if (max > root.getData()) {
            printRangeRec(root.getRight(), min, max);
        }
    }

    public boolean isBinarySearchTree() {
        return isBinarySearchTreeRec(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    private boolean isBinarySearchTreeRec(TreeNodeV2 root, int minValue, int maxValue) {
        if (root == null)
            return true;
        if (minValue > root.getData() || root.getData() > maxValue)
            return false;

        return isBinarySearchTreeRec(root.getLeft(), minValue, root.getData()) && isBinarySearchTreeRec(root.getRight(), root.getData(), maxValue);
    }
}
