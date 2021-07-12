package com.practice.dsa.queues;

public class main {
    public static void main(String[] args) {
        CircularQueueArray queueArray = new CircularQueueArray(5);
        queueArray.add(4);
        queueArray.add(5);
        queueArray.add(1);
        queueArray.add(2);
        queueArray.add(6);
        queueArray.remove();
        queueArray.remove();
        queueArray.remove();
        queueArray.remove();
        queueArray.add(7);
        queueArray.add(4);
        queueArray.add(5);
        //queueArray.add(1);
        queueArray.add(2);
        queueArray.remove();
        queueArray.remove();
        queueArray.add(3);

        queueArray.printQueue();
        System.out.println(queueArray.getFront());
        System.out.println(queueArray.getRear());
        System.out.println(queueArray.size());
    }
}
