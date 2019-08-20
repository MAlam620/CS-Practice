package com.LinkedList;

/**
 * Given a sorted linked list, delete all duplicates such that each element appear only once.
 *
 * Example 1:
 *
 * Input: 1->1->2
 * Output: 1->2
 * Example 2:
 *
 * Input: 1->1->2->3->3
 * Output: 1->2->3
 */
public class RemoveDuplicatesSortedList
{
    static class ListNode
    {
        int val;
        ListNode next;
        ListNode(int x)
        {
            val = x;
        }
    }
    public static ListNode deleteDuplicates(ListNode head)
    {
        if(head == null)
        {
            return head;
        }
        if(head.next == null)
        {
            return head;
        }

        ListNode previous = head;
        ListNode forward = previous.next;

        while(forward != null)
        {
            if(forward.val == previous.val)
            {
                ListNode newNext = forward.next;
                previous.next = newNext;
                forward = newNext;
            }
            else
            {
                previous = forward;
                forward = forward.next;
            }
        }
        return head;
    }
}
