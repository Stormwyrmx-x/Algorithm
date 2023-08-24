package com.weng;

import java.util.LinkedList;
import java.util.Queue;

public class MyStack
{
    Queue<Integer>queue;
    public MyStack() {
        queue=new LinkedList<>();
    }

    public void push(int x) {
        queue.add(x);
    }

    public int pop() {
        for (int i = 0; i < queue.size()-1; i++)
        {
            queue.add(queue.poll());
        }
        return queue.remove();

    }

    public int top() {
//        int result = pop();
//        queue.add(result);
//        return result;

            return ((LinkedList<Integer>) queue).getLast();


    }

    public boolean empty() {
        return queue.isEmpty();
    }
}
