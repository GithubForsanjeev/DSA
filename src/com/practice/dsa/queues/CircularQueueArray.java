package com.practice.dsa.queues;

import java.util.NoSuchElementException;

public class CircularQueueArray {
    int[] data;
    int front, back, size, capacity;

    CircularQueueArray(int capacity) {
        this.capacity = capacity;
        data = new int[capacity];
        this.front = 0;
        this.back = capacity-1;
    }

    public boolean isFull() {
        return this.size == this.capacity;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void add(int item) {
        if (isFull()) {
            System.out.println("Queue is Full");
            return;
        }
        this.back = (this.back + 1) % capacity;
        data[back] = item;

        size++;
    }

    public int remove() {
        if (isEmpty()) {
            System.out.println("Queue is Empty");
            return -1;
        }
        int element = data[front];
        data[front] = 0;
        this.front = (this.front + 1) % capacity;
        this.size--;
        return element;
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Queue is Empty");
            return -1;
        }
        return data[front];
    }

    public int size() {
        return this.size;
    }

    public int getFront(){
        return data[front];
    }

    public int getRear(){
        return data[--back];
    }

    public void printQueue() {
        for (int item : data) {
            System.out.print(item);
            System.out.print(" ");
        }
        System.out.println();
    }
}
