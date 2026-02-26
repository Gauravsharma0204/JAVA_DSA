package _09_CollectionsFramework;

import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {
    void main(){
        Queue<Integer> queue = new LinkedList<>();
//      Add Elements
        queue.offer(10);
        queue.offer(20);
        queue.offer(30);
        queue.offer(40);
        queue.offer(50);
        System.out.println(queue);

//      Return first Element
        System.out.println(queue.peek());

//      Remove the Elements from Top
        queue.poll();
        System.out.println(queue);

//      Using Loop
        for (Integer i : queue){
            System.out.println(i);
        }
    }
}
