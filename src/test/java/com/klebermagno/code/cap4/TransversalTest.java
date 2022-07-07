package com.klebermagno.code.cap4;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class TransversalTest {

    @Test
    public void inorderTraversal() {

        List integerList = Arrays.asList( new Integer[] { 1, 3, 2 });
        Transversal transversal = new Transversal();
        BinaryNode binaryNode = new BinaryNode();
        binaryNode.val=1;
        binaryNode.right = new BinaryNode(2);
        binaryNode.right.left = new BinaryNode(3);
        List list = transversal.inorderTraversal(binaryNode);
        assertArrayEquals(list.toArray(),integerList.toArray());
    }
}