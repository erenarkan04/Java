package com.ErenArkan.LinkedList;

import org.w3c.dom.Node;

public class LinkedListEx {

    private NodeEx head;
    private int size;

    public void addToFront(Integer value) {
        NodeEx node = new NodeEx(value);
        node.setNext(head);
        head = node;
        size++;
    }

    public void addToEnd(Integer value) {
        NodeEx node = new NodeEx(value);

        if (head == null) addToFront(value);

        NodeEx lastNode = head;

        while (lastNode.getNext() != null) {
            lastNode = lastNode.getNext();
        }

        node.setNext(null);
        lastNode.setNext(node);
        size++;
    }

    public void addAfter(Integer valueToAdd, Integer valueToAddAfter) {
        NodeEx node = new NodeEx(valueToAdd);
        NodeEx nodeIndex = head;

        while (valueToAddAfter != nodeIndex.getValue()) {
            nodeIndex = nodeIndex.getNext();
        }

        node.setNext(nodeIndex.getNext());
        nodeIndex.setNext(node);

        size++;
    }

    public void addBefore(Integer valueToAdd, Integer valueToAddBefore) {
        NodeEx node = new NodeEx(valueToAdd);

        if (head.getValue() == valueToAddBefore) {
            addToFront(valueToAdd);
            return;
        }

        NodeEx nodeIndex = head;
        NodeEx nodeIndexPrev = head;

        while (valueToAddBefore != nodeIndex.getValue()) {
            nodeIndexPrev = nodeIndex;
            nodeIndex = nodeIndex.getNext();
        }

        node.setNext(nodeIndex);
        nodeIndexPrev.setNext(node);

        size++;
    }


    public NodeEx removeFromFront() {
        if (isEmpty()) {
            return null;
        }

        NodeEx removedNode = head;
        head = head.getNext();
        size--;
        removedNode.setNext(null);
        return removedNode;
    }

    public void insertSorted(Integer value) {

        if (head == null) {
            addToFront(value);
            return;
        }

        if (head.getNext() == null) {
            if (value < head.getValue()) addToFront(value);
            else addToEnd(value);
            return;
        }

        NodeEx index = head;

        while (true) {
            if (value < index.getValue()) {
                addBefore(value, index.getValue());
                break;
            }
            if (index.getNext() == null) {
                addToEnd(value);
                return;
            }

            index = index.getNext();
        }

        size++;
    }

    public int getSize() {
        return size;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void printList() {
        NodeEx current = head;
        System.out.print("HEAD -> ");
        while (current != null) {
            System.out.print(current);
            System.out.print(" -> ");
            current = current.getNext();
        }
        System.out.println("null");
    }

}