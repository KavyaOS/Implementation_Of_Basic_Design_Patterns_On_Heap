package com.company;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OddHeapDecoratorTest {

    private Heap minHeap=new Heap(new MinHeap());
    private Heap maxHeap=new Heap(new MaxHeap());
    Object minHeapArray= new int[]{17, 1, 12, -1, 9, 3};

    @BeforeEach
    void setUp() {

        minHeap.add(1);
        minHeap.add(12);
        minHeap.add(3);
        minHeap.add(17);
        minHeap.add(8);
        minHeap.add(-1);

        maxHeap.add(1);
        maxHeap.add(12);
        maxHeap.add(3);
        maxHeap.add(17);
        maxHeap.add(8);
        maxHeap.add(-1);
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void testMinHeapDecorator()
    {
        OddHeapDecorator decoratedHeap = new OddHeapDecorator(minHeap);
        assertEquals("17 1 -1 3 ",decoratedHeap.toString());
    }

    @Test
    void testMaxHeapDecorator()
    {
        OddHeapDecorator decoratedHeap = new OddHeapDecorator(maxHeap);
        assertEquals("1 -1 17 3 ",decoratedHeap.toString());
    }
}