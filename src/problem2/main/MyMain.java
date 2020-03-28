/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:15 PM
 */
package problem2.main;
import problem2.mybst.MyBinarySearchTree;
// executable class
// use problem1.mybst.MyBinarySearchTree class for creating binary tree
public class MyMain {
      public static void main(String[] args) {
        MyBinarySearchTree mst=new MyBinarySearchTree();
        mst.insert(200);
        mst.insert(10);
        mst.insert(300);
        mst.insert(100);
        mst.insert(150);
        mst.insert(30);
        mst.insert(50);
        System.out.println("PreOrder Traversal : ");
        mst.traversePreOrder();
        System.out.println("InOrder Traversal : ");
        mst.traverseInOrder();
        System.out.println("PostOrder Traversal : ");
        mst.traversePostOrder();
        System.out.println("Condition A : Root element is placed at opposite end," +"\n"+
                "i.e. in pre order root is the first element where as in post order root is the last element. is TRUE");
        System.out.println("Condition B :They have common mid point,\n"+
                "i.e. both the traversal will give same element at the mid position for odd number of nodes. is TRUE");
    }
}


