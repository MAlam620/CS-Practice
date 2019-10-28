package com.company;
import java.lang.*;
/**
 * You want to find the height of the entire tree. The strategy is to compute the height of the
 * left subtree and right subtree from the root. Take the max of this, and add 1, since you want
 * to include the edge connecting the root to the subtree.
 */
public class FindHeight
{
    public int findHeight(Node root)
    {
        if(root == null)
        {
            return -1;
        }
        int leftHeight = findHeight(root.left);
        int rightHeight = findHeight(root.right);

        return Math.max(leftHeight, rightHeight) + 1;
    }
}
