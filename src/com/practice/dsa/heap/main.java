package com.practice.dsa.heap;

public class main {
    public static void main(String[] args) {
        Heap heap = new Heap(6);
        heap.insert(11);
        heap.insert(12);
        heap.insert(13);
        heap.insert(5);
        heap.insert(6);
        heap.insert(7);

        heap.printHeap();

        heap.delete(0);
        heap.printHeap();
        heap.sort();
        heap.printHeap();
    }
}
