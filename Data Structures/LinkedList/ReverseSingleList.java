package com.LinkedList;

/**
 * Reverse a singly linked list.
 *
 * Example:
 *
 * Input: 1->2->3->4->5->NULL
 * Output: 5->4->3->2->1->NULL
 */

/**
 * You want to iterate by keeping 3 nodes in sequential order, starting with the head of the list. You simply make
 * previous, current, and last nodes that occur in that order. Make current.next = previous. Now move the nodes right one,
 * by making previous = current, current = last, and last = last.next. Make a check in the loop to see if last.next = null.
 * This means you've reached the tail, so now just make last point to your current.
 */
public class ReverseList
{
    public static ListNode reverseList(ListNode head)
    {
        if(head == null)
        {
            return null;
        }
        else if(head.next == null)
        {
            return head;
        }
        else if(head.next.next == null)
        {
            ListNode temp = head.next;
            head.next = null;
            temp.next = head;
            return temp;
        }

        ListNode previous = head;
        ListNode current = previous.next;
        ListNode last = current.next;
        previous.next = null; //Head is now the tail, which points to null.

        while(last != null)
        {
            current.next = previous;
            if(last.next == null) //Reached the tail, the new head of the list.
            {
                last.next = current;
                return last;
            }
            previous = current;
            current = last;
            last = last.next;
        }
        return last;
    }
}