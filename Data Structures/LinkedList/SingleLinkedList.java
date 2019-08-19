package com.LinkedList;

public class SingleLinkedList
{
    Node head = null;
    Node tail = null;
    int length = 0;

    SingleLinkedList(int value)
    {
        Node newNode = new Node(value);
        this.head = newNode;
        this.tail = newNode;
        this.tail.next = null;
        this.length = 1;
    }

    public void append(int value)
    {
        Node newNode = new Node(value);
        newNode.next = null;
        this.tail.next = newNode;
        this.tail = newNode;
        length++;
    }

    public void prepend(int value)
    {
        Node newNode = new Node(value);
        newNode.next = this.head;
        this.head = newNode;
        length++;
    }

    public void insert(int index, int value)
    {
        //Check if user is actually inserting value in tail or head.
        if(value >= this.length)
        {
            this.append(value);
        }
        else if(index == 0)
        {
            prepend(value);
        }
        else
        {
            Node newNode = new Node(value);

            Node previousNode = traverseToIndex(index - 1); //Always start iterating with the head.
            Node nextNode = traverseToIndex(index); //This node is the current node at the index. Shifted right now.

            newNode.next = nextNode; //The new node points to node at current index now
            previousNode.next = newNode; //The previous node points to new node, completing the chain
        }

        length++;
    }

    public void remove(int index)
    {
        if(this.length <= 1) //Can't delete if Linked List is empty or only one node
        {
            return;
        }
        Node node = traverseToIndex(index);

        if(node == this.head)
        {
            node.next = head;
            node.next = null;
        }

        else if(node == tail)
        {
            Node newTail = traverseToIndex(index - 1);
            newTail = this.tail;
            newTail.next = null;
        }

        else if(node.next == tail)
        {
            node = this.tail;
            node.next = null;
        }

        else
        {
            Node previousNode = traverseToIndex(index - 1);
            previousNode.next = node.next;
            node.next = null;
        }
        this.length --;
    }

    public Node traverseToIndex(int index)
    {
        Node returnNode = head;

        for(int i = 1; i <= index; i++)
        {
            returnNode = returnNode.next;
        }

        return returnNode;
    }


    public void printList()
    {
        Node currentNode = this.head;

        while(currentNode != null)
        {
            System.out.println(currentNode.value);
            currentNode = currentNode.next;
        }
    }
}
