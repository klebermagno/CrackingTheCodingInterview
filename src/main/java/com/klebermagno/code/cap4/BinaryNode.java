package com.klebermagno.code.cap4;

public class BinaryNode {

    public BinaryNode left;
    public BinaryNode right;
    public int val;

    public BinaryNode() {}
    public BinaryNode(int val) {
        this.val = val;
    }

    public BinaryNode(int val, BinaryNode left, BinaryNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }

}
