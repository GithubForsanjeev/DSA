package com.practice.dsa.tree;

public class Tree {

    TreeNode root;

    public void insert(int data) {
        if (root == null) {
            root = new TreeNode(data);
        } else {
            root.insert(data);
        }
    }

    public void inOrderTraversal() {
        if (root != null) {
            root.inOrderTraversal();
        }
    }

    public void preOrderTraversal() {
        if (root != null) {
            root.preOrderTraversal();
        }
    }

    public void postOrderTraversal() {
        if (root != null) {
            root.postOrderTraversal();
        }
    }

    public int min() {
        if (root == null) {
            return Integer.MIN_VALUE;
        } else {
            return root.min();
        }
    }

    public int max() {
        if (root == null) {
            return Integer.MAX_VALUE;
        } else {
            return root.max();
        }
    }


    public void delete(int data) {
        root = delete(root, data);
    }

    private TreeNode delete(TreeNode node, int data) {
        if (node == null) {
            return null;
        } else if (data < node.getData()) {
            node.setLeftChild(delete(node.getLeftChild(), data));
        } else if (data > node.getData()) {
            node.setRightChild(delete(node.getRightChild(), data));
        } else {
            if (node.getLeftChild() == null) {
                return node.getRightChild();
            } else if (node.getRightChild() == null) {
                return node.getLeftChild();
            } else {
                node.setData(node.getRightChild().min());
                node.setRightChild(delete(node.getRightChild(), node.getData()));
            }
        }
        return node;
    }
}
