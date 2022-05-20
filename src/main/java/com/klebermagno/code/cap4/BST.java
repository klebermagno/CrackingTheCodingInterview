package com.klebermagno.code.cap4;

/**
 * Binary  search tree (BST)
 *
 * Left child is less than or equal to its own value
 */
public class BST {

    class Node{
        Node left;
        Node right;
        int value;

        public Node(Node left, Node right, int value){
            this.left= left;
            this.right = right;
            this.value = value;
        }

        public int getValue() {
            return value;
        }

        public Node getLeft() {
            return left;
        }

        public Node getRight() {
            return right;
        }
    }

    /**
     * O(log(n))
     * @param root
     * @param value
     * @return
     */

    Node findNode(Node root, int value){
        while(root != null){
            int currvalue = root.getValue();
            if(currvalue==value)
                return root;
            if(currvalue<value)
                root = root.getRight();
            else
                root = root.getRight();

        }
        return null;
    }
    Node findNodeRecusive(Node root, int value){
        while(root != null){
            int currvalue = root.getValue();
            if(currvalue==value)
                return root;
            if(currvalue<value)
                root = root.getRight();
            else
                root = root.getRight();

        }
        return null;
    }
}
