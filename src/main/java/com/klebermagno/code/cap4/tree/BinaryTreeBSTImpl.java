package com.klebermagno.code.cap4.tree;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * SimpleBinaryTree - Basic Binary Search Tree (BST)
 * Basic BST Properties:
 * * Each node has up to two children (left and right).
 * * The left child's value is less than its parent's value, and the right child's value is greater than its parent's
 *   value.
 * * The insert, traverseInOrder, and contains methods adhere to these basic BST rules.
 *
 * Lacks Self-Balancing Mechanism:
 * * This implementation does not include any mechanism for self-balancing. In a BST like this, the tree can become
 *   skewed or unbalanced depending on the order of insertions, which can degrade performance.
 * Simple Operations:
 * The operations (insert, search) are straightforward and do not adjust the tree's structure to maintain a balanced
 *  height.
 */
public class BinaryTreeBSTImpl implements BinaryTree{

    private Node root;

    private static class Node {
        int value;
        Node left;
        Node right;

        Node(int value) {
            this.value = value;
        }
    }
    @Override
    public void insert(int value) {
        root = insertRecursive(root, value);

    }

    private Node insertRecursive(Node currentRoot, int value) {
        if (currentRoot == null) {
            return new Node(value);
        }

        if( value < currentRoot.value) {
            currentRoot.left = insertRecursive(currentRoot.left,value);
        } else {
            currentRoot.right = insertRecursive(currentRoot.right, value);
        }

        return currentRoot;
    }

    public void preOrderTraversal(){
        privatePreorderTraversal(root);
    }

    private void privatePreorderTraversal(Node node) {
      System.out.println(node.value);
      privatePreorderTraversal(node.left);
      privatePreorderTraversal(node.left);
    }

    @Override
    public boolean contains(int value) {

        Node node = root;
        while(node !=null){
            System.out.println(node.value);
            if (node.value == value )
                return true;
            if ( value < node.value  ){
                node = node.left;
            } else {
                node = node.right;
            }
        }
        return false;
    }

    @Override
    public void delete(int value) {

    }

    /**
     * Left,Root,Right
     */
    @Override
    public void traverseInOrder() {
        traverseInOrderRecursive(root);
    }

    private void traverseInOrderRecursive(Node node) {
        if (node != null ) {
            traverseInOrderRecursive(node.left);
            System.out.print(node.value + " ");
            traverseInOrderRecursive(node.right);
        }
    }
    @Override
    public void rebalance() {

    }

    public static void main(String[] args) {
        BinaryTreeBSTImpl tree = new BinaryTreeBSTImpl();

        tree.insert(5);
        tree.insert(3);
        tree.insert(7);
        tree.insert(2);
        tree.insert(4);
        tree.insert(6);
        tree.insert(8);

        tree.traverseInOrder();  // Should print the numbers in sorted order
        System.out.println("ASCII Tree Representation:");
        tree.printAsciiTree();
        assertEquals(tree.contains(7), true);
        assertEquals(tree.contains(1), false);
    }

    public static void assertEquals(Object expected, Object received){
        if(expected.equals(received)){
            System.out.println("Success!");
        }else{
            System.out.println("Fail!");
        }
    }
    public static void assertEquals(boolean expected, boolean received){
        if(expected == received){
            System.out.println("Success!");
        }else{
            System.out.println("Fail!");
        }
    }
    public void printAsciiTree() {
        if (root == null) {
            System.out.println("(empty tree)");
            return;
        }

        int height = getHeight(root);
        int width = (int)Math.pow(2, height - 1);

        // Preparing list of lists for each level of the tree
        List<List<String>> lines = new ArrayList<>();

        List<Node> level = new ArrayList<>();
        List<Node> next = new ArrayList<>();
        level.add(root);
        int nn = 1;
        int widest = 0;

        while (nn != 0) {
            List<String> line = new ArrayList<>();
            nn = 0;

            for (Node node : level) {
                if (node == null) {
                    line.add(null);
                    next.add(null);
                    next.add(null);
                } else {
                    String aa = String.valueOf(node.value);
                    line.add(aa);
                    if (aa.length() > widest) widest = aa.length();

                    next.add(node.left);
                    next.add(node.right);

                    if (node.left != null) nn++;
                    if (node.right != null) nn++;
                }
            }

            if (widest % 2 == 1) widest++;

            lines.add(line);

            List<Node> tmp = level;
            level = next;
            next = tmp;
            next.clear();
        }

        int perpiece = lines.get(lines.size() - 1).size() * (widest + 4);
        for (int i = 0; i < lines.size(); i++) {
            List<String> line = lines.get(i);
            int hpw = (int)Math.floor(perpiece / 2f) - 1;


            // Print the nodes of the current line
            for (int j = 0; j < line.size(); j++) {
                String f = line.get(j);
                if (f == null) f = "";
                int gap1 = (int)Math.ceil(perpiece / 2f - f.length() / 2f);
                int gap2 = (int)Math.floor(perpiece / 2f - f.length() / 2f);

                // Spaces before the node
                for (int k = 0; k < gap1; k++) {
                    System.out.print(" ");
                }

                System.out.print(f);

                // Spaces after the node
                for (int k = 0; k < gap2; k++) {
                    System.out.print(" ");
                }
            }
            System.out.println();

            perpiece /= 2;
        }
    }

    private int getHeight(Node node) {
        if (node == null) {
            return 0;
        }
        return 1 + Math.max(getHeight(node.left), getHeight(node.right));
    }
}
