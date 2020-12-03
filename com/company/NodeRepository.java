package com.company;

import java.util.Stack;

//Create an iterator to iterate through heap nodes
public class NodeRepository implements Container {

    public Iterator<Node> getIterator(Node root) {
        return new HeapIterator(root);
    }

    private class HeapIterator implements Iterator<Node> {
        Stack<Node> stack;

        public HeapIterator(Node root) {
            stack = new Stack<Node>();
            while (root != null) {
                stack.push(root);
                root = root.left;
            }
        }

        @Override
        public boolean hasNext() {
            return !stack.isEmpty();
        }

        @Override
        public int next() {
            Node node = stack.pop();
            int result = node.value;
            if (node.right != null) {
                node = node.right;
                while (node != null) {
                    stack.push(node);
                    node = node.left;
                }
            }
            return result;
        }
    }
}
