package com.company;

//Generates the node of customized type when required
public class NodeFactory {
    public static AbstractNode getNode(Node node)
    {
        if(node!=null)
            return node;
        return new NullNode();
    }
}
