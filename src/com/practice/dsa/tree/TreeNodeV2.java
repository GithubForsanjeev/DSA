package com.practice.dsa.tree;

public class TreeNodeV2 {
    private int data;
    private TreeNodeV2 left;
    private  TreeNodeV2 right;

    public TreeNodeV2(int data) {
        this.data = data;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public TreeNodeV2 getLeft() {
        return left;
    }

    public void setLeft(TreeNodeV2 left) {
        this.left = left;
    }

    public TreeNodeV2 getRight() {
        return right;
    }

    public void setRight(TreeNodeV2 right) {
        this.right = right;
    }
}
