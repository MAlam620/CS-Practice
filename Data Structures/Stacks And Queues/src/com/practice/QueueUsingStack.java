package com.practice;

public class QueueUsingStack
{
    MyStack regularStack;
    MyStack queueStack;

    public QueueUsingStack()
    {
        regularStack = new MyStack();
        queueStack = new MyStack();
    }

    public void push(int x)
    {
        int size = queueStack.length;
        for(int i = 0; i < size; i++)
        {
            regularStack.push(queueStack.pop());
        }
        regularStack.push(x);

        size = regularStack.length;

        for(int i = 0; i < size; i++)
        {
            queueStack.push(regularStack.pop());
        }
    }

    public int pop()
    {
        return queueStack.pop();
    }

    public int peek()
    {
        return queueStack.top();
    }

    public boolean empty()
    {
        if(queueStack.empty())
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
        QueueUsingStack test = new QueueUsingStack();
        test.push(1);
        test.push(2);
        System.out.println(test.pop());

    }



}
