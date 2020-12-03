package com.company;

import java.util.ArrayList;
//import java.util.PriorityQueue;
import java.util.AbstractCollection;
import java.util.function.Consumer;

public class Heap extends AbstractCollection {
    private Node root;
    Context currentHeap;

    Heap()
    {
        root=null;
    }

    //To check whether the heap is empty. If empty create a new Heap else proceed with the existing heap
    Heap(Heap heap)
    {
        if(heap.currentHeap==null)
            this.currentHeap=new Context(heap);
        else {
            this.currentHeap = heap.currentHeap;
            this.root= heap.root;
        }
    }

    //To add values to the heap
    private Node add(int newValue,Node node)
    {
        AbstractNode node1=NodeFactory.getNode(node);//Decides whether to use the current node or a nullNode further
        if(node1.isNull())
        {
            node=new Node();
            node.value=newValue;
            node.left=node.right=null;
        }
        else
        {
            int toBeInserted=currentHeap.swapValues(newValue,node);//Swaps input value with the current node value as required by the property of current heap

            if(root.findDepth(node.left)>root.findDepth(node.right))
                node.right=add(toBeInserted,node.right);
            else
                node.left=add(toBeInserted,node.left);
        }
        return node;
    }

    //To add values to the heap
    public boolean add(Integer value)
    {
        root=add(value,root);
        AbstractNode node=NodeFactory.getNode(root);
        if(node.isNull())
            return false;
        return true;
    }

    //To fetch the set of heap elements
    @Override
    public Object[] toArray()
    {
        ArrayList<Integer> arrayList = new ArrayList<>();
        return toArray(root, arrayList);
    }

    private Object[] toArray(Node root, ArrayList<Integer> arrayList)
    {
        AbstractNode node=NodeFactory.getNode(root);
        if(node.isNull())
            return arrayList.toArray();

        toArray(root.left,arrayList);
        arrayList.add(root.value);
        toArray(root.right,arrayList);
        return arrayList.toArray();
    }

    private String toString(Node root, StringBuilder str)
    {
        AbstractNode node=NodeFactory.getNode(root);
        if(node.isNull())
            return "";
        toString(root.left,str);
        str.append(root.value);
        str.append(" ");
        toString(root.right,str);

        //System.out.println(root.value);
        return str.toString();
    }

    //To fetch the set of heap elements as a single string
    @Override
    public String toString() {
        String string;
        StringBuilder str=new StringBuilder();
        string=toString(root,str);
        return string;
    }

    //Swaps input value with the current node value as required by the property of current heap
    public int swapValues(int newValue, Node node) {
        return swapValues(newValue,node);
    }

    //To find heap height
    public int findDepth()
    {
        return root.findDepth(root);
    }

    //To fetch iterator to work on heap elements
    @Override
    public java.util.Iterator iterator() {
        return (java.util.Iterator) getIterator();
    }

    public Iterator<Node> getIterator() {
        NodeRepository nodeRepository=new NodeRepository();
        Iterator<Node> iterator= nodeRepository.getIterator(root);
        return iterator;
    }

    //returns number of nodes in the heap
    @Override
    public int size() {
        int count=0;
        count=root.getSize(root,count);
        return count;
    }

    @Override
    public void forEach(Consumer action) {
        NodeRepository nodeRepository=new NodeRepository();
        Iterator<Node> iterator= nodeRepository.getIterator(root);
        while(iterator.hasNext()) {
            action.accept(iterator.next());
        }
    }
}
