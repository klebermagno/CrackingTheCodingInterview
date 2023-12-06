package com.klebermagno.code.cap4.graph;

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
     */

    Node findNode(Node root, int value){
        while(root != null){
            int currValue = root.getValue();
            if(currValue==value)
                return root;
            if(currValue<value)
                root = root.getRight();
            else
                root = root.getLeft();

        }
        return null;
    }

    //TODO
    Node findNodeRecusive(Node root, int value){

        return null;
    }

    //first on the node itself, then on its left descendants, and
    //finally on its right
    //TODO preorderTraversal(
    //TODO inorderTraversal
    //TODO postorderTraversal
}
