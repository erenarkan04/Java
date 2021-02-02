package com.ErenArkan.Lists;

import javax.swing.*;

public class reverseLinkedList {

    public static void main(String[] args) {

        linkedList list = new linkedList();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        list.printList();
        
        reverseList(list);

        System.out.println();
        list.printList();
    }

    public static class linkedList {

        private listNode head;
        private int size;

        public void add(int input) {
            listNode nodeToAdd = new listNode(input);

            if (head == null) {
                head = nodeToAdd;
                size++;
            }
            else {
                nodeToAdd.setNext(head);
                head = nodeToAdd;
                size++;
            }
        }

        public void printList() {
            listNode indexNode = head;

            do {
                System.out.println(indexNode.getData());
                indexNode = indexNode.getNext();
            } while (indexNode != null);
        }
    }

        public static void reverseList (linkedList input) {
            if (input.head == null || input.head.getNext() == null) return;

            listNode index = input.head.getNext();
            listNode prevIndex = input.head;
            listNode nextIndex = input.head.getNext();

            while (index != null) {
                nextIndex = index.getNext();

                index.setNext(prevIndex);
                if (prevIndex == input.head) prevIndex.setNext(null);

                prevIndex = index;
                index = nextIndex;
            }
            input.head = prevIndex;
        }

    public static class listNode {
        int data;
        listNode next;

        public listNode(int data) {
            this.data = data;
        }

        public int getData() {
            return data;
        }

        public void setData(int data) {
            this.data = data;
        }

        public listNode getNext() {
            return next;
        }

        public void setNext(listNode next) {
            this.next = next;
        }
    }

}
