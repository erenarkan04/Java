package com.ErenArkan.Heaps;

import java.util.Stack;

public class heapsMain {

    public static void main(String[] args) {


        Heap heap = new Heap(10);

        heap.insert(5);
        heap.insert(6);
        heap.insert(7);
        heap.insert(8);
        heap.insert(9);


        heap.printHeap();


        heap.delete(3);
        heap.delete(0);

        heap.printHeap();
    }


}
