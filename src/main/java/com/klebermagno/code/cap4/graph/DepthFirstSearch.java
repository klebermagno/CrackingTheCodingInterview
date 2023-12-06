package com.klebermagno.code.cap4.graph;

/**
 * search follows one branch of the tree down as many levels as possible until the target node is found
 * or the end is reached. When the search can’t go down any farther, it is continued at the nearest
 * ancestor with unexplored children.
 *
 * lower memory requirements than BFS because it is not necessary to store all the child
 * pointers at each level.
 */
public class DepthFirstSearch {

    /**
     * The pseudocode below implements DFS.
     * 1 void search(Node root) {
     * 2 if (root== null) return;
     * 3 visit(root);
     * 4 root.visited= true;
     * 5 for each (Node n in root.adjacent) {
     * 6 if (n.visited == false) {
     * 7 search(n);
     * 8 }
     * 9 }
     * 10 }
     */
    public void search(){}
}
