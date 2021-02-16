package com.ErenArkan.LinkedList;

public class LinkedList {

    private Node head;
    private int size;

    public void addToFront(Integer value) {
        Node Node = new Node(value);
        Node.setNext(head);
        head = Node;
        size++;
    }

    public void addToEnd(Integer value) {
        Node Node = new Node(value);

        if (head == null) addToFront(value);

        Node currentNode = head;

        while (currentNode.getNext() != null) {
            currentNode = currentNode.getNext();
        }

        Node.setNext(null);
        currentNode.setNext(Node);
        size++;
    }

    public void addAfter(Integer valueToAdd, Integer valueToAddAfter) {
        Node Node = new Node(valueToAdd);
        Node nodeIndex = head;

        while (valueToAddAfter != nodeIndex.getValue()) {
            nodeIndex = nodeIndex.getNext();
        }

        Node.setNext(nodeIndex.getNext());
        nodeIndex.setNext(Node);

        size++;
    }

    public void addBefore(Integer valueToAdd, Integer valueToAddBefore) {
        Node Node = new Node(valueToAdd);

        if (head.getValue() == valueToAddBefore) {
            addToFront(valueToAdd);
            return;
        }

        Node nodeIndex = head;
        Node nodeIndexPrev = head;

        while (valueToAddBefore != nodeIndex.getValue()) {
            nodeIndexPrev = nodeIndex;
            nodeIndex = nodeIndex.getNext();
        }

        Node.setNext(nodeIndex);
        nodeIndexPrev.setNext(Node);

        size++;
    }


    public Node removeFromFront() {
        if (isEmpty()) {
            return null;
        }

        Node removedNode = head;
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

        Node index = head;

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
        Node current = head;
        System.out.print("HEAD -> ");
        while (current != null) {
            System.out.print(current);
            System.out.print(" -> ");
            current = current.getNext();
        }
        System.out.println("null");
    }

}