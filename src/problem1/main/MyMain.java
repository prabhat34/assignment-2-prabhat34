/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:17 PM
 */
package problem1.main;
// executable class

public class MyMain {
    MyBinarySearchTree mst = new MyBinarySearchTree();
            mst.insert(50);
            mst.insert(30);
            mst.insert(20);
            mst.insert(40);
            mst.insert(70);
            mst.insert(60);
            mst.insert(80);
            mst.insert(90);
            mst.insert(10);
            System.out.println("PreOrder Traversal : ");
            mst.traversePreOrder();
            System.out.println("Left children Only : ");
            //traverseLeft() methods prints all left children as well as returns the no of nodes not having left a child
            System.out.println("No of nodes not having Left Subchild: " + mst.traverseLeft());

        }
}
