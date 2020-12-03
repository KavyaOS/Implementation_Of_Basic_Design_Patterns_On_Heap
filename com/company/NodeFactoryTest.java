package com.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NodeFactoryTest {

    NodeFactory nodeFactory;
    Node node;
    AbstractNode abstractNode=nodeFactory.getNode(node);
    @Test
    void getNode() {
        assertEquals(true,abstractNode.isNull());
    }
}