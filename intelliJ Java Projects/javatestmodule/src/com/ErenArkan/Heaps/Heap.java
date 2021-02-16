package com.ErenArkan.Heaps;

public class Heap {

    private int[] heap;
    private int size;

    public Heap (int capacity) {
        heap = new int[capacity];
    }

    public void insert (int value) {
        if (isFull()) throw new IndexOutOfBoundsException("index out of bounds");
        heap[size] = value;

        arrangeAbove(size);
        size++;
    }

    private void arrangeAbove(int index) {
        if (index == 0) return;
        int newValue = heap[index];

        while (index > 0 && newValue > heap[getParent(index)]) {
            heap[index] = heap[getParent(index)];
            index = getParent(index);
        }
        heap[index] = newValue;
    }

    public int peek () {
        if (size == 0) throw new IndexOutOfBoundsException("Error");

        else return heap[0];
    }

    private void arrangeBelow(int index, int lastHeapIndex) {
       int childToSwap;

        while (index < lastHeapIndex) {
            int leftChild = getChild(index, true);
            int rightChild = getChild(index, false);

            if (leftChild < size) {
                if (rightChild > size) childToSwap = leftChild;
                else childToSwap = (heap[leftChild] > heap[rightChild] ? leftChild : rightChild);

                if (heap[childToSwap] > heap[index]) {
                    int temp = heap[index];
                    heap[index] = heap[childToSwap];
                    heap[childToSwap] = temp;
                }
                else break;

                index = childToSwap;
            }
            else break;
        }
    }

    public int delete (int index) {
        if (isEmpty()) throw new IndexOutOfBoundsException("Empty");

        int parent = getParent(index);
        int deletedvalue = heap[index];

        heap[index] = heap[size - 1];

        if (index == 0 || heap[parent] > heap[index]) {
            arrangeBelow(index, size - 1);

        }
        else arrangeAbove(index);
        size--;

        return deletedvalue;
    }

    public void printHeap () {
        for (int i = 0; i < size; i++) {
            System.out.print(heap[i]);
            System.out.print(",");
        }
        System.out.println();
    }


    private boolean isFull() {
        if (size == heap.length) return true;
        else return false;
    }

    public int getParent (int index) {
        return (index - 1) / 2;
    }

    public boolean isEmpty () {
        return (size == 0);
    }

    private int getChild (int index, boolean left) {
        return (index * 2) + (left? 1 : 2);
    }


}
