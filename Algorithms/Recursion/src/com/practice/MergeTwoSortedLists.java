package com.practice;

public class MergeTwoSortedLists
{
    public Node mergeTwoLists(Node l1, Node l2)
    {
        if(l1 == null)
        {
            return l2;
        }
        else if(l2 == null)
        {
            return l1;
        }
        else
        {
            Node head;
            if(l1.value < l2.value)
            {
                head = l1;
                head.next = (mergeTwoLists(l1.next, l2));
            }
            else
            {
                head = l2;
                head.next = mergeTwoLists(l1, l2.next);
            }
            return head;
        }
    }
}


