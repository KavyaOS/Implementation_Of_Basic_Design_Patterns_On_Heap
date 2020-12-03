package com.company;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NodeTest {

    Node node=new Node();
    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void findDepth() {
        assertEquals(1,node.findDepth(node));
    }

    @Test
    void getSize() {
        assertEquals(1,node.getSize(node,0));
    }

    @Test
    void isNull() {
        assertEquals(false,node.isNull());
    }
}