package com.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OddFilterTest {
    private Heap minHeap=new Heap(new MinHeap());
    private Heap maxHeap=new Heap(new MaxHeap());
    Iterator minHeapIterator= minHeap.getIterator();
    Iterator maxHeapIterator= maxHeap.getIterator();

    OddFilter maxHeapOddFilter = new OddFilter(maxHeapIterator);
    OddFilter minHeapOddFilter = new OddFilter(minHeapIterator);

    @Test
    void checkEmptyOddFilter() {
        assertEquals(false,minHeapOddFilter.hasNext());
        assertEquals(false,maxHeapOddFilter.hasNext());
    }

    @Test
    void minHeapOddFilter()
    {
        minHeap.add(1);
        minHeap.add(12);
        minHeap.add(3);
        minHeap.add(17);
        minHeap.add(8);
        minHeap.add(-1);
        Iterator minHeapIterator= minHeap.getIterator();
        OddFilter minHeapOddFilter = new OddFilter(minHeapIterator);
        assertEquals(true,minHeapOddFilter.hasNext());
        assertEquals(17,minHeapOddFilter.next());
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
        OddFilter maxHeapOddFilter = new OddFilter(maxHeapIterator);
        assertEquals(true,maxHeapOddFilter.hasNext());
        assertEquals(1,maxHeapOddFilter.next());
    }
}