package _09_CollectionsFramework;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueDemo {
    void main(){
        Queue<Integer> queue = new PriorityQueue<>();
        queue.offer(10);
        queue.offer(30);
        queue.offer(30);
        queue.offer(40);

//        queue.poll(); // Remove Element
//        System.out.println(queue.peek());

//        Queue<Integer> maxPq = new PriorityQueue<>(Collections.reverseOrder());
        Queue<Integer> maxPq = new PriorityQueue<>((a,b) -> b - a);
        maxPq.offer(10);
        maxPq.offer(30);
        maxPq.offer(30);
        maxPq.offer(40);
        System.out.println(maxPq.peek());
    }
}
