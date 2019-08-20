package com.LinkedList;

/**
 * You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order and each of their nodes contain a single digit. Add the two numbers and return it as a linked list.
 *
 * You may assume the two numbers do not contain any leading zero, except the number 0 itself.
 *
 * Example:
 *
 * Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
 * Output: 7 -> 0 -> 8
 * Explanation: 342 + 465 = 807.
 */
class AddTwoNumbers
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

    public ListNode addTwoNumbers(ListNode l1, ListNode l2)
    {
        int carry = 0;
        ListNode dummy = new ListNode(0);
        ListNode cur = dummy;
        while(l1!=null||l2!=null)
        {
            int x, y;

            if(l1 != null)
            {
                x = l1.val;
            }
            else
            {
                 x = 0;
            }

            if(l2 != null)
            {
                y = l2.val;
            }
            else
            {
                y = 0;
            }

            int sum = x+y+carry;
            carry = sum/10;
            sum = sum%10;
            cur.next = new ListNode(sum);
            cur = cur.next;
            if(l1!=null)
            {
                l1=l1.next;
            }
            if(l2!=null)
            {
                l2=l2.next;
            }
        }
        if(carry!=0)
        {
            cur.next = new ListNode(carry);
        }
        return dummy.next;
    }

}
