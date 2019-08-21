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
 *
 */
public class ReverseList
{
    public static ListNode reverseBetween(ListNode head, int m, int n)
    {
        if(head == null)
        {
            return null;
        }
        else if(head.next == null)
        {
            return head;
        }

        ListNode atM = head;
        ListNode beforeM = null;

        for(int i = 1; i < m; i++) //We have the node where m is now.
        {
            if(i == m - 1)
            {
                beforeM = atM;
            }
            atM = atM.next;
        }
        ListNode current = atM;
        ListNode next = current.next;
        for(int i = m; i < n; i++)
        {
            current = current.next;
        }

        return current;
    }

    public static void main(String[] args)
    {
        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(2);
        l1.next = l2;
        ListNode l3 = new ListNode(3);
        l2.next = l3;
        ListNode l4 = new ListNode(4);
        l3.next = l4;
        ListNode l5 = new ListNode(5);
        l4.next = l5;
        ListNode l6 = new ListNode(6);
        l5.next = l6;
        ListNode l7 = new ListNode(7);
        l6.next = l7;
        ListNode l8 = new ListNode(8);
        l7.next = l8;
        ListNode l9 = new ListNode(9);
        l8.next = l9;
        ListNode l10 = new ListNode(10);
        l9.next = l10;

        l1 = reverseBetween(l1, 2, 6);
        System.out.println(l1.val);
//       while(l1 != null)
//       {
//           System.out.print(l1.val + "--> ");
//           l1 = l1.next;
//           if(l1 == null)
//          {
//               System.out.print("null");
//           }
//       }
    }
}
