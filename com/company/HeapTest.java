package com.company;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HeapTest {

    private Heap minHeap=new Heap(new MinHeap());
    private Heap maxHeap=new Heap(new MaxHeap());
    Object minHeapArray= new int[]{17, 1, 12, -1, 9, 3};

    @BeforeEach
    void setUp() {

        minHeap.add(1);
        minHeap.add(12);
        minHeap.add(3);
        minHeap.add(17);
        minHeap.add(9);
        minHeap.add(-1);

        maxHeap.add(1);
        maxHeap.add(12);
        maxHeap.add(3);
        maxHeap.add(17);
        maxHeap.add(9);
        maxHeap.add(-1);
    }

    @Test
    void toArray() {

        //assertArrayEquals( minHeapArray[],minHeap.toArray());
        //assertEquals("[17, 1, 12, -1, 9, 3]",minHeap.toArray());

    }

    @Test
    void testToString() {
        assertEquals("17 1 12 -1 9 3 ",minHeap.toString());
        assertEquals("1 12 -1 17 3 9 ",maxHeap.toString());
    }

    @Test
    void findDepth() {
        assertEquals(3,minHeap.findDepth());
        assertEquals(3,maxHeap.findDepth());
    }

    @Test
    void add() {
        assertEquals(true,minHeap.add(1));
        assertEquals(true,maxHeap.add(1));
    }

    @Test
    void size() {
        assertEquals(6,minHeap.size());
        assertEquals(6,maxHeap.size());
    }
}