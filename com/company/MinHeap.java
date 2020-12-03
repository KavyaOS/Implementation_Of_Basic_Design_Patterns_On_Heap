package com.company;

import java.util.ArrayList;

public class MinHeap extends Heap {

    //Swaps input value with heap's current node value if necessary as per MinHeap condition
    public int swapValues(int newValue, Node node)
    {
        int toBeInserted=newValue;
        if(newValue<node.value)
        {
            toBeInserted=node.value;
            node.value=newValue;
        }
        return toBeInserted;
    }
}
