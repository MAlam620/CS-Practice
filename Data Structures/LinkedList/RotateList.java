package com.LinkedList;

/**
 * Given a linked list, rotate the list to the right by k places, where k is non-negative.
 *
 * Example 1:
 *
 * Input: 1->2->3->4->5->NULL, k = 2
 * Output: 4->5->1->2->3->NULL
 * Explanation:
 * rotate 1 steps to the right: 5->1->2->3->4->NULL
 * rotate 2 steps to the right: 4->5->1->2->3->NULL
 * Example 2:
 *
 * Input: 0->1->2->NULL, k = 4
 * Output: 2->0->1->NULL
 * Explanation:
 * rotate 1 steps to the right: 2->0->1->NULL
 * rotate 2 steps to the right: 1->2->0->NULL
 * rotate 3 steps to the right: 0->1->2->NULL
 * rotate 4 steps to the right: 2->0->1->NULL
 */
public class RotateList
{
    public static ListNode rotateRight(ListNode head, int k)
    {
        if(head == null || head.next == null || k == 0)
        {
            return head;
        }

        int length = 0;
        ListNode current = head;
        ListNode originalTail = null;

        while(current != null) //Get length of the original list.
        {
            originalTail = current;
            current = current.next;
            length++;
        }

        k = k % length;

        if(k == 0)
        {
            return head;
        }
        else if(k == 1)
        {
            current = head;
            ListNode beforeTail = null;
            while(current.next != null)
            {
                beforeTail = current;
                current = current.next;
            }
            beforeTail.next = null;
            originalTail.next = head;
            return originalTail;
        }
        else
        {
            current = head;
            ListNode previous = null;
            int iterationsToHead = length - k;

            while(iterationsToHead > 0)
            {
                previous = current;
                current = current.next;
                iterationsToHead--;
            }
            previous.next = null;
            originalTail.next = head;
            return current;
        }
    }

    public static void main(String[] args)
    {
        ListNode l1 = new ListNode(0);
        ListNode l2 = new ListNode(1);
        l1.next = l2;
        ListNode l3 = new ListNode(2);
        l2.next = l3;
        ListNode l4 = new ListNode(3);
        l3.next = l4;
        ListNode l5 = new ListNode(4);
        l4.next = l5;
        ListNode l6 = new ListNode(5);
        l5.next = l6;
        ListNode l7 = new ListNode(6);
        l6.next = l7;
        ListNode l8 = new ListNode(7);
        l7.next = l8;
//        ListNode l9 = new ListNode(8);
//        l8.next = l9;
//        ListNode l10 = new ListNode(9);
//        l9.next = l10;

        l1 = rotateRight(l1, 11);
//        System.out.println(l1.val);

        while(l1 != null)
        {
            System.out.print(l1.val + "--> ");
            l1 = l1.next;
            if(l1 == null)
            {
                System.out.print("null");
            }
        }
    }
}
