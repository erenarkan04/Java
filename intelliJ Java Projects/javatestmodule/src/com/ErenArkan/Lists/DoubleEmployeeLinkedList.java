package com.ErenArkan.Lists;

public class DoubleEmployeeLinkedList {

    private DoubleEmployeeNode head;
    private DoubleEmployeeNode tail;
    private int size;

    public void addToFront (Employee employee) {
        DoubleEmployeeNode node = new DoubleEmployeeNode(employee);

        if (head == null) tail = node;
        else {
            head.setPrev(node);
            node.setNext(head);
        }
        head = node;
        size++;
    }

    public void addToEnd (Employee employee) {
        DoubleEmployeeNode node = new DoubleEmployeeNode(employee);

        if (tail == null) head = node;
        else {
            tail.setNext(node);
            node.setPrev(tail);
        }

        tail = node;
        size++;
    }

    public void addBeforeItem (Employee employeeToAdd, Employee employeeNodeToAddBefore) {
        DoubleEmployeeNode nodeToAdd = new DoubleEmployeeNode(employeeToAdd);

        DoubleEmployeeNode indexNode = head;

        if (head == null) {
            addToFront(employeeToAdd);
            size++;
            return;
        }

        while (true) {
            if (indexNode.getEmployee().getId() == employeeNodeToAddBefore.getId()) break;
            else indexNode = indexNode.getNext();
        }

        if (indexNode.getPrev() == null) {
            nodeToAdd.setNext(head);
            head.setPrev(nodeToAdd);
            head = nodeToAdd;
            size++;
            return;
        }

        nodeToAdd.setNext(indexNode);
        nodeToAdd.setPrev(indexNode.getPrev());
        indexNode.getPrev().setNext(nodeToAdd);
        indexNode.setPrev(nodeToAdd);

        size++;

    }

    public void swapEmployees (Employee swap1, Employee swap2) {
        if (swap1.getId() == swap2.getId()) return;

        DoubleEmployeeNode swapNode1 = head;
        DoubleEmployeeNode swapNode2 = head;
        DoubleEmployeeNode swapNodeTemp = new DoubleEmployeeNode();

        while (true) {
            if (swapNode1.getEmployee().getId() == swap1.getId()) break;
            if(swapNode1.getNext() == null) break;
            swapNode1 = swapNode1.getNext();
        }

        while (true) {
            if (swapNode2.getEmployee().getId() == swap2.getId()) break;
            if(swapNode2.getNext() == null) break;
            swapNode2 = swapNode2.getNext();
        }

        System.out.println(swapNode1);
        System.out.println(swapNode2);

        swapNodeTemp.setNext(swapNode1.getNext());
        swapNodeTemp.setPrev(swapNode1.getPrev());

        swapNode1.getPrev().setNext(swapNode2);
        swapNode1.getNext().setPrev(swapNode2);

        swapNode2.getPrev().setNext(swapNode1);
        swapNode2.getNext().setPrev(swapNode1);

        swapNode1.setPrev(swapNode2.getPrev());
        swapNode1.setNext(swapNode2.getNext());

        swapNode2.setNext(swapNodeTemp.getNext());
        swapNode2.setPrev(swapNodeTemp.getPrev());

        swapNodeTemp.setNext(null);
        swapNodeTemp.setPrev(null);

    }

    public DoubleEmployeeNode removeFromFront () {
            if (isEmpty()) return null;

            DoubleEmployeeNode removedNode = head;

            if (head.getNext() == null) {
                tail = null;
            }
            else {
                head.getNext().setPrev(null);
            }

            head = head.getNext();
            size--;
            removedNode.setNext(null);
            return removedNode;
    }

    public DoubleEmployeeNode removeFromEnd () {
        if (isEmpty()) return null;

        DoubleEmployeeNode removedNode = tail;

        if (tail.getPrev() == null) head = null;
        else tail.getPrev().setNext(null);

        tail = tail.getPrev();
        size--;
        removedNode.setPrev(null);
        return removedNode;
    }

    public void printList () {
        DoubleEmployeeNode current = head;
        System.out.print("HEAD -> ");
        while (current != null) {
            System.out.print(current);
            System.out.print("<-> ");
            current = current.getNext();
        }
        System.out.println("null");
    }

    public int getSize() {
        return size;
    }

    public boolean isEmpty () {
        return head == null;
    }
}
