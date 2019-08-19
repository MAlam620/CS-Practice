package com.LinkedList;

/**
 * Merge two sorted linked lists and return it as a new list. The new list should be made by splicing together the nodes of the first two lists.
 *
 * Example:
 *
 * Input: 1->2->4, 1->3->4
 * Output: 1->1->2->3->4->4
 */
public class MergeTwoSortedLists
{
    public ListNode mergeTwoLists(ListNode l1, ListNode l2)
    {
        ListNode head = new ListNode(-1);
        ListNode currentNode;
        ListNode tail = head;
        while(l1 != null && l2 != null)
        {
            if(l1.val < l2.val)
            {
                currentNode = new ListNode(l1.val);
                tail.next = currentNode;
                tail = currentNode;
                l1 = l1.next;
            }
            else
            {
                currentNode = new ListNode(l2.val);
                tail.next = currentNode;
                tail = currentNode;
                l2 = l2.next;
            }
        }

        while(l1 != null)
        {
            currentNode = new ListNode(l1.val);
            tail.next = currentNode;
            tail = currentNode;
            l1 = l1.next;
        }
        while(l2 != null)
        {
            currentNode = new ListNode(l2.val);
            tail.next = currentNode;
            tail = currentNode;
            l2 = l2.next;
        }
        head = head.next;
        return head;
    }
}
