package com.ErenArkan.Lists;

public class SingleEmployeeLinkedList {

    private SingleEmployeeNode head;
    private int size;

    public void addToFront (Employee employee) {
        SingleEmployeeNode node = new SingleEmployeeNode(employee);
        node.setNext(head);
        head = node;
        size++;
    }

    public SingleEmployeeNode removeFromFront () {
        if (isEmpty()) return null;
        SingleEmployeeNode removedNode = head;
        head = head.getNext();
        size--;
        removedNode.setNext(null);
        return removedNode;
    }

    public void printList () {
        SingleEmployeeNode current = head;
        System.out.print("HEAD -> ");
        while (current != null) {
            System.out.print(current);
            System.out.print("-> ");
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
