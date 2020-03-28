/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:06 PM
 */
package problem5.main;
//executable class
import problem5.circularqueue.MyCircularQueue;
import problem5.student.Student;
import java.util.Random;
public class MyMain {
public static void main(String[] args) {
        Random rand=new Random();
        MyCircularQueue queue = new MyCircularQueue();
        System.out.println("Inserting Students :\n---------------------------");
        queue.enqueue(new Student(31,"prabhat",2,rand.nextInt(2)+1));queue.display();
        queue.enqueue(new Student(32,"sanal",4,rand.nextInt(2)+1));queue.display();
        queue.enqueue(new Student(33,"dhiraj",3,rand.nextInt(2)+1));queue.display();
        queue.enqueue(new Student(34,"kalash",5,rand.nextInt(2)+1));queue.display();
        queue.enqueue(new Student(35,"shikhar",0,rand.nextInt(2)+1));queue.display();
        System.out.println("Processing Elements :\n---------------------------");
        while (queue.processStudents()!=false){
            //Processing Students Until Queue is empty
            //EveryProcess the student clears 1-2 backlogs
        }
        queue.display();
    }
}
