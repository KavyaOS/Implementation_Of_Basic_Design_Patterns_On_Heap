package com.company;

public class Context {

    private Heap heap;

    public Context(Heap heap)
    {
        this.heap=heap;
    }

    //Helps Heap node to swap it's value with new input value when required
    public int swapValues(int newValue, Node node)
    {
        return heap.swapValues(newValue,node);
    }

    //Help heap to add newValue to it's nodes
    public boolean add(int value)
    {
        return heap.add(value);
    }

}
