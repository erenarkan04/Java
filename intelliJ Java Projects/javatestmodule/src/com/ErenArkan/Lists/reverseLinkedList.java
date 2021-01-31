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
        



    }

    public static class linkedList {

        private listNode head;
        private int size;

        public void add(int input) {
            listNode addindex = head;

            if (head == null) head = new listNode(input);
            else if (head.getNext() == null) head.setNext(new listNode(input));
            else {
                do {
                    addindex = addindex.getNext();
                } while (addindex.getNext() != null);
                addindex.setNext(new listNode(input));
            }
            size++;
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

            listNode index = input.head;
            listNode prevIndex = input.head;
            listNode nextIndex = input.head;

            while (index.getNext() != null) {
                nextIndex = index.getNext();

                index.setNext(prevIndex);

                prevIndex = index;
                index = nextIndex;
            }
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
