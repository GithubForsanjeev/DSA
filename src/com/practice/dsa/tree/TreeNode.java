package com.practice.dsa.tree;

public class TreeNode {
    private int data;
    private TreeNode leftChild;
    private TreeNode rightChild;

    public TreeNode(int data) {
        this.data = data;
    }

    public void insert(int value) {
        if (value == data) {
            return;
        } else if (value < data) {
            if (leftChild == null) {
                leftChild = new TreeNode(value);
            } else {
                leftChild.insert(value);
            }
        } else {
            if (rightChild == null) {
                rightChild = new TreeNode(value);
            } else {
                rightChild.insert(value);
            }
        }
    }

    public void inOrderTraversal() {
        if (leftChild != null) {
            leftChild.inOrderTraversal();
        }
        System.out.print(data + ", ");
        if (rightChild != null) {
            rightChild.inOrderTraversal();
        }
    }

    public void preOrderTraversal() {
        System.out.print(data+", ");
        if (leftChild!=null){
            leftChild.preOrderTraversal();
        }
        if(rightChild !=null){
            rightChild.preOrderTraversal();;
        }
    }

    public void postOrderTraversal() {
        if (leftChild!=null){
            leftChild.postOrderTraversal();
        }
        if(rightChild != null){
            rightChild.postOrderTraversal();
        }
        System.out.print(data+", ");
    }

    public int min() {
        if (leftChild!=null){
            return leftChild.min();
        }else{
            return data;
        }
    }

    public int max() {
        if (rightChild!=null){
            return rightChild.max();
        }else{
            return data;
        }
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public TreeNode getLeftChild() {
        return leftChild;
    }

    public void setLeftChild(TreeNode leftChild) {
        this.leftChild = leftChild;
    }

    public TreeNode getRightChild() {
        return rightChild;
    }

    public void setRightChild(TreeNode rightChild) {
        this.rightChild = rightChild;
    }
}
