package com.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NullNodeTest {
    NullNode nullNode=new NullNode();

    @Test
    void isNull() {
        assertEquals(true,nullNode.isNull());
    }
}