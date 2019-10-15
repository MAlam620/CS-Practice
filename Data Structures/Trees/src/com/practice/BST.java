package com.company;

public class BST
{
    Node root;

    BST()
    {
        this.root = null;
    }


    public void insert(int val)
    {
        Node newNode = new Node(val);

        //Empty Tree
        if(this.root == null)
        {
            this.root = newNode;
            return;
        }

        Node currentNode = root;

        while(true)
        {
            if(val < currentNode.val) //First search for left values
            {
                if(currentNode.left == null)
                {
                    currentNode.left = newNode;
                    return;
                }
                currentNode = currentNode.left;
            }
            else
            {
                if(currentNode.right == null)
                {
                    currentNode.right = newNode;
                    return;
                }
                currentNode = currentNode.right;
            }
        }
    }

    public boolean lookup(int val)
    {
        if(this.root == null)
        {
            return false;
        }
        else
        {
            Node currentNode = root;
            while(true)
            {
                if(currentNode.val == val)
                {
                    return true;
                }
                else if(currentNode.val < val)
                {
                    currentNode = currentNode.left;
                }
                else
                {
                    currentNode = currentNode.right;
                }

                if(currentNode == null)
                {
                    return false;
                }
            }

        }
    }
}
