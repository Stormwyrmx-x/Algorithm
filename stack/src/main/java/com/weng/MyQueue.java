package com.weng;

import java.util.Stack;

public class MyQueue
{
    Stack<Integer>stackIn=new Stack<>();
    Stack<Integer>stackOut=new Stack<>();
    public MyQueue() {
        this.stackIn=new Stack<>();
        this.stackOut=new Stack<>();
    }

    public void push(int x) {
        stackIn.push(x);
    }

    public int pop() {
        if (stackOut.isEmpty())
        {
            while (!stackIn.isEmpty())
            {
                stackOut.push(stackIn.pop());
            }
        }
        return stackOut.pop();
    }

    public int peek() {
        int result=this.pop();
        stackOut.push(result);
        return result;
    }

    public boolean empty() {
        return stackIn.isEmpty()&&stackOut.isEmpty();
    }
}
