package com.LinkedList;

public class MiddleOfList
{
    public static ListNode middleNode(ListNode head)
    {
        int counter = 0;
        ListNode current = head;

        while(current != null)
        {
            current = current.next;
            counter++;
        }
        current = head;
        counter = (counter / 2) ;

        for(int i = 0; i < counter; i++)
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
//        ListNode l7 = new ListNode(7);
//        l6.next = l7;
//        ListNode l8 = new ListNode(8);
//        l7.next = l8;
//        ListNode l9 = new ListNode(9);
//        l8.next = l9;
//        ListNode l10 = new ListNode(10);
//        l9.next = l10;

        l1 = middleNode(l1);


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
