package com.company;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ContextTest {
    Heap heap = new Heap(new MinHeap());
    Context context=new Context(heap);
    @BeforeEach
    void setUp() {
        context.add(1);
        context.add(2);
    }

    @Test
    void add() {
        assertEquals(true,context.add(3));
    }
}