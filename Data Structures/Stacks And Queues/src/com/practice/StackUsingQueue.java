package com.practice;

import java.util.Queue;
import java.util.LinkedList;

public class StackUsingQueue
{
    int length;
    MyQueue queue;
    public StackUsingQueue()
    {
        queue = new MyQueue();
    }

    public void push(int x)
    {
        queue.push(x);
        int size = queue.length;

        for(int i = 0; i < size - 1; i++)
        {
            queue.push(queue.pop());
        }
    }

    public int pop()
    {
        return queue.pop();
    }

    public int top()
    {
        return queue.peek();
    }

    public boolean empty()
    {
        if(queue.empty())
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public static void main(String[] args)
    {
        StackUsingQueue test = new StackUsingQueue();
        test.push(1);
        test.push(2);
        test.push(3);
        test.push(4);
        System.out.println(test.pop());
    }

}
