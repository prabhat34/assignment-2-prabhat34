/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:08 PM
 */
package problem4.main;
// executable class
// use problem1.mybst.MyBinarySearchTree class for creating binary tree
import problem4.myqueue.MyQueue;
import problem1.mybst.MyBinarySearchTree;
public class MyMain {
   public static void main(String[] args) {
        MyBinarySearchTree mst=new MyBinarySearchTree();
        mst.insert(40);
        mst.insert(50);
        mst.insert(40);
        mst.insert(50);
        mst.insert(70);
        mst.insert(90);
        mst.insert(10);
        mst.insert(50);
        mst.insert(60);
        System.out.println("PreOrder Traversal : ");
        mst.traversePreOrder();
        MyQueue queue = new MyQueue();
        queue.storePreOrderSuccessor(mytree);
        queue.display();
    }
}
