package com.practice;


public class MyStack
{
    ListNode top = null;
    int length;
    /** Initialize your data structure here. */
    public MyStack()
    {
        this.top = null;
        this.length = 0;
    }

    /** Push element x onto stack. */
    public void push(int x)
    {
        ListNode newNode = new ListNode(x);
        if(empty())
        {
            this.top = newNode;
            this.length++;
        }
        else
        {
            newNode.next = this.top;
            this.top = newNode;
            this.length++;
        }
    }

    /** Removes the element on top of the stack and returns that element. */
    public int pop()
    {
        int returnValue = top.val;
        this.top = this.top.next;
        this.length--;
        return returnValue;
    }

    /** Get the top element. */
    public int top()
    {
        return top.val;
    }

    /** Returns whether the stack is empty. */
    public boolean empty()
    {
        if(length == 0)
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
	    MyStack stack = new MyStack();
	    stack.push(1);
	    stack.push(2);

        System.out.println("Top is: " + stack.top());
        System.out.println("Pop is: " + stack.pop());
        System.out.println(stack.empty());

        System.out.println("Top is: " + stack.top());
        System.out.println("Pop is: " + stack.pop());
        System.out.println(stack.empty());

    }
}
