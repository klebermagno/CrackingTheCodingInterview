package com.klebermagno.code.cap4.tree;

public interface BinaryTree {

    void insert(int value);  // Method to insert a new value
    boolean contains(int value);  // Method to check if a value exists in the tree
    void delete(int value);  // Method to delete a value from the tree
    void traverseInOrder();  // Method for in-order traversal

    public void rebalance();
}

