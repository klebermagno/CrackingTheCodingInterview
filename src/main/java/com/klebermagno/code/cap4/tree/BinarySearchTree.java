package com.klebermagno.code.cap4.tree;

public class BinarySearchTree {

    // BST Node
    class Node {
        int key;
        Node left, right;

        public Node(int item) {
            key = item;
            left = right = null;
        }
    }

    // Root of BST
    Node root;

    // Constructor
    BinarySearchTree() {
        root = null;
    }

    // Insert method
    void insert(int key) {

    }

    // Recursive method to insert a new key in the BST
    Node insertRec(Node root, int key) {


        return root;
    }

    // Method to do inorder traversal of the BST
    void inorder() {

    }

    // Recursive method to do inorder traversal of the tree
    void inorderRec(Node root) {

    }

    // Method to search a given key in BST
    public Node search(Node root, int key) {
    return null;
    }

    // Main Method
    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree();

        /* Let's create following BST
              50
           /     \
          30      70
         /  \    /  \
        20   40  60   80 */

        tree.insert(50);
        tree.insert(30);
        tree.insert(20);
        tree.insert(40);
        tree.insert(70);
        tree.insert(60);
        tree.insert(80);

        // Print inorder traversal of the BST
        tree.inorder();
    }
}
