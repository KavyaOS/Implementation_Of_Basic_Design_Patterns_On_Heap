package com.company;

import java.util.ArrayList;

public class OddHeapDecorator{
    Heap heap;
    public OddHeapDecorator(Heap heap)
    {
        this.heap=heap;
    }

    //Decorates Array to return odd elements
    public Object[] toArray()
    {
        ArrayList<Integer> arrayList = new ArrayList<>();
        Object[] arr=heap.toArray();
        for(int i=0; i< arr.length; i++) {
            if (((int)arr[i] % 2) != 0)
                arrayList.add((int)arr[i]);
        }
        return arrayList.toArray();
    }

    //Decorates String to return odd elements
    public String toString()
    {
        String string=heap.toString();
        StringBuilder stringBuilder = new StringBuilder();
        String[] values=string.split(" ");
        for(String i: values)
        {
            int num=Integer.parseInt(String.valueOf(i));
            if(num%2!=0) {
                stringBuilder.append(i);
                stringBuilder.append(" ");
            }
        }
        return stringBuilder.toString();
    }

    //Decorates an Iterator to return odd elements
    public Iterator<Node> getIterator()
    {
        Iterator<Node> iterator= heap.getIterator();
        OddFilter oddIterator=new OddFilter(iterator);

        return oddIterator;
    }

}
