package com.company;

public class MaxHeap extends Heap {

    //Swaps input value with heap's current node value if necessary as per MaxHeap condition
    public int swapValues(int newValue, Node node)
    {
        int toBeInserted=newValue;
        if(newValue>node.value)
        {
            toBeInserted=node.value;
            node.value=newValue;
        }
        return toBeInserted;
    }
}
