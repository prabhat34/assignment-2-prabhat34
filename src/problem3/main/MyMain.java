/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:13 PM
 */
package problem3.main;
// executable class
// use problem5.student.Student class to create object of student

import problem3.myqueue.MyPriorityQueue;
import problem5.student.Student;
public class MyMain {
   public static void main(String[] args) {
        MyPriorityQueue queue = new MyPriorityQueue();
        queue.enqueue(new Student(7,"sanal"));queue.display();
        queue.enqueue(new Student(2,"vishal"));queue.display();
        queue.enqueue(new Student(3,"indrashekhar"));queue.display();
        queue.enqueue(new Student(5,"prabhat"));queue.display();
        queue.enqueue(new Student(1,"harsh"));queue.display();
        queue.enqueue(new Student(6,"yash"));queue.display();
        queue.enqueue(new Student(4,"kalash"));queue.display();
        System.out.println(queue.poll().getStudent() + " polled");queue.display();
        System.out.println(queue.poll().getStudent() + " polled");queue.display();
        System.out.println(queue.poll().getStudent() + " polled");queue.display();
        System.out.println(queue.poll().getStudent() + " polled");queue.display();
        System.out.println("The Size Queue is = " + queue.getSize());

    }
}
