package com.company;

import static java.lang.Math.max;


public class Node extends AbstractNode{
    public int value;
    public Node left, right;

    //To get the number of child nodes
    int getSize(Node node, int count)
    {
        AbstractNode node1=NodeFactory.getNode(node);
        if(node1.isNull())
            return 0;
        count = 1 + getSize(node.left,count) + getSize(node.right,count);
        return count;
    }

    //To find height of a tree
    public int findDepth(Node node)
    {
        //Decides whether to use the current node or a nullNode further
        AbstractNode node1=NodeFactory.getNode(node);
        if(node1.isNull())
            return 0;
        else {
            int leftLength=findDepth(node.left);
            int rightLength=findDepth(node.right);
            return max(leftLength, rightLength) + 1;
        }
    }

    @Override
    public boolean isNull() {
        return false;
    }
}
