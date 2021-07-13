package com.practice.dsa.heap;

public class Heap {

    int[] heap;
    int size;

    Heap(int capacity) {
        heap = new int[capacity];
    }

    public void insert(int value) {
        if (isFull()) {
            throw new IndexOutOfBoundsException("Heap is Full");
        }
        heap[size] = value;
        fixUpHeap(size);
        size++;
    }

    private void fixUpHeap(int index) {
        int newValue = heap[index];
        while (index > 0 && newValue > heap[getParent(index)]) {
            heap[index] = heap[getParent(index)];
            index = getParent(index);
        }
        heap[index] = newValue;
    }

    private int getParent(int index) {
        return (index - 1) / 2;
    }

    private boolean isFull() {
        return size == heap.length;
    }

    public void printHeap() {
        for (int i = 0; i < size; i++) {
            System.out.print(heap[i] + ",");
        }
        System.out.println();
    }

    public int delete(int index) {
        if (isEmpty()) {
            throw new IndexOutOfBoundsException("Heap is Empty");
        }
        int parent = getParent(index);
        int deletedValue = heap[index];
        heap[index] = heap[size - 1];
        if (index == 0 || heap[index] < heap[parent]) {
            fixBelowHeapRecursive(index, size - 1);
        } else {
            fixUpHeap(index);
        }
        size--;
        return deletedValue;
    }

    private void fixBelowHeap(int index, int lastHeapIndex) {
        while (index <= lastHeapIndex) {
            int left = 2 * index + 1;
            int right = 2 * index + 2;
            int childToSwap;
            if (left <= lastHeapIndex) {
                if (right > lastHeapIndex) {
                    childToSwap = left;
                } else {
                    childToSwap = heap[left] > heap[right] ? left : right;
                }

                if (heap[childToSwap] > heap[index]) {
                    int tmp = heap[childToSwap];
                    heap[childToSwap] = heap[index];
                    heap[index] = tmp;
                } else {
                    break;
                }
                index = childToSwap;
            } else {
                break;
            }
        }
    }

    public void fixBelowHeapRecursive(int index, int lastHeapIndex) {
        int largest = index;
        int left = 2 * index + 1;
        int right = 2 * index + 2;

        if(left<=lastHeapIndex && heap[largest]<heap[left])
            largest = left;
        if(right<=lastHeapIndex && heap[largest]<heap[right])
            largest = right;

        if(largest!=index){
            int tmp = heap[largest];
            heap[largest] = heap[index];
            heap[index] = tmp;
            fixBelowHeapRecursive(largest,lastHeapIndex);
        }
    }

    public void sort(){
        for(int i=size-1; i>0;i--){
            int tmp = heap[0];
            heap[0] = heap[i];
            heap[i] = tmp;
            fixBelowHeapRecursive(0,i-1);
        }
    }

    private boolean isEmpty() {
        return size == 0;
    }
}
