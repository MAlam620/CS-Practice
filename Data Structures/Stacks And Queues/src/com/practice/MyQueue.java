package com.practice;

class MyQueue {

    ListNode top;
    ListNode bottom;
    int length;
    /** Initialize your data structure here. */
    public MyQueue()
    {
        top = null;
        length = 0;
    }

    /** Push element x to the back of queue. */
    public void push(int x)
    {
        ListNode newNode = new ListNode(x);
        if(length == 0)
        {
            top = newNode;
            bottom = newNode;
            length++;
        }
        else
        {
            bottom.next = newNode;
            bottom = newNode;
            length++;
        }
    }

    /** Removes the element from in front of queue and returns that element. */
    public int pop()
    {
        int returnValue = top.val;
        top = top.next;
        length--;
        return returnValue;
    }

    /** Get the front element. */
    public int peek()
    {
        return top.val;
    }

    /** Returns whether the queue is empty. */
    public boolean empty()
    {
        if(length <= 0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

}