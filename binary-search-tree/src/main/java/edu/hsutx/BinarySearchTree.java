package edu.hsutx;

/**
 * @author Todd Dole
 * @version 1.0
 * Starting Code for the CSCI-3323 Binary Search Tree assignment
 * Students must complete the TODOs and get the tests to pass
 */


/**
 * A Binary Search Tree that takes int key and String value for each node
 * TODO - add further javadoc here including @author and @version tags
 */

public class BinarySearchTree {
    Node head;

    private class Node {
        public int key;
        public String value;
        public Node left;
        public Node right;
        public Node parent;
        public Node(int key, String value, Node parent) {
            this.key = key;
            this.value = value;
            this.parent = parent;
            this.left = null;
            this.right = null;
        }

        // TODO - add comments as appropriate including a javadoc for each method
        public int getDepth() {
            // TODO - calculate the depth of the node and return an int value.
            // head is depth 1
            // hint - use a lopp to count # of steps it takes to reach a null value by
            // parent, parent->parent, parent->parent->parent etc
            return 0;
        }
    }

    public BinarySearchTree() {
    // TODO - build a constructor class
    }

    public void insert(int key, String value) {
    // TODO - insert a new node into the tree with key and value
    // Note - do not allow insertion of a duplicate key
    }

    public void delete(int key) {
    // TODO - if the key exists in the tree, delete the node and adjust the tree appropriately
    // Will need to handle three cases:
        // 1 - node to be deleted has no children
        // 2 - node to be deleted has one child
        // 3 - node to be deleted has two children
    }

    Node find(int key) {
        // TODO - if the key exists in the tree, return the Node where it is located
        // Otherwise, return the spot it would be inserted
        return null;
    }

    public String getValue(int key) {
        // TODO - use find() to find the key if it exists, and return the value from the node
        // If key is not found, return null
        return null;
    }

    public boolean isEmpty() {
        // TODO - return true if there are no nodes in the tree
        // Otherwise return false
        return true;
    }

    // returns the depth of the node with key, or 0 if it doesn't exist
    public int getDepth(int key) {
        Node node=find(key);
        if (node != null) return node.getDepth();
        return 0;
    }

    public void printAllData() {
        // TODO - recursively visit all nodes in the tree and print the value for each node.
        // Make sure the order is correct, from smallest key to biggest key
        // For our Bible application, Genesis 1:1 should be the first
        // You can optionally use BibleReferenceConverter.convertToReference to add the verse
        // reference to each verse.  (Not required because it would lock this method in to
        // only being used for the BibleTree app, which is not good OOP design.  Is there a
        // better way to accomplish this?)
    }
}
