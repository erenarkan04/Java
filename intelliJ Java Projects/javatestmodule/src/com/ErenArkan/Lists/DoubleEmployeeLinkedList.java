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
        while (true) {
            if (indexNode.getEmployee().getId() == employeeNodeToAddBefore.getId()) break;
            else {
                indexNode = indexNode.getNext();
            }
        }

        nodeToAdd.setNext(indexNode);
        nodeToAdd.setPrev(indexNode.getPrev());
        indexNode.getPrev().setNext(nodeToAdd);
        indexNode.setPrev(nodeToAdd);

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
