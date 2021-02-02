package com.ErenArkan.Trees;

public class tree {

    private treeNode root;

    public void insert (int value) {
        if (root == null) root = new treeNode(value);
        else root.insert(value);
    }

    public void traverseInOrder () {
        if (root != null) root.traverseInOrder();
    }

    public void traverseInPreOrder () {
        if (root != null) root.traverseInPreOrder();
    }

    public treeNode get(int value) {
        if (root != null) return root.get(value);
        else return null;
    }

    public void delete (int value) {
        root = deleteNode(root, value);
    }

    private treeNode deleteNode (treeNode subTreeNode, int value) {
        if (subTreeNode == null) return null;

        if (value < subTreeNode.getData()) subTreeNode.setLeftNode(deleteNode(subTreeNode.getLeftNode(), value));
        else if (value > subTreeNode.getData()) subTreeNode.setRightNode(deleteNode(subTreeNode.getRightNode(), value));
        else {
            if (subTreeNode.getLeftNode() == null) return subTreeNode.getRightNode();
            else if (subTreeNode.getRightNode() == null) return subTreeNode.getLeftNode();
            else {
                subTreeNode.setData(subTreeNode.getRightNode().getMin());
                subTreeNode.setRightNode(deleteNode(subTreeNode.getRightNode(), subTreeNode.getData()));
            }
        }

        return subTreeNode;
    }

    public int getMin () {
        if (root == null) return Integer.MIN_VALUE;
        else return root.getMin();
    }

    public int getMax () {
        if (root == null) return Integer.MAX_VALUE;
        else return root.getMax();
    }
}
