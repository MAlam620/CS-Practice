package com.practice;

public class QueueUsingStack
{
    MyStack stack;

    public QueueUsingStack()
    {
        stack = new MyStack();
    }

    public void push(int x)
    {
        stack.push(x);
    }

    public int pop()
    {
        if(stack.length == 1)
        {
            return stack.pop();
        }

        ListNode first = new ListNode(stack.pop());
        ListNode second = new ListNode(stack.pop());

        while(!stack.empty())
        {
            ListNode last = new ListNode(stack.pop());
            second.next = first;
            first = second;
            second = last;
        }
        second.next = first; //Reversed order of a stack.

        int returnValue = second.val;
        second = second.next;

        while(second != null)
        {
            stack.push(second.val);
            second = second.next;
        }
        return returnValue;
    }

    public int peek()
    {
        if(stack.length == 1)
        {
            return stack.top();
        }

        ListNode first = new ListNode(stack.pop());
        ListNode second = new ListNode(stack.pop());

        while(!stack.empty())
        {
            ListNode last = new ListNode(stack.pop());
            second.next = first;
            first = second;
            second = last;
        }
        second.next = first; //Reversed order of a stack.

        int returnValue = second.val;

        while(second != null)
        {
            stack.push(second.val);
            second = second.next;
        }
        return returnValue;
    }

    public boolean empty()
    {
        if(stack.empty())
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

    }



}
