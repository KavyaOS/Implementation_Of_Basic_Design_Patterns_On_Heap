package com.company;

//Filters the iterator to iterate through odd nodes only
public class OddFilter implements Iterator<Node> {
    Iterator<Node> iterator;
    int value;
    OddFilter(Iterator<Node> iterator)
    {
        this.iterator= iterator;
    }

    public boolean hasNext()
    {
        while(iterator.hasNext()) {
            value = iterator.next();
            if (value % 2 != 0) {
                return true;
            }
        }
        return false;
    }

    public int next()
    {
        return value;
    }
}
