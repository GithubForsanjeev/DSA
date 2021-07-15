package com.practice.dsa.stack;

import java.util.LinkedList;

public class MinmumNumberStack {
    private LinkedList<Integer> mainStack = new LinkedList<>();
    private LinkedList<Integer> minStack = new LinkedList<>();
    public static void main(String[] args) {
        MinmumNumberStack stackObj = new MinmumNumberStack();

        stackObj.push(4);
        stackObj.push(5);
        System.out.println("main stack:"+stackObj.mainStack);
        System.out.println("min stack:"+stackObj.minStack);
        System.out.println("min element:"+stackObj.min());
        stackObj.push(7);
        stackObj.push(6);
        stackObj.push(1);
        System.out.println("main stack:"+stackObj.mainStack);
        System.out.println("min stack:"+stackObj.minStack);
        System.out.println("min element:"+stackObj.min());
        System.out.println("popped element:"+stackObj.pop());
        System.out.println("min element:"+stackObj.min());
        System.out.println("main stack:"+stackObj.mainStack);
        System.out.println("min stack:"+stackObj.minStack);
        System.out.println("popped element:"+stackObj.pop());
        System.out.println("min element:"+stackObj.min());
        System.out.println("main stack:"+stackObj.mainStack);
        System.out.println("min stack:"+stackObj.minStack);
        System.out.println("popped element:"+stackObj.pop());
        System.out.println("min element:"+stackObj.min());
        System.out.println("main stack:"+stackObj.mainStack);
        System.out.println("min stack:"+stackObj.minStack);
        System.out.println("popped element:"+stackObj.pop());
        System.out.println("min element:"+stackObj.min());
        System.out.println("main stack:"+stackObj.mainStack);
        System.out.println("min stack:"+stackObj.minStack);
    }

    private Integer pop() {
        minStack.pop();
        return mainStack.pop();
    }

    private Integer min() {
        return minStack.peek();
    }

    private void push(Integer data) {
        int min = data;
        if(!minStack.isEmpty()){
            if(min>minStack.peek()){
                min = minStack.peek();
            }
        }
        mainStack.push(data);
        minStack.push(min);
    }

}
