package com.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NodeRepositoryTest {
    private Heap minHeap=new Heap(new MinHeap());
    private Heap maxHeap=new Heap(new MaxHeap());
    Iterator minHeapIterator= minHeap.getIterator();
    Iterator maxHeapIterator= maxHeap.getIterator();

    @Test
    void checkEmptyIterator() {
        assertEquals(false,minHeapIterator.hasNext());
        assertEquals(false,maxHeapIterator.hasNext());
    }

    @Test
    void checkMinHeapIterator()
    {
        minHeap.add(1);
        minHeap.add(12);
        minHeap.add(3);
        minHeap.add(17);
        minHeap.add(8);
        minHeap.add(-1);
        Iterator minHeapIterator= minHeap.getIterator();
        assertEquals(true,minHeapIterator.hasNext());
        assertEquals(17,minHeapIterator.next());
        minHeapIterator.next();
        minHeapIterator.next();
        minHeapIterator.next();
        minHeapIterator.next();
        assertEquals(3,minHeapIterator.next());
    }

    @Test
    void checkMaxHeapIterator()
    {
        maxHeap.add(1);
        maxHeap.add(12);
        maxHeap.add(3);
        maxHeap.add(17);
        maxHeap.add(8);
        maxHeap.add(-1);

        Iterator maxHeapIterator= maxHeap.getIterator();
        assertEquals(true,maxHeapIterator.hasNext());
        assertEquals(1,maxHeapIterator.next());
        maxHeapIterator.next();
        maxHeapIterator.next();
        maxHeapIterator.next();
        maxHeapIterator.next();
        assertEquals(8,maxHeapIterator.next());
    }
}