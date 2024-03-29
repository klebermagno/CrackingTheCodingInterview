package com.klebermagno.code.cap4.tree;

import com.klebermagno.code.cap4.tree.BinaryNode;

import java.util.ArrayList;
import java.util.List;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

//inorder tranversal Left current right
public class Transversal {
    public List<Integer> inorderTraversal(BinaryNode root) {
        List<Integer> list = new ArrayList<>();
        if(root !=null){

            return inorderTraversal(root,list);

        }
        return list;
    }
    private List<Integer> inorderTraversal(BinaryNode root, List<Integer> list) {
        if(root !=null){
            inorderTraversal(root.left,list);
            list.add(root.val);
            inorderTraversal(root.right,list);
        }
        return list;

    }
}