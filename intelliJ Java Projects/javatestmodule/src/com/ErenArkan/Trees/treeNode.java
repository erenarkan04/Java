package com.ErenArkan.Trees;

public class treeNode {

    private int data;
    private treeNode leftNode;
    private treeNode rightNode;

    public void insert (int input) {
        if (input == data) return;

        if (input < data) {
            if (leftNode == null) leftNode = new treeNode(input);
            else leftNode.insert(input);
        }
        else {
            if (rightNode == null) rightNode = new treeNode(input);
            else rightNode.insert(input);
        }
    }

    public treeNode get(int value) {
        if (value == data) return this;
        if (value < data) {
            if (leftNode != null) return leftNode.get(value);
        }
        else {
            if (rightNode != null) return rightNode.get(value);
        }
        return null;
    }

    public int getMin () {
        if (leftNode == null) return data;
        else return leftNode.getMin();
    }
    public int getMax () {
        if (rightNode == null) return data;
        else return rightNode.getMax();
    }
    public void traverseInOrder () {
        if (leftNode != null) leftNode.traverseInOrder();
        System.out.print(data + ", ");
        if (rightNode != null) rightNode.traverseInOrder();
    }

    public void traverseInPreOrder () {
        System.out.print(data + ", ");
        if (leftNode != null) leftNode.traverseInPreOrder();
        if (rightNode != null) rightNode.traverseInPreOrder();
    }

    public treeNode(int data) {
        this.data = data;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public treeNode getLeftNode() {
        return leftNode;
    }

    public void setLeftNode(treeNode leftNode) {
        this.leftNode = leftNode;
    }

    public treeNode getRightNode() {
        return rightNode;
    }

    public void setRightNode(treeNode rightNode) {
        this.rightNode = rightNode;
    }
}
