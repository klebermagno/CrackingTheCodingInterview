package com.klebermagno.code.cap4;

/**
 * search a tree is to do a breadth-first search (BFS). In a BFS you start with the root,
 * move left to right across the second level, then move left to right across the third level, and so forth.
 * You continue the search until either you have examined all the nodes or you find the node you are
 *
 * uses additional memory because it is necessary to track the child nodes for all
 * nodes on a given level while searching that level.
 */
public class BreadthFirstSearch {

    /**
     * 1 void search(Node root) {
     * 2 Queue queue = new Queue();
     * 3 root.marked= true;
     * 4 queue.enqueue(root); // Add to the end of queue
     * 5
     * 6 while (!queue.isEmpty()) {
     * 7 Node r = queue.dequeue(); // Remove from the front of the queue
     * 8 visit(r);
     * 9 foreach (Node n in r.adjacent) {
     * 10 if (n.marked == false) {
     * 11 n. marked = true;
     * 12 queue.enqueue(n);
     * 13 }
     * 14 }
     * 15 }
     * 16 }
     * If you are
     */
    public void search(){}
}
